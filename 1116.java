import java.util.Scanner;
public class Abc{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Scanner sd = new Scanner(System.in);
    float x = sd.nextFloat();
    float y = sd.nextFloat();
    for(start=1,start <=N, start++) {
      int ans = x/y;
      if(ans != undefined) {
        System.out.print(ans); }
      else {System.out.print("divisao impossivel");}
    }
  }
}
