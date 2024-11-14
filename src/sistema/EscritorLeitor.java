package sistema;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EscritorLeitor {
    static String arquivo;
    static List<String> dados = new ArrayList<>();




    public static void registrarInfo(List<String[]> dados) {


        try (FileWriter registrador = new FileWriter(arquivo, true)) {
            for (int i = 0; i < dados.size(); i++) {
                String[] dado = dados.get(i);
                registrador.write(String.join(",", dado));
                registrador.write(System.lineSeparator());
            }
            System.out.println(" *Informações registradas com sucesso.* ");
        } catch (IOException e) {
            System.out.println(" *Erro ao registrar as informações. Tente novamente!* ");
        }
    }


}
