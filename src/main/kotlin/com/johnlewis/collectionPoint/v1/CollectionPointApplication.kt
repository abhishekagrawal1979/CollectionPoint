package com.johnlewis.collectionPoint.v1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class CollectionPointApplication{

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            runApplication<CollectionPointApplication>(*args)
        }

    }
}


