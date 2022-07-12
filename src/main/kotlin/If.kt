/** Condicionales */

val age: Int = 20

fun main() {
    mostrarEdad()
    calcularMayorDeEdad()
    calcularTeen()
    calcularDosDecadas()
    calcularMultiplo10()
    calcularMultiplo4o5()

}

// if = Si
// Sirve para ejecutar condiciones
fun mostrarEdad() {
    println("Edad: $age")
}

fun calcularMayorDeEdad() {
    if (age >= 18) {
        println("Tu eres mayor de edad")
    }
}

fun calcularTeen() {
    if (age >= 15 && age <= 20) { //Ambos deben ser verdaderos
        println("Eres adolescente")
    }
}

fun calcularDosDecadas() {
    if (age == 20){
        println("Usted tiene 2 decadas")}
}
fun calcularMultiplo10() {
    if (age % 10 == 0) {
        println("Tu edad es multiplo de 10")
    }
    println(age%10)// Calcular el residuo de la divicion
}
fun calcularMultiplo4o5() {
    if (age%4==0 || age%5==0) {//al menos uno debe ser verdadero
        println("Tu edad es multiplo de 4 o 5")
    }
}
