package model

class CajeroAutomatico {
    var usuarioActual: Usuario? = null

    fun ingresar(usuario: Usuario) {
        usuarioActual = usuario
    }

    @Throws(ExceptionsCajero::class)
    fun ejecutarOperacion(operacion: OperacionCajero) {
        if (usuarioActual == null) throw ExceptionsCajero.UsuarioNoInicioSesionException()
        operacion.ejecutar(usuarioActual!!)
    }

    @Throws(ExceptionsCajero::class)
    fun ejecutarOperacionInterfaz(operacion: OperacionCajeroInterfaz) {
        if (usuarioActual == null) throw ExceptionsCajero.UsuarioNoInicioSesionException()
        operacion.ejecutar(usuarioActual!!)
    }
}
