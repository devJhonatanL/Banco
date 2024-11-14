package usersistema;

public abstract class Usuarios {

    protected String nivelacesso;
    protected String senha;
    protected String usuario;

    public Usuarios(String nivelacesso, String usuario, String senha) {
        this.nivelacesso = nivelacesso;
    }

    public abstract String getNivelacesso(String nivelacesso);

}
