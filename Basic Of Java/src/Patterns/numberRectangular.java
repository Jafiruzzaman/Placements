package Patterns;

class numberRectangular {
    public static void main(String[] args) {
      System.out.println("number rectangular ");
      int number = 4;
      int i = 1;
      while (i<=number) {
        int j= 1;
        while (j<=number) {
          System.out.print(i+" ");
          j++;
        }
        System.out.println();
        i++;
      }
    }
}