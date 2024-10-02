package Patterns;

public class Rectangular {
  public static void main(String[] args) {
    System.out.println("rectangular pattern");
    int row = 4;
    int col = 4;
    int i = 0;
    while (i<=row) {
    int j = 0;
      while (j<=col) {
        System.out.print("* ");
        j++;
      }
        System.out.println();
      i++;
    }
  }
}
