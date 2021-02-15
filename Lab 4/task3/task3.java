import java.util.Scanner;

public class task3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an integer between 0 and 999 inclusive:");
        int number = input.nextInt();

        int num1 = number/100;
        int num2 = (number - num1 * 100)/10;
        int num3 = (number - num1 * 100 - num2 * 10);
        int result = num1 + num2 + num3;

        System.out.println("The sum of all digits in " + number + " is " + result);

    }
}