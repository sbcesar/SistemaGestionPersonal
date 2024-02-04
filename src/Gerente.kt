class Gerente(nombre: String, edad: Int, salarioBase: Double, porcentajeImpuestos: Double = 33.99, private var bonus: Double, private var exentoImpuestos: Boolean = false) : Empleado(nombre, edad, salarioBase, porcentajeImpuestos) {

    constructor(nombre: String,edad: Int,salarioBase: Int,porcentajeImpuestos: Int, bonus: Int,exentoImpuestos: Boolean) : this(nombre,edad,salarioBase.toDouble(),porcentajeImpuestos.toDouble(),bonus.toDouble(),exentoImpuestos)

    override fun calcularSalario(): Double {
        return if (exentoImpuestos) {
            salarioBase
        } else {
            super.calcularSalario()
        }
    }

    fun administrar(): String {
        return "$nombre esta administrando la empresa."
    }

    override fun toString(): String {
        return "${super.toString()}, Bonus: $bonus, ExentoImpuestos: $exentoImpuestos, SalarioConImpuestos: ${calcularSalario()})"
    }
}