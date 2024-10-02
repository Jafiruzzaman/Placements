package Loops;

public class Loop {
  public static void main(String[] args) {
    System.out.println("loops in java");
    /*
      There a are mainly 3 types of loop in java
      1. for loop
      2. while loop
      3. do while loop
     */
      // 1. for loop
      int num = 1;
      for (int i = 0; i < num; i++) {
        System.out.println("the value is "+i);
      }
      int i =0;
      while (i<=num) {
        System.out.println("This value is print by while loop "+i);
        i++; // make sure that you must be increment i value. if don't the loop will be 
      }
      do {
        System.out.println("The value print by do while loop "+i);
        i++;
      } while (i<num);
  }
}
