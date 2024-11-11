package sistema;

public class Gerente extends Usuarios {

    public Gerente(String nivelacesso, String usuario, String senha) {
        super( nivelacesso, usuario, senha);

    }
    @Override
    public String getNivelacesso(String nivelacesso) {
        nivelacesso = "full";
        return nivelacesso;
    }

}
