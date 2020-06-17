package com.nelkinda.minkrest

import org.junit.Test
import org.junit.jupiter.api.assertThrows
import java.time.DayOfWeek.SUNDAY
import java.time.LocalDate

class AssertionsTest {
    private fun String.`is a Sunday`() = LocalDate.parse(this).dayOfWeek == SUNDAY

    @Test
    fun `assertThis success`() {
        assertThis("2020-01-05") { `is a Sunday`() }
    }

    @Test
    fun `assertThis failure`() {
        val dayOfWeek = LocalDate.parse("2020-01-03").dayOfWeek
        assertThrows<AssertionError> {
            assertThis(dayOfWeek) { equals(SUNDAY) }
        }
    }

    @Test
    fun `assertThat success`() {
        assertThat("2020-01-05") { it.`is a Sunday`() }
    }

    @Test
    fun `assertThat failure`() {
        assertThrows<AssertionError> {
            assertThat("2020-01-03") { it.`is a Sunday`() }
        }
    }

    @Test
    fun `assertThese success`() {
        assertThese("2020-01-05", "2020-01-12") { `is a Sunday`() }
    }

    @Test
    fun `assertThese failure`() {
        assertThrows<AssertionError> {
            assertThese("2020-01-05", "2020-01-06") { `is a Sunday`() }
        }
    }

    @Test
    fun `assertThose success`() {
        assertThose("2020-01-05", "2020-01-12") { it.`is a Sunday`() }
    }

    @Test
    fun `assertThose failure`() {
        assertThrows<AssertionError> {
            assertThose("2020-01-05", "2020-01-06") { it.`is a Sunday`() }
        }
    }
}