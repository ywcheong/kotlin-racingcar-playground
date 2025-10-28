package fuel.car

import java.math.BigDecimal

class Sonata(
    private val travelingDistance: Int
) : Car(
    travelingDistance = Distance(kilometer = BigDecimal(travelingDistance))
) {
    override val fuelEfficiency: FuelEfficiency
        get() = FuelEfficiency(
            kilometerPerLiter = BigDecimal(10)
        )
    override val carName: String
        get() = "Sonata"
}