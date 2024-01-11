
var fixedFee:Float = 6.0f

/**
 * This method can be used to return a price of water depending on how many liters of water have been spent
 * @author ulisescastell
 * @since 11/01/2024
 * @param consumption Input float used to call function totalConsumption
 * @return Returns a float with the price of water multiplicated with the percentage of the consumption fee
 */

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

/**
 * This method can be used to return a percentage based on how many people can are be in a family.
 * @author ulisescastell
 * @since 11/01/2024
 * @return Returns a float with the percentaje of discount that will be used to calculate the total price
 */

fun calculateLargeFamily (): Float {
    var discount = 1f
    val familyOption = readInt(
        "$BLUE_BOLD Ets familia nombrosa(1), monomarental(2) o no perteneixes a cap(3) $RESET",
        pMessageErrorDT = "$RED_BOLD Input incorrecte $RESET",
        "$RED_BOLD Valor incorrecte, has d'introduïr un nombre comprès entre 1 i 3. $RESET",
        1,
        3

    )
    if (familyOption == 2) {
        val numOfFamilyMembers = readInt(
            "$BLUE Perfecte! Tens descompte. De quants membres estem parlant? $RESET",
            pMessageErrorDT = "$RED Input incorrecte $RESET" ,
            "$RED Valor massa petit. Has d'introduïr un nombre no inferior a 2. $RESET",
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

/**
 * This method can be used to return a float with a percentage and changes fixedFee if a person has social bonus or not
 * @author ulisescastell
 * @since 11/01/2024
 * @param consumption Input float used to call function totalConsumption
 * @param socialBonus Input used to if a person has social bonus or not
 * @return Returns a float with the percentage to discount
 */

fun socialBonus(consumption: Float, socialBonus: Boolean): Float {
    if (socialBonus) {
        fixedFee = 3.0f
        return 0.2f
    }
    return 1f
}







