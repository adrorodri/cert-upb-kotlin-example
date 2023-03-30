package model

interface OperacionCajeroInterfaz {
    fun ejecutar(usuario: Usuario): Usuario
}

class DepositarDineroInterfaz(val monto: Double) : OperacionCajeroInterfaz {
    override fun ejecutar(usuario: Usuario): Usuario {
        usuario.saldo += monto
        return usuario
    }
}

class RetirarDineroInterfaz(val monto: Double) : OperacionCajeroInterfaz {
    override fun ejecutar(usuario: Usuario): Usuario {
        if (usuario.saldo >= monto) {
            usuario.saldo -= monto
        } else {
            throw ExceptionsCajero.DineroInsuficienteException()
        }
        return usuario
    }
}

class ConsultarSaldoInterfaz : OperacionCajeroInterfaz {
    override fun ejecutar(usuario: Usuario): Usuario {
        println("Saldo del usuario: ${usuario.saldo}")
        return usuario
    }
}

