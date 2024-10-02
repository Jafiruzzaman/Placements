package loopProblems;

public class sumOfDigit {
  public static void main(String[] args) {
    System.out.println("sum of digits");
    int input = 12354;
    int answer = 0;
    while (input>0) {
      answer+=(input%10);
      input/=10;
    }
    System.out.println("The result is "+answer);
  }
}
