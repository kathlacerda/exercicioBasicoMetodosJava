public class Principal {
    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        // Mensagem
        System.out.println("Exercício mensagem");
        System.out.print("9 horas: ");
        Mensagem.obterMensagem(9);
        System.out.print("14 horas: ");
        Mensagem.obterMensagem(14);
        System.out.print("1 hora: ");
        Mensagem.obterMensagem(1);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        System.out.println("Empréstimo de R$ 1.000");
        System.out.print("Em duas vezes: ");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        System.out.print("Em três vezes: ");
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        System.out.print("Em cinco vezes: ");
        Emprestimo.calcular(1000, 5);
    }
}
