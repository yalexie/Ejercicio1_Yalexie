import view.PersonaView

fun main(args: Array<String>) {

    val vista = PersonaView()

    vista.pantalla()

    println("Program arguments: ${args.joinToString()}")
}