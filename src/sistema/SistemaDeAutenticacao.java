package sistema;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SistemaDeAutenticacao {
    private List<String> usuarios;

    public SistemaDeAutenticacao() {
        usuarios = new ArrayList<>();
        carregarUsuarios("usuarios.txt");
    }

    private void carregarUsuarios(String arquivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                usuarios.add(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo de usuários: " + e.getMessage());
        }
    }

    public Usuarios autenticarUsuario(String nivelacesso, String usuario, String senha) {
        for (String usuarioS : usuarios) {
            String[] dados = usuarioS.split(",");
            if (dados.length == 3) {
                String nivelArquivo = dados[0];
                String nomeArquivo = dados[1];
                String senhaArquivo = dados[2];


                if (usuario.equals("ADM@Eliesio") && senha.equals("ccmsai14"))
                    System.out.println("Autenticação bem-sucedida para " + nivelacesso + ".");
                    if (nivelArquivo.equalsIgnoreCase("Adm")) {
                        return new AdmFull(nivelacesso, usuario, senha);
                        }else if (nomeArquivo.equals(usuario) && senhaArquivo.equals(senha)) {
                            System.out.println("Autenticação bem-sucedida para " + nivelacesso + ".");
                            if (nivelArquivo.equalsIgnoreCase("Gerente")) {
                                return new Gerente(nivelacesso, usuario, senha);
                                    } else if (nivelArquivo.equalsIgnoreCase("Bancario")) {
                                    return new Bancario(nivelacesso, usuario, senha);
                        }           } else if (nivelArquivo.equalsIgnoreCase("Bancario")) {
                        return new Bancario(nivelacesso, usuario, senha);


            }
            }
        }
        System.out.println("Usuário ou senha incorretos.");
        return null;
    }

}