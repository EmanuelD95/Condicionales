/** REVIEW */
/** REPASO */

// Variables Inmutables
val variableInmutable: String = "carrito"
// Variables Mutables
var variableMutable: Int = 0

// Variables Globales
var ancho: Int = 0
var alto: Int = 0

fun main() {
    ingresarVariables()
    calcularAreaRectangulo1()
    println("El área es: "+calcularAreaRectangulo2())
    calcularAreaRectangulo3(ancho, alto)
    println("Area: "+calcularAreaRectangulo4(ancho,alto))
}

fun ingresarVariables() {
    print("Ingresar Ancho:")
    ancho = readLine()!!.toInt()
    print("Ingresar Alto:")
    alto = readLine()!!.toInt()
}

// Función Simple
fun calcularAreaRectangulo1() {
    // Variables Locales
    val anchito: Int = 6
    val altito: Int = 3
    println("Área Rectángulo: ${anchito * altito}")

    val area: Int = ancho * alto
    println("Área Rectángulo: $area")
}

// Función con Retorno
fun calcularAreaRectangulo2(): Int {
    val area: Int = ancho * alto
    return area
}

// Función con Parámetros
fun calcularAreaRectangulo3(anchito:Int, altito:Int ) {
    val area: Int =anchito*altito
    println("multiplicacion: $area")
}
fun calcularAreaRectangulo4(anchito:Int, altito:Int): Int{
    val area: Int = anchito*altito
    return area
}


