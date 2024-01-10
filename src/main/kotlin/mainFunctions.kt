var fixedFee:Double = 6.0

fun calculateConsumptionWater(): Float {
    var consumption = readFloat("Introdueix el consum d'aigua mensual", "resposta incorrecte")
    val mediumConsumptionFee:Float = 0.15f
    val highConsumptionFee:Float = 0.3f
    if (consumption < 50.0) {
        consumption = 0f
    }
    if (consumption in 50.0..200.0) {
        consumption*=mediumConsumptionFee
    }
    if (consumption > 200) {
        consumption*=highConsumptionFee
    }
    return consumption
}

fun calculateLargeFamily () {
    val familyOption = readInt(
        "Ets familia nombrosa(1), monomarental(2)? No perteneixc a cap(3)",
        pMessageErrorDT = "Input incorrecte"
    )
    if (familyOption == 1 || familyOption == 2) {
        val numOfFamilyMembers = readInt(
            "Perfecte! Tens descompte. De quants de membres estem parlant?",
            pMessageErrorDT = "Input incorrecte"
        )
        when (numOfFamilyMembers) {
            1 ->
        }
    }
}

/*fun socialBonus () {
    val bool = readBoolean("Tens algun bonus social?", "resposta incorrecte")
    if (bool) {
        val consumptionPlusSocialBonus = (calculateConsumptionWater(200.0f) * 80) / 100
        println(consumptionPlusSocialBonus)
        fixedFee = 3.0
        println(fixedFee)

    }

}


*/
