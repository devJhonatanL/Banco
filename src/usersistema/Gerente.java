package usersistema;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Gerente extends Usuarios {

    public Gerente(String nivelacesso, String usuario, String senha) {
        super( "gerente", usuario, senha);

    }
    @Override
    public String getNivelacesso(String nivelacesso) {
        nivelacesso = "alto";
        return nivelacesso;
    }

    public static void registrarInfo(List<String[]> usuarios) {


        try (FileWriter registrador = new FileWriter("usuarios.txt", true)) {
            for (int i = 0; i < usuarios.size(); i++) {
                String[] usuariO = usuarios.get(i);
                registrador.write(String.join(",", usuariO));
                registrador.write(System.lineSeparator());
            }
            System.out.println(" *Informações registradas com sucesso.* ");
        } catch (IOException e) {
            System.out.println(" *Erro ao registrar as informações. Tente novamente!* ");
        }
    }

    public static void salvarUsuarios(Scanner input, List<String[]> usuarios) {
        String nivelacesso;
        String usuario;
        String senha;
        String numeroConta;

        System.out.println("Digite o usuario: ");
        usuario = input.nextLine();

        System.out.println("Digite a Senha: ");
        senha = input.nextLine();

        System.out.println("Informe o nivel de acesso:");
        nivelacesso = input.nextLine();

        System.out.println("Informe o numero de conta:");
        numeroConta = input.nextLine();

        String[] login = { nivelacesso, usuario, senha };
        usuarios.add(login);
        registrarInfo(usuarios);

    }


}