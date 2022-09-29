import org.w3c.dom.Document;

import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        int playerANumber = 0;
        var random = Math.floor(Math.random() * 10 + 1);



        System.out.println("Enter an integer from 1 through 10");
        playerANumber = in.nextInt();
        System.out.println();


        if (playerANumber == random){
            System.out.println("WRITE ON THE MONEY!!");
        }else if (playerANumber > random){
            System.out.println("A little too high.");
        }else if (playerANumber < random) {
            System.out.println("A little too low.");
        }
        System.out.printf("Random Number: %.0f%n", random);




    }
}
