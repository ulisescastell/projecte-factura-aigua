var fixedFee:Float = 6.0f

fun calculateConsumptionWater(consumption: Float): Float {
    val mediumConsumptionFee:Float = 0.15f
    val highConsumptionFee:Float = 0.3f
    if (consumption < 50.0) {
        return 0f
    }
    if (consumption in 50.0..200.0) {
        return consumption*mediumConsumptionFee
    }
    return consumption*highConsumptionFee
}

fun calculateLargeFamily (): Float {
    var discount = 1f
    val familyOption = readInt(
        "Ets familia nombrosa(1), monomarental(2) o no perteneixes a cap(3)",
        pMessageErrorDT = "Input incorrecte",
        "Valor incorrecte, has d'introduïr un nombre comprès entre 1 i 3.",
        1,
        3

    )
    if (familyOption == 2) {
        val numOfFamilyMembers = readInt(
            "Perfecte! Tens descompte. De quants membres estem parlant?",
            pMessageErrorDT = "Input incorrecte",
            "Valor massa petit. Has d'introduïr un nombre no inferior a 2.",
            2
        )
        discount = when (numOfFamilyMembers) {
            1 -> 0.9f
            2 -> 0.8f
            3 -> 0.7f
            4 -> 0.6f
            else -> 0.5f
        }
    }
    if (familyOption == 1) {
        return 0.5f
    }
    return discount
}

fun socialBonus(consumption: Float, socialBonus: Boolean): Float {
    if (socialBonus) {
        fixedFee = 3.0f
        return 0.2f
    }
    return 1f
}







