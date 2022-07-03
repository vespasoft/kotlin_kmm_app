package com.example.examplekmmapp

class Greeting {
    fun greeting(): String {
        return "Hello world!, ${Platform().platform}!"
    }
}