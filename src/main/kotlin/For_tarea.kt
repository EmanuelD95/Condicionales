/** TAREA-1:
 * Imprimir números del 100 al 200.
 */
/** TAREA-2:
 * Imprimir caracteres de la 'A' a la 'Z'.
 */
/** TAREA-3:
 * Imprimir 0 al 80 de 5 en 5.
 */
/** TAREA-4:
 * Imprimir números del 20 al 0.
 */
/** TAREA-5:
 * Imprimir Apellido deletreado.
 */
fun main(){
    contar100Al200()
    desdeAHastaLaZ()
    contadorDe5()
    inversaDe20Al0()
    deletrearApellido()
}
fun contar100Al200(){
    for (i in 100..200) {
        println("Cuenta: $i")
    }
}
fun desdeAHastaLaZ(){
    for (char in 'A'..'Z'){
        println(char)
    }
}
fun contadorDe5(){
    for (i in 0..80 step 5){
        println(i)
    }
}
fun inversaDe20Al0(){
    for (i in 20 downTo 0 ){
        println("En reversa : $i")
    }
}
fun deletrearApellido() {
    for (l in "Munoz") {
        println(l)
    }
}

