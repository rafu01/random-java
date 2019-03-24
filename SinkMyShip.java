
package sinkmyship;
import  java.util.Random;

import  java.util.Scanner;

public class SinkMyShip {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int location1 = ran.nextInt(6)+1;
        int location2 = ran.nextInt(6)+1;
        int location3 = ran.nextInt(6)+1;
        for(int i=0; i< i+1; i++){
        if(location1 == location2 || location2 == location3 || location3 == location1){
             location1 = ran.nextInt(6)+1;
             location2 = ran.nextInt(6)+1;
             location3 = ran.nextInt(6)+1;
        }
        else break;
        }
//       System.out.println(location1);
//       System.out.println(location2);
//       System.out.println(location3);
        int guess, hits=0, guessc =0, guesschecker=0;
        boolean isSunk = false;
        for(int i=0; isSunk == false;i++) {
            System.out.println("Ready! Aim! Fire! (pick a number 1-6)");
            guess = sc.nextInt();
            guessc++;
            if(guesschecker != guess){
            
            if(guess == location1 || guess == location2 || guess == location3 ){
                hits++;
                System.out.println("HIT");
            }
            else System.out.println("Miss");
            guesschecker= guess;
            }
            else System.out.println("Use different number");
            if(hits == 3){
                isSunk = true;
                System.out.println("You sunk my ship");
            }
        }
        System.out.println("you took "+ guessc+" turns to sink my battleship");
    }
    
}
