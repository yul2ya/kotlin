package com.yul2ya.kotlin

import org.junit.Test

class KotlinExample {

    @Test
    fun userInput() {
        test(arrayOf("Bob"))
    }

    @Test
    fun noInput() {
        test()
    }

    @Test
    fun stringTemplate() {
        var args: Array<String> = arrayOf("Seongyul")
        if (args.size > 0) {
            println("Hello, ${args[0]}!")
        }

        var args2: Array<String> = arrayOf()
        if (args2.size > 0) {
            println("Hello, ${args2[0]}!")
        }
    }

    fun test(args: Array<String> = arrayOf() ) {
        val name = if (args.size > 0) args[0] else "Kotlin"
        println("Hello, $name!")
    }
}