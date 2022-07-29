package util;

import business.domain.Resultado;
import java.io.*;
import java.util.List;

public class ManipuladorArquivo {

    private static final String ENTRADA = "leitura.txt";
    private static final String SAIDA = "saida.csv";
    public static final Integer QTD_CELULAS = 4;

    public static int getQtdRegistros() {
        int qtdRegistros = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(ENTRADA))) {
            while (true) {
                try {
                    Integer.parseInt(bufferedReader.readLine());
                    qtdRegistros++;
                } catch (NumberFormatException e) {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return qtdRegistros;
    }

    public static void gravaResultados(List<Resultado> resultados) {
        try (FileWriter fileWriter = new FileWriter(SAIDA)) {
            PrintWriter arquivoGravacao = new PrintWriter(fileWriter);

            resultados.forEach(resultado -> arquivoGravacao.println(resultado.toString()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
