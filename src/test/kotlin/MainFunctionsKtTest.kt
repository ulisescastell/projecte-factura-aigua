import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MainFunctionsKtTest {

    @Test
    fun checkMediumConsumption() {
        val expected = 100f * 0.15f
        assertEquals(expected, calculateConsumptionWater(100f))
    }

    @Test
    fun checkHighConsumption() {
        assertTrue(calculateConsumptionWater(250f) == 250f * 0.3f)
    }

    @Test
    fun checkSocialBonus() {
        val expectedDiscount = 0.2f
        assertEquals(expectedDiscount, socialBonus(100f, true))

        val expectedFee = 3.0f
        assertEquals(expectedFee, fixedFee)
    }

    @Test
    fun checkSocialBonusWithDifferentConsumption() {
        val expectedDiscount = 0.2f
        assertEquals(expectedDiscount, socialBonus(200f, true))

        val expectedFee = 3.0f
        assertEquals(expectedFee, fixedFee)
    }

    @Test
    fun checkNoSocialBonus() {
        val expectedDiscount = 1f
        assertEquals(expectedDiscount, socialBonus(100f, false))

        val expectedFee = 6.0f
        assertEquals(expectedFee, fixedFee)
    }
}

