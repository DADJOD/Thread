package com.example.lib

fun main() {
    println("hello")

    val t1 = MyThread()
    t1.start()

    println("wow")
}

class MyThread : Thread() {
    override fun run() {
        try {
            sleep(2000)
            println("thread")
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
    }
}