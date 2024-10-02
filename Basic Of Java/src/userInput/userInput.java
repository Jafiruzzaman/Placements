package userInput;
import java.util.Scanner;
public class userInput {
    public static void main(String[] args) {
        System.out.println("user input in java");
//        To take input from user's make sure the scanner is import
        Scanner sc = new Scanner(System.in);
//        Store data in variables
        System.out.println("Enter your number in byte");
        byte miniNum = sc.nextByte();
        System.out.println("The number is stored in byte "+miniNum);

        System.out.println("Enter your number in short ");
        short shortNumb = sc.nextShort();
        System.out.println("The number is stored in byte "+shortNumb);

        System.out.println("Enter your number ");
        int num = sc.nextInt();
        System.out.println("The number is stored in byte "+num);

        System.out.println("Enter your weight");
        float weight = sc.nextFloat();
        System.out.println("The number is stored in byte "+weight);

        System.out.println("Enter your height ");
        double height = sc.nextDouble();
        System.out.println("The number is stored in byte "+height);

        System.out.println("Enter your first name ");
        String firstName = sc.next(); // it will peak the first line of the whole sentence
        System.out.println("Your first name is "+firstName);

        System.out.println("Enter your full name ");
        String fullName = sc.nextLine();
        System.out.println("Your fullname is "+fullName);
    }
}
