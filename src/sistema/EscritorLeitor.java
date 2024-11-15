package sistema;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EscritorLeitor {
    static String arquivo;
    static List<String> dados = new ArrayList<>();




    public static void registrarInfo(List<String[]> dados, String arquivo) {


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

    public static void leituraInfo(List<String[]> compromissos, String arquivo) {

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] compromisso = linha.split(",");
                compromissos.add(compromisso);
            }
            System.out.println("\n**Informações carregados com sucesso.**\n");
        } catch (IOException e) {
            System.out.println("\n**Nenhum registro encontrado.Tente novamente!** \n");
        }
    }

}
