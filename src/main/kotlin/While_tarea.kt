/**
 * TAREA-1:
 * Solicitar ingresar un valor e imprimir desde 1 hasta el valor ingresado, de uno en uno.
 * Ejemplo: Si ingresaste 30 se debe mostrar en pantalla los números del 1 al 30.
 */

/**
 * TAREA-2:
 * Solicitar ingresar 5 valores e imprimir la suma de los valores ingresados.
 * Ejemplo: Si ingresaste  1  5  0  12  30  debe imprimir "La suma es: 48"
 */
/**
 * TAREA-3:
 * Pedir ingresar 4 notas de alumnos y que imprima cuántos tienen notas mayores o iguales a 11 y cuántos menores
 * Ejemplo: Si ingresaste  13  5  20  16  debe imprimir
 * "Aprobados: 3"
 * "Jalados: 1"
 */
fun main() {
    //mostrarNValores()
    //calcularSumaDeNotas()
    aptosParaAprobar()
}

fun mostrarNValores() {
    print("Ingresar numero:")
    val numero = readLine()!!.toInt()
    var x = 1
    while (x < numero) {
        println(x)
        x += 1
    }
}
fun calcularSumaDeNotas() {
    var x: Int = 1
    var suma: Int = 0
    while (x <= 5) {
        print("Ingrese nota:")
        val valor=readLine()!!.toInt()
        suma += valor
        x += 1
    }
    println("La suma de los 5 valores son $suma")
}
fun aptosParaAprobar() {
    print("Cantidad de notas: ")
    val cantidadDeNotas = readLine()!!.toInt()
    var contador = 1
    var reprobados = 0
    while (contador <= cantidadDeNotas) {
        print("Ingresar nota: ")
        val notas = readLine()!!.toDouble()
        if (notas <= 11)
            reprobados += 1
        contador += 1;
    }
    println("El numero de reprobados es: $reprobados")
    println("El numero de aprobados es: ${cantidadDeNotas-reprobados}")
    /*
    print("Cantidad de notas: ")
    val n = readLine()!!.toInt()
    var x = 1
    var cantidad = 0
    while (x <= n) {
        print("Ingresar nota: ")
        val notas = readLine()!!.toDouble()
        if (notas <= 11)
            cantidad = cantidad +1
        x += 1;
    }
    println("El numero de reprobados es: $cantidad")
    println("El numero de aprobados es: ${n-cantidad}")
     */
}




