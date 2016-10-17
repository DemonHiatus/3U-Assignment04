
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
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // user input for the speed limit and the users speed 
        System.out.println("Enter the speed limit.");
        int limit = input.nextInt();
        System.out.println("Enter the recorded speed of the car.");
        int speed = input.nextInt();

        int answer = speed - limit;

        // user not speeding
        if (answer <= 0) {
            System.out.println("You are within the speed limit!");

        } // user getting fined $100
        else if (1 <= answer && answer <= 20) {
            System.out.println("You are speeding. Your fine is $270");

        } // user getting fined $500
        else if (answer <= 31) {
            System.out.println("You are speeding. Your fine is $500");
        }
    }

}
