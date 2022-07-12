
/** TAREA:
 * Imprimir número de hemanos.
 * Calcular si es mayor que 5
 * Calcular si es menor que 10
 * Calcular si es igual a 9
 * Calcular si es mayor que 7 y menor que 11
 * Calcular si es múltiplo de 3
 * Calcular si es impar // if(hnos%2==1)
 */
val hermanos: Int = 9

fun main (){
    imprimirNumeroHnos()
    calcularMayorDe5()
    calcularMenorDe10()
    calcularIgualA9()
    calcularMayor7Menor11()
    calcularMultiplo3()
    calcularSiEsImpar()

}
fun imprimirNumeroHnos() {
    println("Hermanos: $hermanos")
}
fun calcularMayorDe5() {
    if(hermanos>5) {
        println("Mayor de 5")
    }
}
fun calcularMenorDe10() {
    if(hermanos<10) {
        println("Menor de 10")
    }
}
fun calcularIgualA9() {
    if(hermanos == 9) {
        println("Igual a 9")
    }
}
fun calcularMayor7Menor11() {
    if (hermanos >=7  && hermanos <=11) {
        println("Es mayor igual que 7 y menor igual que 11")
    }
}
fun calcularMultiplo3() {
    if (hermanos % 3 == 0) {
        println("Numero de hermanos es multiplo de 3")
    }
    println(hermanos%3)
}
fun calcularSiEsImpar() {
    if(hermanos%2==1)
        println("Si es impar")
}
