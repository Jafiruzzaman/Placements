package Patterns;

class numberRectangular_02 {
    public static void main(String[] args) {
      System.out.println("number rectangular ");
      int number = 4;
      int i = 1;
      while (i<=number) {
        int j= 1;
        while (j<=number) {
          System.out.print(j+" ");
          j++;
        }
        System.out.println();
        i++;
      }
    }
}