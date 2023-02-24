package br.com.java.io.teste;

import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {

        //Fluxo de Entrada com Arquivos
        OutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        //metodo para inserir string no arquivo.txt
        bw.write("Sed non nisi nisl. Duis pellentesque eros quis ex placerat tempus.");
        //metodo para pular linha
        bw.newLine();
        bw.newLine();
        bw.write("teste Pedro 123...");

        bw.close();

    }
}
