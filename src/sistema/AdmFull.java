package sistema;

public class AdmFull  extends Usuarios{
    public AdmFull(String nivelacesso, String usuario, String senha) {
        super(nivelacesso, usuario, senha);
    }

    @Override
    public String getNivelacesso(String nivelacesso) {
        return "full";
    }
}
