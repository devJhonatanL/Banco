package sistema;

public class Bancario extends Usuarios {

    public Bancario(String nivelacesso, String usuario, String senha) {
        super(nivelacesso, usuario, senha);

    }

    @Override
    public String getNivelacesso(String nivelacesso) {
        nivelacesso = "medio";
        return nivelacesso;
    }

}