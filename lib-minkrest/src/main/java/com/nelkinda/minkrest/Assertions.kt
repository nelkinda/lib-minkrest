package com.nelkinda.minkrest

import org.junit.jupiter.api.assertAll
import kotlin.test.assertTrue

fun <T> assertThis(t: T, predicate: T.() -> Boolean) =
        assertTrue(t.predicate())

fun <T> assertThat(t: T, predicate: (T) -> Boolean) =
        assertTrue(predicate(t))

fun <T> assertThese(vararg t: T, predicate: T.() -> Boolean) =
        assertAll(t.map { { assertTrue(it.predicate()) } })

fun <T> assertThose(vararg t: T, predicate: (T) -> Boolean) =
        assertAll(t.map { { assertTrue(predicate(it)) } })
