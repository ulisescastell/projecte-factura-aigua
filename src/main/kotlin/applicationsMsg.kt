
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
    println("##################################################$RESET")
    println("# Quota fixa: $BLUE_BOLD$fixedFee$RESET EUR             ")
    println("# Consum: $BLUE_BOLD$consumedLiters$RESET litros        ")
    println("# Cost aigua: $BLUE_BOLD${roundFloat(waterPrice)}$RESET EUR        ")
    if (haveUSocialBonus) {
        println("# ${GREEN_BOLD}BONUS SOCIAL APLICAT: -80%$RESET           ")
    } else {
        println("# ${RED_BOLD}Sense descompte per bonus social$RESET                 ")
        if (areULongFamily != 3.0f) {
            println("# ${GREEN_BOLD}Descompte familiar: ${100 - (areULongFamily * 100)}$$RESET% ")
        } else {
            println("# ${RED_BOLD}Sense descompte familiar${RESET}            ")
        }
    }
    println("$WHITE_BOLD--------------------------------------------------$RESET")
    println("$YELLOW_BOLD# Cost total: ${roundFloat(finalPrice)} EUR          ")
    println("##################################################$RESET")
}



