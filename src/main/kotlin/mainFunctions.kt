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