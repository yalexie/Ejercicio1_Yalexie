package model

class Persona  {
    var nombre : String
    var edad : Int
    var cedula : Int
    var sexo: Char
    var peso : Double
    var altura : Double

    init{
        nombre = ""
        edad = 0
        cedula = 0
        sexo = ' '
        peso = 0.0
        altura = 0.0
    }

    constructor()

    constructor(nombre_p: String, edad_p : Int, cedula_p: Int, sexo_p: Char, peso_p: Double, altura_p: Double){
        this.nombre = nombre_p
        this.edad = edad_p
        this.cedula = cedula_p
        this.sexo = sexo_p
        this.peso = peso_p
        this.altura = altura_p
    }

    constructor (nombre :  String , sexo :  Char , edad :  Int ) {
        this.nombre = nombre
        this.sexo = sexo
        this.edad = edad
    }

}









