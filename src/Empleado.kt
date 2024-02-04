open class Empleado(nombre: String, edad: Int, var salarioBase: Double, private var porcentajeImpuestos: Double = 10.0) : Persona(nombre, edad) {

    constructor(nombre: String,edad: Int,salarioBase: Int,porcentajeImpuestos: Int) : this(nombre,edad,salarioBase.toDouble(),porcentajeImpuestos.toDouble())

    open fun calcularSalario(): Double {
        return salarioBase - (salarioBase * (porcentajeImpuestos / 100))
    }

    fun trabajar(): String {
        return "$nombre esta trabajando en la empresa."
    }

    override fun toString(): String {
        return "${super.toString()}, SalarioBase: $salarioBase, PorcentajeImpuestos: $porcentajeImpuestos"
    }
}