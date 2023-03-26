package ex_resolvidos_est_repeticao;
import java.util.Scanner;

public class Ex6_Fatorial {
    
/*
 * Faça um programa que calcule o fatorial de um 
 * número inteiro fornecido pelo usuário.
 * Ex.: 5! = 120 (5x4x3x2x1)
 */

public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Fatorial: ");
    long fatorial = scan.nextLong();

    long multiplicacao = 1L;

    for(long i = fatorial; i >= 1 ; i--){
        multiplicacao *= i;

    }
    System.out.println(fatorial +"! = " + multiplicacao);
}

}
