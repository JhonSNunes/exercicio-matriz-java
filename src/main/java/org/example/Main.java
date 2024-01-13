package org.example;


import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Fazer um programa para ler dois números inteiros M e N, e depois ler uma matriz de M
        linhas por N colunas contendo números inteiros, podendo haver repetições. Em seguida, ler um
        número inteiro X que pertence à matriz. Para cada ocorrência de X, mostrar os valores à esquerda,
        acima, à direita e abaixo de X, quando houver, conforme exemplo
         */

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Informe a quantidade de linhas: ");
        Integer lines = sc.nextInt();

        System.out.print("Informe a quantidade de colunas: ");
        Integer cols = sc.nextInt();

        Integer[][] mat = new Integer[lines][cols];

        for (int linesAux = 0; linesAux < mat.length; linesAux++) {
            for (int colsAux = 0; colsAux < mat[linesAux].length; colsAux++) {
                mat[linesAux][colsAux] = sc.nextInt();
            }
        }

        System.out.print("Informe o numero que deseja procurar: ");
        Integer numberToFind = sc.nextInt();

        for (int linesAux = 0; linesAux < mat.length; linesAux++) {
            for (int colsAux = 0; colsAux < mat[linesAux].length; colsAux++) {
                if (mat[linesAux][colsAux].equals(numberToFind)) {
                    System.out.printf("Position: %d, %d\n", linesAux, colsAux);

                    if (colsAux > 0) {
                        System.out.printf("Left: %d\n", mat[linesAux][colsAux-1]);
                    }

                    if (colsAux + 1 < mat[linesAux].length) {
                        System.out.printf("Right: %d\n", mat[linesAux][colsAux+1]);
                    }

                    if (linesAux > 0) {
                        System.out.printf("Up: %d\n", mat[linesAux-1][colsAux]);
                    }

                    if (linesAux + 1 < mat.length) {
                        System.out.printf("Down: %d\n", mat[linesAux+1][colsAux]);
                    }

                    System.out.println("--------------------------------------");
                }
            }
        }
        sc.close();
    }
}