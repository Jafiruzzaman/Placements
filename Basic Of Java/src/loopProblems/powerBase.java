package loopProblems;

public class powerBase {
  public static void main(String[] args) {
    System.out.println("power base problem");
    int base = 2;
    int power = 6;
    int answer = 1;
    int i = 1;
    while (i<=power) {
      answer = answer*base;
      i++;
    }
    System.out.println("The result is "+answer);
  }
}
