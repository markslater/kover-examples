package com.example

class Example {
    fun myFunction(foo: Foo, callback: (String) -> Unit) {
        when(foo) {
            Foo.Bar -> {
                callback("It's Bar")
            }
            Foo.Baz -> {
                callback("It's Baz")
            }
        }
    }
}

sealed class Foo {
    object Bar: Foo()
    object Baz: Foo()
}