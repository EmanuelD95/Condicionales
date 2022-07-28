/** FOR */

fun main() {
    //loopFor()
    //contador1a100()
    //contadorCaracteres()
    //contadorPorPasos()
    //contadorALaInversa()
    //contadorHasta()
    //deletrear()
    //sumaNaturales()
    //sumaDe5En5()
    //sumaNumerosPares()
    sumaNumerosImpares()
}

fun loopFor(){
    for (i in 1..5) {
        println("Cuenta: $i")
    }
}

fun contador1a100(){
    for (i in 1..100){
        println(i)
    }
}

fun contadorCaracteres(){
    for (char in 'a'..'f'){
        println("Caracter: $char")
    }
}
fun contadorPorPasos(){
    for (i in 1..10 step 2){
        println(i)
    }
}
fun contadorALaInversa(){
    for (i in 7 downTo 0 ){
        println("En reversa : $i")
    }
}
fun contadorHasta(){
    for (char in 'a' until 'h'){
        println(char)//Excluye el ultimo valor
    }
}
fun deletrear(){
    for (l in "Emanuel"){
        println(l)
    }
    for (e in "Emanuel") {
        print("$e-")
    }
}


/**
 * FOR 2
 */

// Sumar del 1 al 10
// S = 1+2+3+4+5+6+7+8+9+10
fun sumaNaturales() {
    var suma: Int = 0
    for (i in 1..10) {
        suma += i
        println("Valor: $suma")
    }
    println("La Suma es: $suma")
}

fun sumaDe5En5() {
    var suma: Int = 0
    for (i in 0..30 step 5) {
        suma += i
        println("Valor: $suma")
    }
    println("La Suma es: $suma")
}

fun sumaNumerosPares() {
    var suma: Int = 0
    for (i in 2..20 step 2) {
        suma += i
        println("Valor: $suma")
    }
    println("La Suma es: $suma")
}
fun sumaNumerosImpares() {
    var suma: Int = 0
    for (i in 1..15 step 2) {
        suma += i
        println("Valor: $suma")
    }
    println("La Suma es: $suma")
}
/*var potencia: Double = 0.0
  for (i in 1..numero ) {
      potencia = Math.pow(i.toDouble(),2.0)
      println("Valor: $potencia")
  }*/