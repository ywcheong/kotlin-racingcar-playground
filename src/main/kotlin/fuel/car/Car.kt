package fuel.car

import java.math.BigDecimal

abstract class Car (
    private val travelingDistance: Distance
) {
    abstract val fuelEfficiency: FuelEfficiency
    abstract val carName: String

    fun getConsumingFuelAmount() = Fuel(
        liter = travelingDistance.kilometer / fuelEfficiency.kilometerPerLiter
    )

    data class FuelEfficiency(
        val kilometerPerLiter: BigDecimal
    )

    data class Fuel(
        val liter: BigDecimal
    )

    data class Distance(
        val kilometer: BigDecimal
    )
}