import kotlin.math.roundToInt

fun main() {
    showMenu()
    val consumption = readFloat("Introdueix el consum d'aigua mensual: ", "Resposta incorrecte", "Valor massa petit. Has d'introduïr un nombre no inferior a 0.", 0.0f)
    var totalConsumption:Float = 0.0f
    var waterConsumption:Float = 0.0f
    var hasSocialBonus:Boolean = false
    var largeFamilyDiscount:Float = 3.0f
    if (consumption >= 50) {
        waterConsumption = calculateConsumptionWater(consumption)
        hasSocialBonus = readBoolean("Tens algun bonus social? Respon true en cas afirmatiu i false en cas negatiu.", "Resposta incorrecte")
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


