package loopProblems;

public class reverseDigit {
  public static void main(String[] args) {
    System.out.println("reverse digit problem");
    int input = 12354; // input --> 12354 output --> 45321
    int reverse = 0;
    while (input>0) {
      reverse = (reverse*10)+(input%10);
      input/=10;
    }
    System.out.println("The reverse digit is "+reverse);
  }
}
