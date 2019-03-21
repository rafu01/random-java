package javaapplication7;

import java.util.Scanner;

public class JavaApplication7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for(int i =0; i<a.length; i++) {
            a[i]=sc.nextInt();
        }
        int min, index=0;
        for(int i =0; i<a.length; i++){
            min = a[i];
            for(int j =i+1;j<a.length; j++) {
                    if(a[j]<min){
                    min = a[j];
                    index = j;
                }
                
            }
        }
        for(int i = 0; i<a.length; i++) {
            System.out.println(a[i]);
        }
    }
}