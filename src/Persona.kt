open class Persona(var nombre: String, private var edad: Int) {

    fun celebrarCumple(): String {
        edad++
        return "Feliz cumpleaños $nombre! Ahora tienes $edad años."
    }

    override fun toString(): String {
        return "Nombre: $nombre, Edad: $edad"
    }
}