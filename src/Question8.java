
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baayl
 */
public class Question8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int location = 1;
        boolean done = false;

        while (true) {
            System.out.println("Enter sum of dice.");
            int dice = input.nextInt();
            location = location + dice;

            // Exceeding/ equal/ invalid numbers
            if (location > 100) {
                System.out.println("Sorry, you exceeded 100 squares. You are now at the 80th square.");
                if (location >= 100) {
                    location = 91;
                }
            }
            if (location == 100) {
                System.out.println("Congratulations! You won!");
                break;
            }
            if (dice < 2) {
                System.out.println("Your input is incorrect. Try again next turn.");
                location = location - dice;
            } else if (dice == 0) {
                System.out.println("You Quit!");
                break;
            }
            if (location == 100) {
                done = true;
            } else {
                System.out.println("You are now on the square" + location + ".");

                // snakes eating
                if (location == 54) {
                    location = 19;
                    System.out.println("You've been eaten by the snakes! You've descended to square 19.");
                } else if (location == 90) {
                    location = 48;
                    System.out.println("You've been eaten by the snakes! You've descended to square 48");
                } else if (location == 99) {
                    location = 77;
                    System.out.println("You've been eaten by the nsakes! So Close! You've descended to square 77");
                }
                // ladders 
                if (location == 9) {
                    location = 34;
                    System.out.println("You've climbed a ladder! Now go up to square 34.");
                } else if (location == 40) {
                    location = 64;
                    System.out.println("You've climbed a ladder! Now go up to square 64.");
                } else if (location == 67) {
                    location = 86;
                    System.out.println("You've climbed a ladder! You're almost there! Now Go up to square 86.");
                }

            }
        }

    }

}
