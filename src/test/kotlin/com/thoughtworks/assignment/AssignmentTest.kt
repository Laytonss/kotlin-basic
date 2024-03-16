package com.thoughtworks.assignment

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

class AssignmentTest {
    @Test
    fun `should return A when both startNums and resNums are 1`() {
        assertEquals(getSequenceList(1, 1), arrayListOf("A"))
    }

    @Test
    fun `should return A,B when startNums 1 resNums 2`() {
        assertEquals(getSequenceList(1, 2), arrayListOf("A", "B"))
    }

    @Test
    fun `should return Z,AA,AB when startNums 26 resNums 3`() {
        assertEquals(arrayListOf("Z", "AA", "AB"), getSequenceList(26, 3))
    }

    @Test
    fun `should return ZZZ when startNums 18278 resNums 1`() {
        assertEquals(arrayListOf("ZZZ"), getSequenceList(18278, 1))
    }

    @Test
    fun `should throw Exception when the first result sequence are ZZZ`() {
        assertThrows<IndexOutOfBoundsException> {
            getSequenceList(18279, 1)
        }
    }

    @Test
    fun `should throw Exception when the result list out of ZZZ`() {
        assertThrows<IndexOutOfBoundsException> {
            getSequenceList(18278, 2)
        }
    }

}