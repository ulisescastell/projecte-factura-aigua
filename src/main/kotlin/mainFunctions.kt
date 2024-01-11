var fixedFee:Double = 6.0

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
    var discount = 0f
    val familyOption = readInt(
        "Ets familia nombrosa(1), monomarental(2) o no perteneixes a cap(3)",
        pMessageErrorDT = "Input incorrecte"
    )
    if (familyOption == 1 || familyOption == 2) {
        val numOfFamilyMembers = readInt(
            "Perfecte! Tens descompte. De quants de membres estem parlant? Et recordo que máxim són 5 i que per tant, el descompte màxim és de 50%.",
            pMessageErrorDT = "Input incorrecte"
        )
        discount = when (numOfFamilyMembers) {
            1 -> 0.1f
            2 -> 0.2f
            3 -> 0.3f
            4 -> 0.4f
            else -> 0.5f
        }
    } else {
    println("D'acord, anem a continuar amb el recompte de dades") }
    return discount
}

fun socialBonus(consumption: Float, socialBonus: Boolean): Float {
    if (socialBonus) {
        consumption * 0.8f
        fixedFee = 3.0
    }
    return consumption
}

fun calculateConsumptionDependigLargeFamily () {

}

fun calculateConsumptionDependingSocialBonus () {

}







