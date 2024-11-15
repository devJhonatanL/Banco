package usersistema;


public class Bancario extends Usuarios {

    public Bancario(String nivelacesso, String usuario, String senha) {
        super("bancario", usuario, senha);

    }

    @Override
    public String getNivelacesso(String nivelacesso) {
        return nivelacesso;
    }
}
