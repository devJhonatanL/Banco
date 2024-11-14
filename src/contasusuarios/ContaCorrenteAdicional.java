package contasusuarios;

public class ContaCorrenteAdicional extends Contas {

    double limite;

    public ContaCorrenteAdicional(double saldoInicial) {
        super(saldoInicial);

    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <=limite) {
            saldo -= valor;
            System.out.println("Saque realizado.");
        } else {
            System.out.println("Saque invalido, verifique o saldo liberado e o valor solicitado");
        }

    }

}
