package snoutfy

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SnoutfyBackendApplication

fun main(args: Array<String>) {
	runApplication<SnoutfyBackendApplication>(*args)
}
