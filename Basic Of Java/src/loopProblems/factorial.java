package loopProblems;

public class factorial {
  public static void main(String[] args) {
    System.out.println("factorial problem");
    int fact = 1;
    int i = 1;
    int input = 8;
    while (i<=input) {
      fact= fact * i;
      i++;
    }
    System.out.println("the factorial of  is "+fact);
  }
}
