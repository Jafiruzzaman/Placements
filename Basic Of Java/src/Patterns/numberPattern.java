package Patterns;

public class numberPattern {
  public static void main(String[] args) {
    System.out.println("number pattern in java");
    int row = 3;
    int col = 6;
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= col; j++) {
        if ((i+j)%2==0) {
          System.out.print(1+" ");
        }else{
          System.out.print(2+" ");
        }
      }System.out.println();
    }
  }
}
