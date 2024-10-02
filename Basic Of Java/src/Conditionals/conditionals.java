package Conditionals;

public class conditionals {
    public static void main(String[] args) {
        System.out.println("conditionals");
        // if else statement
        // This is if statement without using curly-braces
        int age = 20;
        if (age>=18)
            System.out.println("you are greater than 18");
            System.out.println("your are a teen");
        
        // This is if statement with using curly-braces
        if (age>=18){
            System.out.println("you are greater than 18");
            System.out.println("your are a teen");
        }
        // If else statement
        if (age>18) {
            System.out.println("the age is greater than 24");
        } else {
            System.out.println("your age is less than 24");
        }
        // Check user input number is negative positive or negative or zero
        int num = -1;
        if (num>0) {
            System.out.println("The number is positive");
        } else {
            if (num<0) {
            System.out.println("The number is negative");
                
            } else {
                System.out.println("The number is zero");
            }
        }
        // modify code using if,else-if,else , else statement it's more readable
        if (num>0) {
            System.out.println("The number is positive");
        } else if (num<0) {
            System.out.println("The number is negative");
        } 
        else {
                System.out.println("The number is zero");
            }
        
        // Switch case statement
        // if you don't use break it fall-through into case
        String day = "sunday";
        switch (day) {
            case "saturday":
                System.out.println("The day is saturday");
                break;
            case "sunday":
                System.out.println("The day is sunday");
                break;
            case "monday":
                System.out.println("The day is monday");
                break;
            case "tuesday":
                System.out.println("The day is tuesday");
                break;
            case "wednesday":
                System.out.println("The day is wednesday");
                break;
            case "thursday":
                System.out.println("The day is thursday");
                break;
            case "friday":
                System.out.println("The day is friday");
                break;
            default:
            System.out.println("The day is not valid");
                break;
        }
    }
}
