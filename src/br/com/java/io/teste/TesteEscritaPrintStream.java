package br.com.java.io.teste;

import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaPrintStream {
    public static void main(String[] args) throws IOException {

        PrintStream ps = new PrintStream("lorem4.txt");

        ps.println("Sed non nisi nisl. Duis pellentesque eros quis ex placerat tempus.");
        ps.println();
        ps.println("teste Pedro 123...");
        ps.close();
    }
}
