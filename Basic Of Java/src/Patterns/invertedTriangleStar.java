package Patterns;

public class invertedTriangleStar {
  public static void main(String[] args) {
    System.out.println("inverted triangle using star");
    int row = 5;
    while (row>0) {
      int j = 1;
      while (j<=row) {
        System.out.print("* ");
        j++;
      }System.out.println();
      row--;
    }
  }
}
