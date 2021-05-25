
public class Calc {

    public void calcTest(char action, double firstNumber, double secondNumber){

        double result;

        switch (action){
            case '+': result = firstNumber + secondNumber;
                System.out.println("Сумма чисел " +firstNumber+ " и " +secondNumber+ " = "+ result);
                break;
            case '-': result = firstNumber - secondNumber;
                System.out.println("Вычатание чисел " +firstNumber+ " и " +secondNumber+ " = "+ result);
                break;
            case '*': result = firstNumber * secondNumber;
                System.out.println("Умножение чисел " +firstNumber+ " и " +secondNumber+ " = "+ result);
                break;
            case '/': result = firstNumber / secondNumber;
                System.out.println("Деление чисел " +firstNumber+ " и " +secondNumber+ " = "+ result);
                break;
            default: System.out.println("Введено неверное условие уравнения");
                break;
        }

    }
}
