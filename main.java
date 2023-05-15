package Poo;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int gol;
            
            System.out.println("Quantidade de gols foi de?");
            gol = scanner.nextInt();
            
            System.out.println("Quantidade de gols foi de " + gol);
        }

    }
}