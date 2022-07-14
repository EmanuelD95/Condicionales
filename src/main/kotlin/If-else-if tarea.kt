

var inicialDia: String = ""

fun main() {
    ingresarInicialDia()
    diasDeLaSemana()
    println("----------------")
    numeroMes()
    meses()
}

fun ingresarInicialDia() {
    println("TAREA 1")
    print("Ingresar inicial de dia de la semana: ")
    inicialDia = readLine()!!
}

fun diasDeLaSemana() {

    if (inicialDia.equals("D")) {
        println("Domingo")
    } else if (inicialDia.equals("L")) {
        println("lunes")
    } else if (inicialDia.equals("M")) {
        println("Martes")
    } else if (inicialDia.equals("X")) {
        println("Miercoles")
    } else if (inicialDia.equals("J")) {
        println("Jueves")
    } else if (inicialDia.equals("V")) {
        println("Viernes")
    } else if (inicialDia.equals("S")) {
        println("Sabado")
    } else {
        println("Ingresó inicial incorrecta")
    }
}



fun numeroMes() {
    println("TAREA 2")
    print("Ingrese numero del mes: ")
    mes = readLine()!!.toInt()
}

fun meses() {
    if (mes == 1) {
        println("Mes: Enero ")
    } else if (mes == 2) {
        println("Mes: Febrero")
    } else if (mes == 3) {
        println("Mes: Marzo")
    } else if (mes == 4) {
        println("Mes: Abril")
    } else if (mes == 5) {
        println("Mes: Mayo")
    } else if (mes == 6) {
        println("Mes: Junio")
    } else if (mes == 7) {
        println("Mes: Julio")
    } else if (mes == 8) {
        println("Mes: Agosto")
    } else if (mes == 9) {
        println("Mes: Septiembre")
    } else if (mes == 10) {
        println("Mes: Octubre")
    } else if (mes == 11) {
        println("Mes: Noviembre")
    } else if (mes == 12) {
        println("Mes: Diciembre")
    }else { println("Numero de mes incorrecto") }
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


