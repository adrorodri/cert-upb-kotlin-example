package model

sealed class ExceptionsCajero : Exception() {
    class DineroInsuficienteException : ExceptionsCajero()
    class UsuarioNoExistenteException : ExceptionsCajero()
    class UsuarioNoInicioSesionException : ExceptionsCajero()
    class SistemaOfflineException : ExceptionsCajero()
}
