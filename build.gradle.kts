import org.gradle.api.JavaVersion.*
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    val kotlinVersion = "1.2.21"

    id("org.jetbrains.kotlin.jvm") version kotlinVersion
    id("org.jetbrains.kotlin.plugin.spring") version kotlinVersion
    id("org.springframework.boot") version "2.0.0.M7"
    id("io.spring.dependency-management") version "1.0.3.RELEASE"
    id("org.junit.platform.gradle.plugin") version "1.0.2"
}

group = "com.github.signed.itdepends"
version = "0.0.1-SNAPSHOT"


repositories {
    mavenCentral()
    maven("https://repo.spring.io/snapshot")
    maven("https://repo.spring.io/milestone")
}

tasks.withType<KotlinCompile> {
    sourceCompatibility = "1.8"
    kotlinOptions {
        jvmTarget = "1.8"
    }
}


dependencies {
    compile("org.jetbrains.kotlin:kotlin-stdlib-jre8")
    compile("org.jetbrains.kotlin:kotlin-reflect")
    compile("org.springframework.boot:spring-boot-starter-webflux")
    compile("org.springframework.boot:spring-boot-devtools")


    testCompile("io.projectreactor:reactor-test")
    testCompile("org.springframework.boot:spring-boot-starter-test") {
        exclude(module = "junit")
    }
    testCompile("org.junit.jupiter:junit-jupiter-api")
    testRuntime("org.junit.jupiter:junit-jupiter-engine")

}
