package view
import controller.PersonaController
import model.Persona

class PersonaView {

    val c = PersonaController()

    fun pantalla(){
        println("Digite su nombre:")
        val nombre =readLine()!!.toString()

        println("Digite su cedula:")
        val cedula=readLine()!!.toInt()

        println("Digite su edad:")
        val edad=readLine()!!.toInt()

        println("Digite su sexo:")
        val sexoS=readLine()!!.toString()
        val sexo = sexoS.first()

        println("Digite su peso:")
        val peso=readLine()!!.toDouble()

        println("Digite su altura:")
        val altura=readLine()!!.toDouble()

        val persona1 = Persona(nombre, edad, cedula, sexo, peso, altura)
        c.comprobarSexo(persona1)
        println("Persona 1")
        println("Metodo calcular IMC ")
        println("\n"+c.calcularIMC(persona1))
        println("Metodo es mayor de edad ")
        println("\n"+c.esMayorDeEdad(persona1))
        println("\n"+c.toString(persona1))

        val persona2 = Persona("Luis", 25, 204090419, 'H', 80.5, 1.80)
        c.comprobarSexo(persona2)
        println("Persona 2")
        println("Metodo calcular IMC ")
        println("\n"+c.calcularIMC(persona2))
        println("Metodo es mayor de edad ")
        println("\n"+c.esMayorDeEdad(persona2))
        println("\n"+c.toString(persona2))

        val persona3 = Persona("Maria", 25, 116470815, 'F', 65.5, 1.60)
        c.comprobarSexo(persona3)
        println("Persona 3")
        println("Metodo calcular IMC ")
        println("\n"+c.calcularIMC(persona3))
        println("Metodo es mayor de edad ")
        println("\n"+c.esMayorDeEdad(persona3))
        println("\n"+c.toString(persona3))

    }
}