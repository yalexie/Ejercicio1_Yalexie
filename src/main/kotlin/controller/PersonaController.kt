package controller
import  model.Persona

class PersonaController {

    fun calcularIMC (persona : Persona): Int {
        val imc : Double

        imc = persona.peso/(persona.altura * persona.altura)

        if (imc < 18.5){
            return -1
        }
        else if (18.5 <imc && imc < 24.9 ){
            return 0
        }
        else {
            return 1
        }

      }

    fun esMayorDeEdad(persona : Persona) : Boolean{
        return persona.edad>18
    }


    fun comprobarSexo(persona : Persona){
        if(persona.sexo=='H' || persona.sexo=='M') {
            persona.sexo= persona.sexo
        }
        else{
            persona.sexo = 'H'
        }
    }

    fun toString(persona : Persona) = "Informacion Persona: \n" +
            "Nombre: ${persona.nombre}\n " +
            "Edad: ${persona.edad} \n" +
            "Sexo: ${persona.sexo} \n" +
            "Cedula: ${persona.cedula} \n" +
            "Peso: ${persona.peso} \n" +
            "Altura: ${persona.altura} \n"
}



