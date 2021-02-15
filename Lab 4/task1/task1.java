import java.util.Scanner;

public class task1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Entert the tempreture in Farhrenheit between -58F and 41F:");
        Double tempreture = input.nextDouble();
        
    if(tempreture >= 41  ||  tempreture <= -58){
        System.out.println("Tempreture entered is invalid");
    }
       else{
        System.out.println("Enter the wind speed miles per hour, must be greater than or eqaul to 2");
        Double speed = input.nextDouble();

            if(speed < 2){
        System.out.println("Wind speed entered is invalid");
    }
            else{
                Double V = Math.pow(speed, 0.16);
        Double windindex = 35.74 + 0.6215 * tempreture - 35.75 * V + 0.4275 * tempreture * V;

        System.out.println("The wind chill index is " + windindex);
            }

    }

       }
       
}