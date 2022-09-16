import java.util.Scanner;

public class activity1{
   
    // Addition
   
    public static double add(double num1, double num2){
        return num1 + num2;
    }

    // Subtraction
   
    public static double subtract(double num1, double num2){
        return num1 - num2;
    }

    // Multiplication
    
    // Division

    public static double multiply(double num1, double num2){
        return num1 * num2;
    }

    public class display{
        public static void main(String[] args) {
            double num1, num2;
        char operator;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Operator(+, -, *, /): ");
        operator = input.next().charAt(0);

        System.out.print("Enter first number: ");
        num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        num2 = input.nextDouble();

        input.close();

        switch( operator ){
            case '+':
                System.out.println(add(num1, num2));
                break;
            case '-':
                System.out.println(subtract(num1, num2));
                break;
            case '/':
                System.out.println(divide(num1, num2));
                break;
            }
        }
    }
}