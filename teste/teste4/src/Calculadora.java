public class Calculadora {
    public static void main(String[] args) throws Exception {
        Operadores op = new Operadores();

        System.out.println("O resultado da adição é: "+op.adicao(2, 3));
        System.out.println("O resultado da subtração é: "+op.subtracao(2, 3));
        System.out.println("O resultado da multiplicação é: "+op.multiplicacao(2, 3));
        System.out.println("O resultado da divisão é: "+op.divisao(2, 3));

        System.out.println("O resultado da atribuição soma é: "+op.atb_soma(2, 6));
        System.out.println("O resultado da atribuição subtração é: "+op.atb_subtracao(2, 6));
        System.out.println("O resultado da atribuição multiplicação é: "+op.atb_multiplicacao(2, 6));
        System.out.println("O resultado da atribuição divisão é: "+op.atb_divisao(2, 6));

        System.out.println("O resultado da comparação é: "+op.igual(2, 6));
        System.out.println("O resultado da comparação é: "+op.maior(2, 6));
        System.out.println("O resultado da comparação é: "+op.menor(2, 6));
        System.out.println("O resultado da comparação é: "+op.diferente(2, 6));

        System.out.println("O resultado da comparação é: "+op.op_and(2, 6));
        System.out.println("O resultado da comparação é: "+op.op_or(2, 6));
    }
}

