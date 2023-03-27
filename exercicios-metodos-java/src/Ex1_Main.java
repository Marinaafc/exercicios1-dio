
public class Ex1_Main {
    
    public static void main(String[] args) {
        

        // Calculadora
        System.out.println("Exercício calculadora");
        Ex1_Calculadora.soma(3,6);
        Ex1_Calculadora.subtracao(9,1.8);
        Ex1_Calculadora.multiplicacao(7,8);
        Ex1_Calculadora.divisao(5,2.5);

        // Mensagem
        System.out.println("Exercício mensagem");
        Ex1_Mensagem.obterMensagem(9);
        Ex1_Mensagem.obterMensagem(14);
        Ex1_Mensagem.obterMensagem(1);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Ex1_Emprestimo.calcular(1000, Ex1_Emprestimo.getDuasParcelas());
        Ex1_Emprestimo.calcular(1000, Ex1_Emprestimo.getTresParcelas());
        Ex1_Emprestimo.calcular(1000, 5);
    }
}
