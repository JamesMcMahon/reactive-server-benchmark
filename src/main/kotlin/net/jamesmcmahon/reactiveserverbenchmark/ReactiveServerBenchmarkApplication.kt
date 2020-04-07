package net.jamesmcmahon.reactiveserverbenchmark

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ReactiveServerBenchmarkApplication

fun main(args: Array<String>) {
	runApplication<ReactiveServerBenchmarkApplication>(*args)
}
