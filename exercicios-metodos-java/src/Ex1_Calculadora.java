public class Ex1_Calculadora {
/* Criar uma aplicação que resolva as seguintes situações:

 * - Calcular as 4 operações básicas (soma, subtração, multiplicação e divisão)
 * 2 valores devem ser passados como parâmetros.
 * - A partir da hora do dia, informar a mensagem adequada 
 * (Bom dia, Boa tarde ou Boa noite).
 * - Calcular o valor final de um empréstimo a partir do valor solicitado.
 * Taxas e parcelas influenciam. Definir as faixas que irão influenciar nos valores.
 */

public static void soma(double numero1, double numero2) {

    double resultado = numero1 + numero2;
    System.out.println("A soma de " + numero1 + " mais " + numero2 + " é " + resultado);
}

public static void subtracao(double numero1, double numero2) {

    double resultado = numero1 - numero2;
    System.out.println("A subtração de " + numero1 + " menos " + numero2 + " é " + resultado);
}

public static void multiplicacao(double numero1, double numero2) {

    double resultado = numero1 * numero2;
    System.out.println("A multiplicação de " + numero1 + " vezes " + numero2 + " é " + resultado);
}

public static void divisao(double numero1, double numero2) {

    double resultado = numero1 / numero2;
    System.out.println("A divisão de " + numero1 + " por " + numero2 + " é " + resultado);
}

    }
