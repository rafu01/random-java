
package pattern.pkg1.to.n.to.pkg1;

import java.util.Scanner;


public class Pattern1ToNTo1 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int nb=n;
       int h=1, m;
       for(int j = nb; j>0; j--){
            for(int i=1; i<=nb; i++)
            {
                System.out.print(i);
            }
       nb-=1;
       System.out.println("");
       }
       for(int k = n; k >0; k--){
           
           for(m = 1;m<=h && h<=n;m++)
           {   
               
               System.out.print(m);
               
           }
           
           h++;
           System.out.println("");
       }
    }
    
}
