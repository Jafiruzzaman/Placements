package Patterns;

public class leftTriangleStar {
  public static void main(String[] args) {
    System.out.println("left side triangle pattern");
    int row = 5;
    int i = 1;
    while (i<=row) {
      int j = 1;
      while (j<=i) {
        System.out.print("* ");
        j++;
      }System.out.println();
      i++;
      
    }
  }
}
