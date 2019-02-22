
package printing_numbers;

import java.util.Scanner;

public class Printing_numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = n, i = 1, c =0;
        while(b>0) {
            b/=10;
            c++;
        }
        while(n>0) {
            int div = (int)Math.pow(10, c-1);
            int x = (n/div);
            System.out.println(x);
            n%=div;
            c--;
            
        }
    }
    
}
