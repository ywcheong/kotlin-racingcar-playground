package fuel

import fuel.car.Car

class RentCompany {
    private val ownedCars: MutableList<Car> = mutableListOf()

    fun addCar(car: Car) {
        ownedCars.add(car)
    }

    fun generateReport(): String = ownedCars.joinToString("\n") { car ->
        "${car.carName} : ${car.getConsumingFuelAmount().liter}리터"
    }

    companion object {
        fun create() = RentCompany()
    }
}
