package contasusuarios;

public abstract class Contas {
    double saldo;

    public Contas(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract void sacar(double valor);
}
