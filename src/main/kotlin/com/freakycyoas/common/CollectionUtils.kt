package com.freakycyoas.common

fun <T> List<T>.containsNone(elements: Collection<T>): Boolean {
    return !this.any { elements.contains(it) }
}

fun <T> List<T>.containsAny(elements: Collection<T>): Boolean {
    return this.any { elements.contains(it) }
}

fun <T> List<T>.replace(item: T, with: T): List<T> {
    return this
        .toMutableList()
        .apply { this[indexOf(item)] = with }
        .toList()
}