package com.example

import org.junit.jupiter.api.Test

internal class ExampleTest {
    @Test
    fun `Works with Bar`() {
        Example().myFunction(Foo.Bar, ::println)
    }

    @Test
    fun `Works with Baz`() {
        Example().myFunction(Foo.Baz, ::println)
    }
}