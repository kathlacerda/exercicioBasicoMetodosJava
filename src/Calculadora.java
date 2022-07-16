public class Calculadora {
    private static double resultado;
    public static void soma(double firstNumber, double secondNumber) {

        resultado = firstNumber + secondNumber;

        System.out.println("A soma de " + firstNumber + " mais " + secondNumber + " é " + resultado);
    }

    public static void subtracao(double firstNumber, double secondNumber) {

        resultado = firstNumber - secondNumber;

        System.out.println("A subtracao de " + firstNumber + " menos " + secondNumber + " é " + resultado);
    }

    public static void multiplicacao(double firstNumber, double secondNumber) {

        resultado = firstNumber * secondNumber;

        System.out.println("A multiplicação de " + firstNumber + " vezes " + secondNumber + " é " + resultado);
    }

    public static void  divisao(double firstNumber, double secondNumber) {

        if(firstNumber == 0){
            if (secondNumber == 0){
                resultado = 0;
            }else{
                System.out.println("Zero não é divisível por outro número");
            }
        }
        resultado = firstNumber / secondNumber;

        System.out.println("A divisão de " + firstNumber + " por " + secondNumber + " é " + resultado);
    }
}
