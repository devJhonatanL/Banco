package usersistema;

public class Correntista extends Usuarios {

    public Correntista(String nivelacesso, String usuario, String senha) {
        super("correntista", usuario, senha);

    }

    @Override
    public String getNivelacesso(String nivelacesso) {
        nivelacesso = "baixo";
        return nivelacesso;
    }


}