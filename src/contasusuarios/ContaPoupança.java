package contasusuarios;

public class ContaPoupança extends Contas {

    double rendimentos;
    double taxaDeRedimento = 3.8;

    public ContaPoupança(double saldoInicial) {
        super(saldoInicial);

    }

    @Override
    public void sacar(double valor) {

        if (valor > 0 && valor < saldo) {
            saldo -= valor;
            System.out.println("Retirada realizado.");
        } else {
            System.out.println("Retirada invalida, verifique o saldo total e o valor solicitado");
        }

    }

    public double calculoRedimentos(double saldo, int tempo) {

        rendimentos = saldo* Math.pow(1 + (taxaDeRedimento/100), tempo);
        System.out.printf("Redimentos da conta poupança: R$ %.2f em um total de %d meses. ", rendimentos, tempo);
        return rendimentos;

    }

}