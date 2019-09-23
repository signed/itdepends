# [legend](https://emojipedia.org)
* 🔖: bookmark
* 📕: Book (something to read)
* 🔭: not looked at yet
* 👓🤓🕵️: looking at
* 📖: already looked at
* 📦: library
* 📹: video

# People
## Greg Young - Event Sourcing, CQRS, DDD
Read about him in another blog posts, there are recordings of talks he gave.

- 🔭 [Versioning in an Event Sourced System](https://leanpub.com/esversioning)


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
- 🔭[servicebus](https://www.npmjs.com/package/servicebus): simple service bus for sending events between processes using amqp. Allows for send/receive and publish/subscribe pattern messaging over RabbitMQ.
  - code examples with explanations
  - middleware for different aspects (correlation ids, retry, ...)
- 🔭[sourced](https://www.npmjs.com/package/sourced):  Tiny framework for building models with the event sourcing pattern.


## [Vaughn Vernon](https://twitter.com/VaughnVernon)

- 🔭 [Effective Aggregate Design](https://dddcommunity.org/library/vernon_2011/)
- 🔭 [really simple cqrs](https://kalele.io/really-simple-cqrs/)

# Talks
## 📖 [How To Combine Event Sourcing Architecture In Your Node.js Server | Tamar Twena-Stern](https://www.youtube.com/watch?v=eOqgg0xmG3w)
### libraries mentioned
- 🔭 [eventstore](https://www.npmjs.com/package/eventstore): The project goal is to provide an eventstore implementation for node.js
- 🔭 [@nestjs/cqrs](https://www.npmjs.com/package/@nestjs/cqrs): A lightweight CQRS module for Nest framework

## 🕵📹 [Event Sourcing - You are doing it wrong (DE/GER)](https://www.youtube.com/watch?v=2IoinhMv6Aw)
- event streams
- Gregory Young: Pope of event sourcing
- 🔭📦 https://github.com/adrai/node-eventstore
- 🔭📦 [eventstore](https://eventstore.org/)

# web
- 🔭📕 https://cqrs.nu/
- 📖📕 [Teiva Harsanyi: 1 Year of Event Sourcing and CQRS](https://hackernoon.com/1-year-of-event-sourcing-and-cqrs-fb9033ccd1c6)
  - This is about the Air Traffic Management example
  - some links to other people at the end and in text

# Books
- 🔭📕 [Exploring CQRS and Event Sourcing](https://www.amazon.com/Exploring-CQRS-Event-Sourcing-maintainability)
- 🔭📕 [The dark side of event sourcing: Managing data conversion](https://www.researchgate.net/publication/315637858_The_dark_side_of_event_sourcing_Managing_data_conversion)
