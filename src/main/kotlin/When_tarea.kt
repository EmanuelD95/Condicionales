var puntaje: Int = 0
var notas: Int = 0

fun main() {
    numeroDeRangos()
    denominaciones()

    puntuacion()
    notasDePuntacion()
}

fun numeroDeRangos() {
    println("TAREA 3")
    print("Ingrese Puntaje: ")
    puntaje = readLine()!!.toInt()
}

fun denominaciones() {
    when (puntaje) {
        in 0..19 -> {
            println("$puntaje -Insuficiente")
        }
        in 20..49 -> {
            println("$puntaje -Deficiente")
        }
        in 50..69 -> {
            println("$puntaje -Aceptable")
        }
        in 70..89 -> {
            println("$puntaje -Sobresaliente")
        }
        in 90..100 -> {
            println("$puntaje -EXCELENTE")
        }
        else -> {
            println("Ingreso puntaje incorrecto")
        }
    }
}

fun puntuacion() {
        println("TAREA 4")
        print("Ingrese nota Kotlin: ")
        notas = readLine()!!.toInt()
}

fun notasDePuntacion() {
    when (notas) {
        in 0..5 -> {
            println("Su nota es: C-. Usted no sirve para programar en Kotlin.")
        }
        in 6..10 -> {
            println("Su nota es: C")
        }
        in 11..14 -> {
            println("Su nota es: B")
        }
        in 15..18 -> {
            println("Su nota es: A")
        }
        in 19..20 -> {
            println("Su nota es: A+")
        }
        else -> {
            println("Ingreso nota incorrecto")
        }
    }
}

/** TAREA-3:
 * Pedir puntaje
 * Si puntaje está entre 0 y 19, imprimir: "$puntaje - Insuficiente" // in 0..19 -> {}
 * Sino, si puntaje está entre 20 y 49, imprimir: "$puntaje - Deficiente" // in 20..49 -> ...
 * Sino, si puntaje está entre 50 y 69, imprimir: "$puntaje - Aceptable"
 * Sino, si puntaje está entre 50 y 69, imprimir: "$puntaje - Aceptable"
 * Sino, si puntaje está entre 70 y 89, imprimir: "$puntaje - Sobresaliente"
 * Sino, si puntaje está entre 90 y 100, imprimir: "$puntaje - ¡EXCELENTE!"
 * Sino, si puntaje es otro valor, imprimir: "Ingresó puntaje incorrecto"
 */

/** TAREA-4:
 * Pedir nota de Examen de Kotlin: notaKotlin
 * Si nota está entre 0 y 5, imprimir: "Su nota es: C-. Usted no sirve para programar en Kotlin." // in 0..5 ->
 * Sino, si nota está entre 6 y 10, imprimir: "Su nota es: C"
 * Sino, si nota está entre 11 y 14, imprimir: "Su nota es: B"
 * Sino, si nota está entre 15 y 18, imprimir: "Su nota es: A"
 * Sino, si nota es 19 o 20, imprimir: "Su nota es: A+" // 19,20 ->
 * Sino, si nota es otro valor, imprimir: "Ingresó nota incorrecta"
 */

