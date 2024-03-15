package com.thoughtworks.assignment

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AssignmentTest {
    @Test
    fun `should return A when both startNums and resNums are 1`() {
        assertEquals(getSequenceList(1, 1), arrayListOf("A"))
    }

    @Test
    fun `should return A,B when startNums 1 resNums 2`() {
        assertEquals(getSequenceList(1, 2), arrayListOf("A","B"))
    }

    @Test
    fun `should return Z,AA,AB when startNums 26 resNums 3`() {
        assertEquals(arrayListOf("Z", "AA", "AB"), getSequenceList(26, 3))
    }
}