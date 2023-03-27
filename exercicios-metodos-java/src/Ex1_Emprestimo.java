public class Ex1_Emprestimo {

    /* - Calcular o valor final de um empréstimo a partir do valor solicitado.
    * Taxas e parcelas influenciam. Definir as faixas que irão influenciar nos valores.
    */
    
    public static int getDuasParcelas(){
        return 2;
    }
    public static int getTresParcelas(){
        return 3;
    }
    public static double getTaxaDuasParcelas(){
        return 0.3;
    }
    public static double getTaxaTresParcelas(){
        return 0.45;
    }

    public static void calcular(double valor, int parcelas){
        if (parcelas == 2){

            double valorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println("Valor final do empréstimo para 2 parcelas : R$ " + valorFinal);
        }
        else if (parcelas == 3){

            double valorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.println("Valor final do empréstimo para 3 parcelas : R$ " + valorFinal);
        } else {
            System.out.println("Quantidade de parcelas não aceita.");
        }
    }
}
