package usersistema;

import java.util.Scanner;
import java.io.*;
import java.util.List;

import static sistema.EscritorLeitor.leituraInfo;
import static sistema.EscritorLeitor.registrarInfo;


public class Gerente extends Usuarios {

    public Gerente(String nivelacesso, String usuario, String senha) {
        super("gerente", usuario, senha);

    }

    @Override
    public String getNivelacesso(String nivelacesso) {
        return nivelacesso;
    }

    public  void criarBancario(Scanner input, List<String[]> usuarios) {
        String nivelacesso;
        String usuario;
        String senha;

        String arquivos = "usuario.txt";

        System.out.println("Digite o usuario: ");
        usuario = input.nextLine();

        System.out.println("Digite a Senha: ");
        senha = input.nextLine();

        nivelacesso = "bancario";

        String[] login = {nivelacesso, usuario, senha};
        usuarios.add(login);
        registrarInfo(usuarios, arquivos);
    }

    public static void criarCorrentista(Scanner input, List<String[]> usuarios) {


        String nivelacesso;
        String usuario;
        String senha;
        String contaCorrente = "0";
        String contaPoupança = "0";
        String contaCorrenteAdicional = "0";

        String arquivos = "usuario.txt";

        System.out.println("Digite o usuario: ");
        usuario = input.nextLine();

        System.out.println("Digite a Senha: ");
        senha = input.nextLine();

        System.out.println("Digite o tipo de conta:");
        int opcao = input.nextInt();
        input.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("Digite o número da conta:");
                String conta = input.nextLine();
                contaCorrente = conta;
                break;
            case 2:
                System.out.println("Digite o número da conta:");
                String contaPoupanca = input.nextLine();
                contaPoupança = contaPoupanca;
                break;

        }

        nivelacesso = "correntista";



        String[] login = {nivelacesso, usuario, senha, contaCorrente, contaPoupança, contaCorrenteAdicional};
        usuarios.add(login);
        registrarInfo(usuarios, arquivos);

    }




}
