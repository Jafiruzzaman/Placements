package loopProblems;

public class countOfDigit {
  public static void main(String[] args) {
    System.out.println("sum of digit");
    // input --> 12354 output --> 1+2+3+5+4 = 15
    int input = 12354;
    int count = 0;
    while (input>0) {
      input/=10;
      count++;
    }
    System.out.println("The result is "+count);
  }
}
