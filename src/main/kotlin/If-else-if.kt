/** If-else-if */

var nota: Int = 0
var mes: Int = 0

fun main() {
   // solicitarNota()
    //calcularNota()
    examenDeProgramacion()
    resultadoDeNotas()
}

fun solicitarNota() {
    print("Ingrese Nota: ")
    nota = readLine()!!.toInt()
}

fun calcularNota() {
    if (nota < 5) {
        println("Estas inhabilitado")
    } else if (nota <= 10) {
        println("Estas jalado")
    } else if (nota <= 20) {
        println("Estas aprobado")
    } else {
        println("Ingreso nota incorrecta")
    }
}

/** TAREA:
 * Pedir nota de Examen de Programacion: notaProgramacion
 * Si nota es mayor a 20 imprimir: "Ingresó nota incorrecta"
 * Sino, si nota es mayor o igual a 17, imprimir: "Su nota es: A+"
 * Sino, si nota es mayor a 14, imprimir: "Su nota es: A"
 * Sino, si nota es mayor o igual a 11, imprimir: "Su nota es: B"
 * Sino, si nota es mayor a 6, imprimir: "Su nota es: C"
 * Sino, imprimir: "Su nota es: C-. Usted no sirve para programar."
 */
fun examenDeProgramacion() {
    print("Ingrese Nota: ")
    mes = readLine()!!.toInt()
}

fun resultadoDeNotas() {
    if (mes > 20) {
        println("Ingreso nota incorrecta")
    } else if (mes >= 17) {
        println("Su nota es: A+")
    } else if (mes > 14) {
        println("Su nota es: A")
    } else if (mes >= 11) {
        println("Su nota es: B")
    } else if (mes > 6) {
        println("Su nota es: C")
    } else {
        println("Su nota es C-. Usted no sirve para programar")
    }
}