/**
 * TAREA
 * (Pedir ingresar número)
 */
// Suma de los números Naturales
// Suma de los números Pares
// Suma de los números Impares
// Imprimir números al cuadrado (EJM: 2*2 = 4)
// Imprimir números al cubo (EJM: 5*5*5 = 125)
// Suma del -1 al -100
// Resta del 100 al 1 (de 1 en 1)
var numero: Int = 0
fun main(){
    //numerosIngresados()
    //sumaDeNumeros()
    //numerosPar()
    //sumaPares()
    //numerosimPar()
    //sumaDeImPares()
    //numerosCuadrado()
    //alCuadrado()
    //numerosCubo()
    //alCubo()
    //sumaDe1Al()
    restaDeNumeros()

}
fun numerosIngresados(){
    print("Ingrese numero: ")
    numero = readLine()!!.toInt()

}
fun sumaDeNumeros() {
    var suma: Int = 0
    for (i in 1..numero) {
        suma += i
        println("Valor: $suma")
    }
    println("La Suma es: $suma")
}
fun numerosPar() {
    print("Ingrese numero par: ")
    numero = readLine()!!.toInt()
}
fun sumaPares() {
    var suma: Int = 0
    for (i in 2..numero step 2) {
        suma += i
        println("Valor: $suma")
    }
    println("La Suma es: $suma")
}
fun numerosimPar() {
    print("Ingrese numero impar: ")
    numero = readLine()!!.toInt()
}
fun sumaDeImPares() {
    var suma: Int = 0
    for (i in 1..numero step 2) {
        suma += i
        println("Valor: $suma")
    }
    println("La Suma es: $suma")
}
fun numerosCuadrado() {
    print("Ingrese numero: ")
    numero = readLine()!!.toInt()
}

fun alCuadrado() {
    var potencia: Int = 0
    for (i in 1..numero) {
        potencia = i * i
        println("$i*$i = $potencia")
    }
}

fun numerosCubo() {
    print("Ingrese numero: ")
    numero = readLine()!!.toInt()
}

fun alCubo() {
    var potencia: Int = 0
    for (i in 1..numero) {
        potencia = i * i * i
        println("$i*$i*$i = $potencia")
    }
}

fun sumaDe1Al() {
    var suma: Int = 0
    for (i in -100..-1) {
        suma += i
        println("Valor: $suma")
    }
    println("La Suma es: $suma")
}
fun restaDeNumeros() {
    for (i in 100 downTo 1) {
        println("Valor: $i")
    }
}




