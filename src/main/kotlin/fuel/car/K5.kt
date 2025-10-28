package fuel.car

import java.math.BigDecimal

class K5(
    private val travelingDistance: Int
) : Car(
    travelingDistance = Distance(kilometer = BigDecimal(travelingDistance))
) {
    override val fuelEfficiency: FuelEfficiency
        get() = FuelEfficiency(
            kilometerPerLiter = BigDecimal(13)
        )
    override val carName: String
        get() = "K5"
}