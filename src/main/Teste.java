package main;

import contasusuarios.ContaCorrente;
import contasusuarios.ContaPoupança;

public class Teste {

    public static void main(String[] args) {
        double saldo = 1000;
        int tempo = 5;
        double chequeEspecial = 100;
        ContaPoupança conta = new ContaPoupança(saldo);
        ContaCorrente corrente = new ContaCorrente(saldo, chequeEspecial);



        corrente.sacar(100);
        System.out.println(corrente.getSaldo());
    }

}