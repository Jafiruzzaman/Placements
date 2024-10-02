package Patterns;

public class holoRectangular {
  public static void main(String[] args) {
    System.out.println("holo rectangular java");
    int row = 6;
    int col = 6;
    int i = 0;
    while (i<=row) {
      int j =0;
      while (j<=col) {
        if ((i==0 || j==0 || i==row || j==col)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
        j++;
      }
      System.out.println();
      i++;
    }
  }
}
