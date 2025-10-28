package fuel.car

import java.math.BigDecimal

class Avante(
    private val travelingDistance: Int
) : Car(
    travelingDistance = Distance(kilometer = BigDecimal(travelingDistance))
) {
    override val fuelEfficiency: FuelEfficiency
        get() = FuelEfficiency(
            kilometerPerLiter = BigDecimal(15)
        )
    override val carName: String
        get() = "Avante"
}