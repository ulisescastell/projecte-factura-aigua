import java.util.*

var fixedFee:Double = 6.0

fun calculateConsumptionWater (consumption: Double): Double {
    val mediumConsumptionFee:Double = 0.15
    val highConsumptionFee:Double = 0.3

    if (consumption in 50.0..200.0) {
        consumption*mediumConsumptionFee
    }
    if (consumption > 200) {
        consumption*highConsumptionFee
    }
    return consumption
}

fun areYouLargeFamily () {
    val familyOption = readInt("Ets familia nombrosa(1), monomarental(2)? No perteneixc a cap(3)", pMessageErrorDT = "Input incorrecte")
    if (familyOption == 1 || familyOption == 2) {
        val numOfFamilyMembers = readInt("Perfecte! Tens descompte. De quants de membres estem parlant?", pMessageErrorDT = "Input incorrecte")
        when (numOfFamilyMembers) {

        }
}
}

fun socialBonus () {
    val bool = readBoolean("Tens algun bonus social?", "resposta incorrecte")
    if (bool == true) {
        val consumptionPlusSocialBonus = (calculateConsumptionWater(200.0) * 80) / 100
        println(consumptionPlusSocialBonus)
        fixedFee = 3.0
        println(fixedFee)

    }

}




