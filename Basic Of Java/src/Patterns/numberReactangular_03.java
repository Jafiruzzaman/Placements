package Patterns;

public class numberReactangular_03 {
   public static void main(String[] args) {
      System.out.println("number rectangular 03");
      int number = 3;
      int i = 1;
      int count =1;
      while (i<=number) {
        int j= 1;
        while (j<=number) {
          System.out.print(count+" ");
          count++;
          j++;
        }
        System.out.println();
        i++;
      }
    }
}

