package usersistema;

public class AdmFull  extends Usuarios {
    public AdmFull(String nivelacesso, String usuario, String senha) {
        super("adm", usuario, senha);
    }

    @Override
    public String getNivelacesso(String nivelacesso) {
        return "full";
    }
}
