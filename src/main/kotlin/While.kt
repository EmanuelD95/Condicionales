

fun main() {
    loopWhile()
}

// While
fun loopWhile() {
    var x: Int = 1
    while(x<10) {
        println(x)
        x += 1
    }
}

// Bucle INFINITO
// "No intente en programas"
fun loopInfinite() {
    var x: Int = 1
    while(x<10) {
        println(x)
    }
}