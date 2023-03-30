package model

import extensions.isGreaterThanZero

abstract class OperacionCajero {
    abstract fun ejecutar(usuario: Usuario): Usuario
}

class DepositarDinero(val monto: Double) : OperacionCajero() {
    override fun ejecutar(usuario: Usuario): Usuario {
        usuario.saldo += monto
        return usuario
    }
}

class RetirarDinero(val monto: Double) : OperacionCajero() {
    override fun ejecutar(usuario: Usuario): Usuario {
        if (usuario.saldo >= monto) {
            usuario.saldo -= monto
        } else {
            throw ExceptionsCajero.DineroInsuficienteException()
        }
        return usuario
    }
}

class ConsultarSaldo : OperacionCajero() {
    override fun ejecutar(usuario: Usuario): Usuario {
        if (usuario.saldo.isGreaterThanZero()) {
            println("El usuario no tiene nada!!")
        }
        println("Saldo del usuario: ${usuario.saldo}")
        return usuario
    }
}
