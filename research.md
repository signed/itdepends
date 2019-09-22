# [legend](https://emojipedia.org)
* 🔖: bookmark
* 📕: not looked at yet
* 👓🤓🕵️: looking at
* 📖: already looked at
* 📦: library
* 📹: video

# People
## Greg Young - Event Sourcing, CQRS, DDD
Read about him in another blog posts, there are recordings of talks he gave.

## [daniel whittaker](http://danielwhittaker.me/)
Looked at some of his blog posts
- 📖 [CQRS + Event Sourcing – A Step by Step Overview](http://danielwhittaker.me/2014/10/02/cqrs-step-step-guide-flow-typical-application/)
- 📖 [6 code smells cqrs events avoid/](http://danielwhittaker.me/2014/10/18/6-code-smells-cqrs-events-avoid/)

## [Matt Walters](https://github.com/mateodelnorte)
## 📖📹 [2016 Matt Walters - How to CQRS in Node: Eventually Consistent, Unidirectional Systems with Microservices](https://www.youtube.com/watch?v=4k7bLtqXb8c)
- good overall introduction
- Uses the order example in his talk
- the choreography of the dance not the orchestration
- `order.create` command name example
- rabbitmq used as a command event distribution mechanism
- 16000 Event names because of sharding e.g. `order.create.northamerica` `order.create.europe` to scale the services if needed

### libraries mentioned
- 📕[servicebus](https://www.npmjs.com/package/servicebus): simple service bus for sending events between processes using amqp. Allows for send/receive and publish/subscribe pattern messaging over RabbitMQ.
  - code examples with explanations
  - middleware for different aspects (correlation ids, retry, ...)
- 📕[sourced](https://www.npmjs.com/package/sourced):  Tiny framework for building models with the event sourcing pattern.



# Talks
## 📖 [How To Combine Event Sourcing Architecture In Your Node.js Server | Tamar Twena-Stern](https://www.youtube.com/watch?v=eOqgg0xmG3w)
### libraries mentioned
- 📕 [eventstore](https://www.npmjs.com/package/eventstore): The project goal is to provide an eventstore implementation for node.js
- 📕 [@nestjs/cqrs](https://www.npmjs.com/package/@nestjs/cqrs): A lightweight CQRS module for Nest framework

# web
- 📕https://cqrs.nu/
- 📖 [Teiva Harsanyi: 1 Year of Event Sourcing and CQRS](https://hackernoon.com/1-year-of-event-sourcing-and-cqrs-fb9033ccd1c6)
  - This is about the Air Traffic Management example
  - some links to other people at the end and in text

