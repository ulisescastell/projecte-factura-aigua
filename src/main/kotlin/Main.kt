import kotlin.math.roundToInt

/**
 * @author ulises_castell
 */

fun main() {
    showMenu()
    val consumption = readFloat("Introdueix el consum d'aigua mensual", "resposta incorrecte")
    calculateConsumptionWater(consumption)
    val hasSocialBonus = readBoolean("Tens algun bonus social? Respon true en cas afirmatiu i false en cas negatiu", "resposta incorrecte")
    socialBonus(consumption, hasSocialBonus)
    if (!hasSocialBonus) {
        calculateLargeFamily()
    }
    println("Has de pagar $fixedFee EUR de quota fixa.")
}


