
package javaapplication19;

import java.util.Scanner;

public class JavaApplication19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = String.valueOf(n).length();
        String s="";
        for(int i=1; i<=count; i++)
        {
            int digit = n%10;
            //System.out.println(digit);
            switch (digit) {
                case 0:
                    s = "zero "+s;
                    //System.out.println(s);
                    break;
                case 1:
                    s = "one "+s;
                    //System.out.println(s);
                    break;
                case 2:
                    s = "two "+s;
                    //System.out.println(s);
                    break;
                case 3:
                    s = "three "+s;
                    //System.out.println(s);
                    break;
                case 4:
                    s = "four "+s;
                    //System.out.println(s);
                    break;
                case 5:
                    s = "five "+s;
                    // System.out.println(s);
                    break;
                case 6:
                    s = "six "+s;
                    //System.out.println(s);
                    break;
                case 7:
                    s = "seven "+s;
                    //System.out.println(s);
                    break;
                case 8:
                    s = "eight "+s;
                    //System.out.println(s);
                    break;
                case 9:
                    s = "nine "+s;
                    //System.out.println(s);
                    break;
                default:
                    break;
            }
            n/=10;
            
        }
        System.out.println(s);
        

}    
}
