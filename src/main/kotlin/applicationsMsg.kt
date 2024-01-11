
/**
 * This method can be used to print a welcome messagebox
 * @author ulisescastell
 * @since 11/01/2024
 */
fun showMenu() {
    val str = CYAN_BOLD + """
    |##################################################
    |#                                                #
    |#      Benvingut a la factura de l'aigua         #
    |#                                                #
    |##################################################
    """.trimMargin() + RESET
    println(str)
}

/**
 * This method can be used to print a sorted menu of items
 * @author ulisescastell
 * @since 11/01/2024
 * @param finalPrice Input float used to call function totalConsumption
 * @param waterPrice Input float used to call function waterConsumption
 * @param consumedLiters Input float to call function consumption
 * @param haveUSocialBonus Input boolean to call function hasSocialBonus
 * @param areULongFamily Input float used to call function largeFamilyDiscount
 */
fun showFinalInvoice(finalPrice: Float, waterPrice: Float, consumedLiters: Float, haveUSocialBonus: Boolean, areULongFamily: Float) {

    println("$YELLOW_BOLD##################################################")
    println("#        AQUÍ ESTÁ LA TEVA FACTURA               #")
    println("##################################################")
    println("# Cost total: ${roundFloat(finalPrice)} EUR          ")
    println("# Quota fixa: $fixedFee EUR             ")
    println("# Consum: $consumedLiters litros        ")
    println("# Cost aigua: ${roundFloat(waterPrice)} EUR        ")
    if (haveUSocialBonus) {
        println("# BONUS SOCIAL APLICAT: -80%           ")
    } else {
        println("# Sense descompte per bonus social                 ")
        if (areULongFamily != 3.0f) {
            println("# Descompte familiar: ${100 - (areULongFamily * 100)}% ")
        } else {
            println("# Sense descompte familiar             ")
        }
    }
    println("##################################################$RESET")
}



