package com.example

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ExampleTest {
    @Test
    fun `Adds arguments`() {
        assertEquals(Example().add(1, 2), 3)
    }
}