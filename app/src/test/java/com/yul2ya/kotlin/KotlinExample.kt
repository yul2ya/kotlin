package com.yul2ya.kotlin

import org.junit.Test
import java.util.*

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

    fun test(args: Array<String> = arrayOf()) {
        val name = if (args.size > 0) args[0] else "Kotlin"
        println("Hello, $name!")
    }

    @Test
    fun testRangeTo() {
        val n = 9
        println(0..n + 1)
        println((0..(n + 1)).toString())
        (0..(n + 1)).forEach { print(it) }
        println()
        (0 until n + 1).forEach { print(it) }
    }

    @Test
    fun testIterator() {

    }

    @Test
    fun testLambda() {
        processTheAnswer { number -> number + 1 }
    }

    fun processTheAnswer(f: (Int) -> Int) {
        println(f(42))
    }

    @Test
    fun decideTeam() {
        var heroes = arrayListOf<String>("홍재권", "구남도", "김성율", "김문호", "김윤규", "장창우")
        val random = Random()
        for(i in 0..2) {
            var pick = random.nextInt(heroes.size)
            println(heroes[pick])
            heroes.removeAt(pick)
        }
        println("vs")
        for(i in heroes) {
            println(i)
        }
    }
}