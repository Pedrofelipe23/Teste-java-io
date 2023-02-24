package br.com.java.io.teste;

import java.io.*;

public class TesteEscritaFileWriter {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem3.txt"));

        //metodo para inserir string no arquivo.txt
        bw.write("Sed non nisi nisl. Duis pellentesque eros quis ex placerat tempus.");
        //metodo para pular linha
        bw.newLine();
        bw.newLine();
        bw.write("teste Pedro 123...");

        bw.close();

    }
}
