package Patterns;

public class leftTriangleNumber {
  public static void main(String[] args) {
    System.out.println("left triangle using number");
    int row = 5;
    int i = 1;
    while (i<=row) {
      int j= 1;
      while (j<=i) {
        System.out.print(i+" ");
        j++;
      }System.out.println();
      i++;
    }
  }
}
