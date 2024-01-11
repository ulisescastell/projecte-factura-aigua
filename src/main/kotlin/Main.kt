import kotlin.math.roundToInt

fun main() {
    showMenu()
    val consumption = readFloat("$BLUE_BOLD Introdueix el consum d'aigua mensual: $RESET", "$RED Resposta incorrecte $RESET", "$RED Valor massa petit. Has d'introduïr un nombre no inferior a 0. $RESET", 0.0f)
    var totalConsumption:Float = 0.0f
    var waterConsumption:Float = 0.0f
    var hasSocialBonus:Boolean = false
    var largeFamilyDiscount:Float = 3.0f
    if (consumption >= 50) {
        waterConsumption = calculateConsumptionWater(consumption)
        hasSocialBonus = readBoolean("$BLUE_BOLD Tens algun bonus social? Respon $GREEN_BOLD true $RESET $BLUE en cas afirmatiu i $RESET $RED_BOLD false $RESET $BLUE en cas negatiu. $RESET", "$RED Resposta incorrecte $RESET")
        val socialBonusDiscount = socialBonus(consumption, hasSocialBonus)
        if (!hasSocialBonus) {
            largeFamilyDiscount = calculateLargeFamily()
            totalConsumption += waterConsumption * largeFamilyDiscount
        }
        else {
            totalConsumption += waterConsumption * socialBonusDiscount
        }
    }
    totalConsumption += fixedFee
    showFinalInvoice(finalPrice = totalConsumption, waterPrice = waterConsumption, consumedLiters = consumption, haveUSocialBonus = hasSocialBonus, areULongFamily = largeFamilyDiscount )
}


