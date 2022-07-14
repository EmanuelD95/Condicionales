/** If-else */
var edad: Int = 0
var promedio: Int = 0

fun main() {
    //ingresarPromedio()
    //condicional2()
    registroDeEdad()
    permisoDeEntrada()

}

fun ingresarPromedio() {
    println("Ingrese Promedio: ")
    promedio = readLine()!!.toInt() //leer por consola
}

fun condicional1() {
    if (promedio > 10) {
        println("Tu promedio es $promedio. \n¡Estás aprobado!")
    }
    if (promedio <= 10) {
        println("Tu promedio es $promedio. \n¡Estás jalado!")
    }
}

fun condicional2() {
    if (promedio > 10) {
        println("Tu promedio es $promedio. \n¡Estás aprobado!")
    } else {
        println("Tu promedio es $promedio. \n¡Estás jalado!")
    }
}

/** TAREA:
 * Pedir ingresar edad
 * Si la edad es mayor o igual a 18, imprimir: "Tu edad es ... Puedes ingresar a la fiesta"
 * sino, imprimir: "Tu edad es ... No tiene edad para ingresar aquí."
 */


fun registroDeEdad() {
    println("Ingrese edad: ")
    edad = readLine()!!.toInt()
}

fun permisoDeEntrada() {
    if (edad >= 18) {
        println("Tu edad es $edad. \n¡Puedes ingresar a la fiesta!")
    } else {
        println("Tu edad es $edad. \n¡No tiene edad para ingresar aquí!")
    }

}