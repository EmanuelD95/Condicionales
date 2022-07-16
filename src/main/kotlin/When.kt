/** When */

var inicial: String = ""
var numerosMes: Int = 0

fun main() {
    //calcularDiaDeLaSemana()
    ingresarDiaInicial()
    diasDeSemana()
    numeroMes1()
    meses1()
}



fun ingresarDiaInicial() {
    println("TAREA 1")
    print("Ingresar inicial de dia de la semana: ")
    inicial= readLine()!!
}

fun diasDeSemana() {

    when (inicial) {
        "D" -> { println("Dia: Domingo") }
        "L" -> { println("Dia: Lunes") }
        "M" -> { println("Dia: Martes") }
        "X" -> { println("Dia: Miercoles") }
        "J" -> { println("Dia: Jueves") }
        "V" -> { println("Dia: Viernes") }
        "S" -> { println("Dia: Sabado") }
        else-> { println("Ingreso inicial incorrecta") }
    }
}

fun numeroMes1() {
    println("TAREA 2")
    print("Ingrese numero del mes: ")
    numerosMes = readLine()!!.toInt()
}

fun meses1() {
    when (numerosMes) {
        1 -> { println("Mes: Enero") }
        2 -> { println("Mes: Febrero") }
        3 -> { println("Mes: Marzo") }
        4 -> { println("Mes: Abril") }
        5 -> { println("Mes: Mayo") }
        6 -> { println("Mes: Junio") }
        7 -> { println("Mes: Julio") }
        8 -> { println("Mes: Agosto") }
        9 -> { println("Mes: Septiembre") }
        10 -> { println("Mes: Octubre") }
        11 -> { println("Mes: Noviembre") }
        12 -> { println("Mes: Diciembre") }
        else->{ println("Numero de mes incorrecto") }
    }

}


/** TAREA-1:
 * Solicitar inicial de Día de la Semana: D, L, M, X, J, V, S
 * Si inicialDia es igual a 'D', imprimir: "Día: Domingo"
 * Sino, si inicialDia es igual a 'L', imprimir: "Día: Lunes"
 * ...
 * Sino, si inicialDia es igual a 'S', imprimir: "Día: Sábado"
 * Sino, imprimir: "Ingresó inicial incorrecta"
 * */

/** TAREA-2:
 * Solicitar número de Mes: 1, 2, 3,..., 12
 * Si numeroMes es igual a '1', imprimir: "Mes: Enero"
 * Sino, si numeroMes es igual a '2', imprimir: "Mes: Febrero"
 * ...
 * Sino, si numeroMes es igual a '12', imprimir: "Mes: Diciembre"
 * Sino, imprimir: "Ingresó $numeroMes. Número de mes incorrecta"
 * */
