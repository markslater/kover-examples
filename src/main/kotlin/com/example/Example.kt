package com.example

class Example {
    fun myFunction(foo: Foo) = when(foo) {
        Foo.Bar -> "It's Bar"
        Foo.Baz -> "It's Baz"
    }
}

sealed class Foo {
    object Bar: Foo()
    object Baz: Foo()
}