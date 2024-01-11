import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MainFunctionsKtTest {

    //per a funció calculateConsumptionWater
    @Test
    fun checkMediumConsumption() {
        val expected = 100f * 0.15f
        assertEquals(expected, calculateConsumptionWater(100f), 0.0f)
    }
    @Test
    fun checkHighConsumption() {
        assertTrue(calculateConsumptionWater(250f) == 250f * 0.3f)
    }


}