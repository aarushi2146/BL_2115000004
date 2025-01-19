import java.util.*;
public class Arithmetic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int result;
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        System.out.println("Enter operator");
        char operator = sc.next().charAt(0);

        switch (operator){
            case '+':
                result = num1+num2;
                System.out.println("Result is "+result);
                break;
            case '-':
                result = num1-num2;
                System.out.println("Result is "+result);
                break;
            case '*':
                result = num1*num2;
                System.out.println("Result is "+result);
                break;
            case '/':
                result = num1/num2;
                System.out.println("Result is "+result);
                break;
        }
    }
}
