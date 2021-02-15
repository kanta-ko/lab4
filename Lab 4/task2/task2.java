import java.util.Scanner;

public class task2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a real number");
        double number = input.nextDouble();

        double decimal = number % 1;

        double integer1 = number - decimal;
        int integer = (int) integer1;

        System.out.println("Integer part:" + integer);
        System.out.println("Fraction part:" + decimal);
        
    }
}