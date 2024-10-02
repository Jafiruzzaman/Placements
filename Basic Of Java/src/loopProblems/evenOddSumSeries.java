package loopProblems;

public class evenOddSumSeries {
  public static void main(String[] args) {
    System.out.println("the sum of even odd series");
    // input --> 1-2+3-4+5-6+7 => 4
    int input = 9;
    int answer = 0;
    int i =0;
    while (i<=input) {
      if (i%2==0) {
        answer-=i;
      }else{
        answer+=i;
      }
      i++;
    }
    System.out.println("the sum of the series is "+answer);
  }
}
