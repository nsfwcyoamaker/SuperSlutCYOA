package com.freakycyoas.superslut.model.displayable

enum class ShownPointsType(val range: IntRange, val label: String, val sign: String) {
    GAIN(
        range = 0..Int.MAX_VALUE,
        label = "Gain: ",
        sign = "+",
    ),

    COST(
        range = Int.MIN_VALUE..0,
        label = "Cost: ",
        sign = "-",
    );
}