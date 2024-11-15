package usersistema;

import java.util.Scanner;

public class Correntista extends Usuarios {

    public Correntista(String nivelacesso, String usuario, String senha) {
        super("correntista", usuario, senha);

    }

    @Override
    public String getNivelacesso(String nivelacesso) {
        return nivelacesso;
    }

    public void funcoesCorrentista(){
        int opcao;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha uma opção");
        opcao = sc.nextInt();
        switch (opcao){
            case 1:

        }

    }


}
