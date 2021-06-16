# Micronaut + Kotlin

## Related Artice
> Future Work

## Overview
This repository aim to present, by example, some core concepts around Micronaut and Kotlin such as:
- Coroutines
- Inversion of Control (IoC)
- Non-Blocking HTTP
- HTTP Client/Server
- Exception Handler

Additionally, other concepts related to Software Engineering are addressed such as:
- Mapped Diagnostic Context (MDC)
- Aspect-Oriented Programming (AOP)

## Strucutre
- `client-sample`: provides a HTTP client example to be consumed by `server-sample`
- `server-sample`: provides the concepts previously mentioned about Micronaut, Kotlin and general Software Engineering

# Run
To be able to run, just execute the following commands inside `server-sample` and `client-sample`:
```bash
mvn clean package
mvn exec:exec
```
> It's necessary to install Maven and Java >= 11. 
> Alterntively, it's possible to use an IDE to run the project.

# References
- [Micronaut User Guide](https://docs.micronaut.io/2.4.0/guide/index.html)
- [Native Images](https://www.graalvm.org/reference-manual/native-image/)
- [Next Generation Java as Native Image](https://medium.com/pradpoddar/next-generation-java-as-native-image-cf307846de06)
- [Back-end GraalVM: Virtual Machine rápida, poliglota e Cloud Native](https://www.zup.com.br/blog/graalvm)
- [Improving perfomance of GraalVM native images with profile-guided optimizations](https://medium.com/graalvm/improving-performance-of-graalvm-native-images-with-profile-guided-optimizations-9c431a834edb#:~:text=The%20Native%20Image%20takes%20the,contained%20executable%20file%20as%20output.&text=Another%20benefit%20of%20ahead%20of%20time%20compilation%20is%20lower%20memory%20consumption)
- [Improved Java Logging with Mapped Diagnostic Context (MDC)](https://www.baeldung.com/mdc-in-log4j-2-logback)
- [Chapter 8: Mapped Diagnostic Context](http://logback.qos.ch/manual/mdc.html)
- [Kotlin Documentation](https://kotlinlang.org/docs/getting-started.html)