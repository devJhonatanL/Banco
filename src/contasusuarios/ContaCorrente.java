package contasusuarios;

public class ContaCorrente extends Contas {

    double chequeEspecial;

    public ContaCorrente(double saldoInicial, double chequeEspecial) {
        super(saldoInicial);

    }

    @Override
    public void sacar(double valor) {
        if(valor>chequeEspecial) {
            saldo -=valor;
            System.out.println("Saque realizado.");
        } else {
            System.out.println("Saque invalido, verifique o saldo total e o valor solicitado");
        }

    }

}
