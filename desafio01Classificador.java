


import java.util.Scanner;
public class desafio01Classificador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Olá, digite o nome do seu herói:");
        String nomeHeroi = scanner.nextLine();

        System.out.println("Bem-vindo, " + nomeHeroi + "! Agora digite o seu XP:");
        int nivelHeroi = scanner.nextInt();

        if (nivelHeroi > 0 && nivelHeroi < 1000) {
            System.out.println("O " + nomeHeroi + " está no nível Ferro.");
        } else if (nivelHeroi >= 1001 && nivelHeroi < 2000) {
            System.out.println("O " + nomeHeroi + " está no nível Bronze.");
        } else if (nivelHeroi >= 2001 && nivelHeroi < 5000) {
            System.out.println("O " + nomeHeroi + " está no nível Prata.");
        } else if (nivelHeroi >= 5001 && nivelHeroi < 7000) {
            System.out.println("O " + nomeHeroi + " está no nível Ouro.");
        } else if (nivelHeroi >= 8001 && nivelHeroi < 9000) {
            System.out.println("O " + nomeHeroi + " está no nível Ascendente.");
        } else if (nivelHeroi >= 9001 && nivelHeroi < 10000) {
            System.out.println("O " + nomeHeroi + " está no nível Imortal.");
        } else if (nivelHeroi >= 10001) {
            System.out.println("O " + nomeHeroi + " está no nível Fodão.");
        } else {
            System.out.println("O " + nomeHeroi + " está em um nível não classificado.");
        }
        
        scanner.close(); 
    }
}
