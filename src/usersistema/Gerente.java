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

        String arquivos = "usuario.txt";

        System.out.println("Digite o usuario: ");
        usuario = input.nextLine();

        System.out.println("Digite a Senha: ");
        senha = input.nextLine();

        nivelacesso = "correntista";



        String[] login = {nivelacesso, usuario, senha};
        usuarios.add(login);
        registrarInfo(usuarios, arquivos);

    }




}
}