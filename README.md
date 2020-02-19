# Spring Cloud Aliababa 实战与原理源码

Spring Cloud Alibaba 致力于提供微服务开发的一站式解决方案。此项目包含开发分布式应用微服务的必需组件，方便开发者通过 Spring Cloud 编程模型轻松使用这些组件来开发分布式应用服务。

依托 Spring Cloud Alibaba，您只需要添加一些注解和少量配置，就可以将 Spring Cloud 应用接入阿里微服务解决方案，通过阿里中间件来迅速搭建分布式应用系统。

## 主要功能

- **服务限流降级**：默认支持 WebServlet、WebFlux, OpenFeign、RestTemplate、Spring Cloud Gateway, Zuul, Dubbo 和 RocketMQ 限流降级功能的接入，可以在运行时通过控制台实时修改限流降级规则，还支持查看限流降级 Metrics 监控。
- **服务注册与发现**：适配 Spring Cloud 服务注册与发现标准，默认集成了 Ribbon 的支持。
- **分布式配置管理**：支持分布式系统中的外部化配置，配置更改时自动刷新。
- **消息驱动能力**：基于 Spring Cloud Stream 为微服务应用构建消息驱动能力。
- **分布式事务**：使用 @GlobalTransactional 注解， 高效并且对业务零侵入地解决分布式事务问题。。
- **阿里云对象存储**：阿里云提供的海量、安全、低成本、高可靠的云存储服务。支持在任何应用、任何时间、任何地点存储和访问任意类型的数据。
- **分布式任务调度**：提供秒级、精准、高可靠、高可用的定时（基于 Cron 表达式）任务调度服务。同时提供分布式的任务执行模型，如网格任务。网格任务支持海量子任务均匀分配到所有 Worker（schedulerx-client）上执行。
- **阿里云短信服务**：覆盖全球的短信服务，友好、高效、智能的互联化通讯能力，帮助企业迅速搭建客户触达通道。

## 组件

**[Sentinel](https://github.com/alibaba/Sentinel)**：把流量作为切入点，从流量控制、熔断降级、系统负载保护等多个维度保护服务的稳定性。

**[Nacos](https://github.com/alibaba/Nacos)**：一个更易于构建云原生应用的动态服务发现、配置管理和服务管理平台。

**[RocketMQ](https://rocketmq.apache.org/)**：一款开源的分布式消息系统，基于高可用分布式集群技术，提供低延时的、高可靠的消息发布与订阅服务。

**[Dubbo](https://github.com/apache/dubbo)**：Apache Dubbo™ 是一款高性能 Java RPC 框架。

**[Seata](https://github.com/seata/seata)**：阿里巴巴开源产品，一个易于使用的高性能微服务分布式事务解决方案。

**[Alibaba Cloud ACM](https://www.aliyun.com/product/acm)**：一款在分布式架构环境中对应用配置进行集中管理和推送的应用配置中心产品。

**[Alibaba Cloud OSS](https://www.aliyun.com/product/oss)**: 阿里云对象存储服务（Object Storage Service，简称 OSS），是阿里云提供的海量、安全、低成本、高可靠的云存储服务。您可以在任何应用、任何时间、任何地点存储和访问任意类型的数据。

**[Alibaba Cloud SchedulerX](https://help.aliyun.com/document_detail/43136.html)**: 阿里中间件团队开发的一款分布式任务调度产品，提供秒级、精准、高可靠、高可用的定时（基于 Cron 表达式）任务调度服务。

**[Alibaba Cloud SMS](https://www.aliyun.com/product/sms)**: 覆盖全球的短信服务，友好、高效、智能的互联化通讯能力，帮助企业迅速搭建客户触达通道。

## 源码说明

* Dubbo部分的案例代码
  * user-service/order-service 用于dubbo协议通信的模拟
  * spi 分析Dubbo中SPI机制的实现
  * springboot-consumer/springboot-provider，dubbo集成springboot的功能演示
  * spring-cloud-dubbo-consumer/spring-cloud-dubbo-provider，spring cloud dubbo的功能演示
* Spring Boot部分案例代码
  * redis-spring-boot-starter， 基于Spring Boot自动装配手写starter
  * spring -boot-conditional ， spring中的Conditional条件控制
* Nacos作为服务注册发现的案例代码
  * spring-boot-dubbo-nacos-sample，springboot集成dubbo实现服务注册
  * spring-boot-nacos-discovery，springboot集成nacos作为服务消费者
  * spring-cloud-nacos-consumer，spring cloud nacos集成dubbo作为服务消费者
  * spring-cloud-nacos-sample，spring cloud nacos集成dubbo实现服务注册及rpc通信的案例。
* Nacos作为配置中心的案例代码
  * spring-cloud-nacos-config，spring cloud nacos实现配置中心
* Sentinel案例代码
  * spring-cloud-sentinel-dubbo-consumer， spring cloud 集成dubbo实现dubbo服务限流的消费者
  * spring-cloud-sentinel-dubbo-provider,spring cloud 集成dubbo实现dubbo服务限流的服务提供者
  * spring-cloud-sentinel-dynamic-rule，spring cloud sentinel实现动态规则限流。
  * spring-cloud-sentinel-sample，spring cloud sentinel限流的基本使用。
  * sentinel-dashboard，改造过后的sentinel-dashboard，可以实现限流规则的持久化。
* RocketMQ案例代码
  * spring-cloud-rocketmq ， spring cloud 集成rocketmq的案例演示。
* Seata分布式事务解决方案的案例代码。
  * seata-sample。 分布式事务的代码集合。
* Spring Cloud Gateway网关案例代码。
  * spring-cloud-gateway-sample. 网关入口
  * spring-cloud-gateway-service.  作为网关被调用的服务。







