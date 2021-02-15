import java.util.Scanner;

public class task4{
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a number below 10");
    int number = input.nextInt();



    number += 7;
    // adding 7 to number
    number -= 7;
    // subtracting 7 from number
    int count = 0;

//incremnets until the value of number reaches 10 and counts how many times it took to reach 1-/
    while (number < 10){
        number++;
        ++count;

    }
//calculates the original number entred by subtracting 10 by count
        int numberFinal = 10 - count;
        System.out.println("The number " + numberFinal + " is " + count + " away from 10");
        int idk = numberFinal - 1;
    }
    }