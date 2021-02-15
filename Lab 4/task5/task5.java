
public class task5{
    public static void main(String[] args){
        int number1 = (int) (Math.random() * 9);
        int number2 = (int) (Math.random() * 9);
        int number3 = (int) (Math.random() * 9);
        int number4 = (int) (Math.random() * 9);
        String number = (String) (number1 + "" + number2 + "" + number3 + "" + number4);

        /// create random 4 digit of number
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int random1 = (int) (Math.random() * 26);
        int random2 = (int) (Math.random() * 26);
        int random3 = (int) (Math.random() * 26);
        ///create 3 random number from 0 to 26

        char randomletter1 = (abc.charAt(random1));
        char randomletter2 = (abc.charAt(random2));
        char randomletter3 = (abc.charAt(random3));
        ///covert numbers into letter

        System.out.print(randomletter1 + "" + randomletter2 + "" + randomletter3 + "" + number);



    }
}