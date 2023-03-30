import model.*

fun main() {
    val cajero = CajeroAutomatico()
    cajero.ingresar(Usuario("nro12345"))
    try {
        cajero.ejecutarOperacion(DepositarDinero(1000.0))
        cajero.ejecutarOperacion(ConsultarSaldo())
        cajero.ejecutarOperacion(RetirarDinero(1001.0))
        cajero.ejecutarOperacion(ConsultarSaldo())
    } catch (exception: ExceptionsCajero) {
        when(exception) {
            is ExceptionsCajero.DineroInsuficienteException -> println("Dinero insuficiente")
            is ExceptionsCajero.SistemaOfflineException -> println("Sistema Offline")
            is ExceptionsCajero.UsuarioNoExistenteException -> println("Usuario no existe")
            is ExceptionsCajero.UsuarioNoInicioSesionException -> println("Usuario no inicio sesion")
        }
    }
}

//
//fun ejectuar() {
//    val pinguino = Pinguino("Felipe")
//}
//
//abstract class Ave(val nombre: String) {
//    abstract fun volar()
//}
//
//class Paloma(nombre: String): Ave(nombre) {
//    override fun volar() {
//        println("VUELA!")
//    }
//}
//
//class Pinguino(nombre: String): Ave(nombre) {
//    override fun volar() {
//        println("NO VUELA!")
//    }
//}
