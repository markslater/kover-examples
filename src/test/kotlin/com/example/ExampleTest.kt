package com.example

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ExampleTest {
    @Test
    fun `Works with Bar`() {
        assertEquals(Example().myFunction(Foo.Bar), "It's Bar")
    }

    @Test
    fun `Works with Baz`() {
        assertEquals(Example().myFunction(Foo.Baz), "It's Baz")
    }
}