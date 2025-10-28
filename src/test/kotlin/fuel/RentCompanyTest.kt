package fuel

import fuel.car.Avante
import fuel.car.K5
import fuel.car.Sonata
import io.kotest.matchers.equals.shouldBeEqual
import org.junit.jupiter.api.Test

class RentCompanyTest {
    @Test
    fun report() {
        val company: RentCompany = RentCompany.create()
        company.addCar(Sonata(150))
        company.addCar(K5(260))
        company.addCar(Sonata(120))
        company.addCar(Avante(300))
        company.addCar(K5(390))

        val report: String = company.generateReport()
        report shouldBeEqual buildString {
            appendLine("Sonata : 15리터")
            appendLine("K5 : 20리터")
            appendLine("Sonata : 12리터")
            appendLine("Avante : 20리터")
            append("K5 : 30리터")
        }
    }
}