package ex_resolvidos_est_repeticao;
import java.util.Scanner;

public class Ex5_Tabuada {

/*
 * Desenvolva um gerador de tabuada,
 * capaz de gerar a tabuada de qualquer número inteiro
 * entre 1 a 10.
 * O usuário deve informar o número para gerar a tabuada.
 * A saída deve ser conforme exemplo abaixo:
 * 
 * Tabuada de 5:
 * 5 X 1 = 5
 * 5 X 2 = 10
 * ...
 * 5 X 10 = 50
 */

 /**
 */
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Tabuada: ");   
    int tabuada = scan.nextInt();

    while(tabuada < 1 || tabuada > 10){
        System.out.println("Número Inválido. Digite um número de 1 a 10: ");
        tabuada = scan.nextInt();
    }

    System.out.println("Tabuada de " + tabuada + ": ");

    for(int i = 1; i <= 10; i++){
        System.out.println(tabuada + " X " + i + " = " + (tabuada*i));


    }

 }
    
}
