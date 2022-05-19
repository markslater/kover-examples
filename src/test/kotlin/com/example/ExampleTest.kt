package com.example

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ExampleTest {
    @Test
    fun `Handles non-null value`() {
        assertEquals(Example().nullableToString("Foo"), "Foo")
    }

    @Test
    fun `Handles null value`() {
        assertEquals(Example().nullableToString(null), "null")
    }
}