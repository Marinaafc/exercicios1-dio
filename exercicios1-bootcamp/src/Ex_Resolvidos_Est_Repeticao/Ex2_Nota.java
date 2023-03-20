package Ex_Resolvidos_Est_Repeticao;
import java.util.Scanner;

public class Ex2_Nota {

/*Faça um programa que peça uma nota de 0 a 10
 * Mostre uma mensagem caso o valor seja inválido
 * e continue pedindo até que seja informado um
 * valor válido.
 */
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int nota;

    System.out.println("Nota: ");
    nota = scan.nextInt();

    while(nota < 0 | nota > 10) {
        System.out.println("Nota Inválida! Digite novamente: ");
        nota = scan.nextInt();
    }
    
}
    
}
