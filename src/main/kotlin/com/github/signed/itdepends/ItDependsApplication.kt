package com.github.signed.itdepends

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.web.reactive.config.EnableWebFlux
import org.springframework.web.reactive.config.WebFluxConfigurer
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.bodyToServerSentEvents
import org.springframework.web.reactive.function.server.router
import reactor.core.publisher.Flux
import reactor.core.publisher.toMono

@SpringBootApplication
@Configuration
@EnableWebFlux
class ItDependsApplication : WebFluxConfigurer {


    interface UpdateListener {
        fun updated(value: String)
    }

    class ForrestUpdateChannel {
        private val listeners = ArrayList<UpdateListener>()

        fun onUpdate(listener: UpdateListener) {
            listeners.add(listener)
        }

        fun remove(listener: UpdateListener) {
            println("before remove:" + listeners.size)
            listeners.remove(listener)
            println("after remove:" + listeners.size)
        }

        fun notifyListeners(value: String) {
            listeners.forEach { it.updated(value) }
        }
    }


    @Bean
    fun forrestUpdateChannel(): ForrestUpdateChannel = ForrestUpdateChannel()


    @Bean
    fun routerFunction(updateChannel: ForrestUpdateChannel): RouterFunction<ServerResponse> = router {

        (accept(APPLICATION_JSON) and "/forrest").nest {
            POST("/") { req ->
                updateChannel.notifyListeners("flup")
                ServerResponse.ok().body(BodyInserters.fromObject("success post"))
            }


            GET("/" ) { req ->
                ServerResponse.ok().bodyToServerSentEvents(Flux.create({ sink ->
                    val updateListener = object : UpdateListener {
                        override fun updated(value: String) {
                            sink.next(value)
                            //sink.complete()
                        }
                    }

                    updateChannel.onUpdate(updateListener)
                    sink.onCancel { updateChannel.remove(updateListener) }
                    sink.next("initial value")
                }))
            }
        }

        ("/hello").nest {
            GET("/") { req ->
                ServerResponse.ok().body(BodyInserters.fromObject("world")).toMono()
            }
        }
    }
}



fun main(args: Array<String>) {
    runApplication<ItDependsApplication>(*args)
}
