package com.freakycyoas.superslut.model.points

operator fun <T: Points> T?.plus(other: T?): T? {
    return when {
        this == null && other == null -> null
        this == null && other != null -> other
        this != null && other == null -> this
        //this != null && other != null
        else -> this!! + other!!
    }
}

val Int.pp
    get() = PowerPoints(this)

val Int.gp
    get() = GoldPoints(this)

val Int.fp
    get() = FatePoints(this)

@JvmName("sumPowerPoints")
fun List<PowerPoints>.sum(): PowerPoints {
    return this.reduceOrNull { acc, item -> acc + item } ?: 0.pp
}

@JvmName("sumOfPowerPoints")
fun <T> List<T>.sumOf(transform: (T) -> PowerPoints): PowerPoints {
    return this.map { transform(it) }.sum()
}

@JvmName("sumGoldPoints")
fun List<GoldPoints>.sum(): GoldPoints {
    return this.reduceOrNull { acc, item -> acc + item } ?: 0.gp
}

@JvmName("sumOfGoldPoints")
fun <T> List<T>.sumOf(transform: (T) -> GoldPoints): GoldPoints {
    return this.map { transform(it) }.sum()
}

@JvmName("sumFatePoints")
fun List<FatePoints>.sum(): FatePoints {
    return this.reduceOrNull { acc, item -> acc + item } ?: 0.fp
}

@JvmName("sumOfFatePoints")
fun <T> List<T>.sumOf(transform: (T) -> FatePoints): FatePoints {
    return this.map { transform(it) }.sum()
}

@JvmName("sortedByPriorityPowerPointsModifierChoice")
fun List<PowerPointsModifierChoice>.sortedByPriority(): List<PowerPointsModifierChoice> {
    return this.sortedByDescending { it.priority }
}

@JvmName("sortedByPriorityGoldPointsModifierChoice")
fun List<GoldPointsModifierChoice>.sortedByPriority(): List<GoldPointsModifierChoice> {
    return this.sortedByDescending { it.priority }
}

@JvmName("sortedByPriorityOutfitGoldPointsModifierChoice")
fun List<OutfitGoldPointsModifierChoice>.sortedByPriority(): List<OutfitGoldPointsModifierChoice> {
    return this.sortedByDescending { it.priority }
}

@JvmName("sortedByPriorityFatePointsModifierChoice")
fun List<FatePointsModifierChoice>.sortedByPriority(): List<FatePointsModifierChoice> {
    return this.sortedByDescending { it.priority }
}
