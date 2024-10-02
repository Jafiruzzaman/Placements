package Patterns;

public class leftTriangleNumber_03 {
  public static void main(String[] args) {
    System.out.println("left triangle using number problem");
    int row = 4;
    int i = 1;
    int count = 1;
    while (i<=row) {
      int j = 1;
      while (j<=i) {
        System.out.print(count+" ");
        count++;
        j++;
      }System.out.println();
      i++;
    }
  }
}
