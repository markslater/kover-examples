package com.example

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ExampleTest {
    @Test
    fun `Adds arguments`() {
        val firstTerm = aSmallInt()
        val secondTerm = aSmallInt()
        assertEquals(Example().add(firstTerm, secondTerm), firstTerm + secondTerm)
    }
}