fun showMenu() {
    val str = PURPLE_BOLD + """
    |##################################################
    |#                                                #
    |#   Benvingut a la factura de l'aigua!           #
    |#                                                #
    |##################################################
    """.trimMargin() + RESET
    println(str)
}

fun showFinalInvoice(finalPrice: Float, waterPrice: Float, consumedLiters: Float, haveUSocialBonus: Boolean, areULongFamily: Float) {

    println("$PURPLE_BOLD########################################")
    println("#        AQUÍ ESTÁ LA TEVA FACTURA     #")
    println("########################################")
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
    println("########################################$RESET")
}



