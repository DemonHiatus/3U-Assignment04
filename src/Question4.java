
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author baayl3669
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create the input for the user 
        Scanner input = new Scanner(System.in);

        // Ask user how much the food cost
        System.out.println("How much does the food for prom cost?");
        double food = input.nextDouble();
        // Ask user how much the DJ cost
        System.out.println("How much does the DJ cost?");
        double dj = input.nextDouble();
        // Ask user how much it cost to rent the hall
        System.out.println("How much does it cost to ren the hall?");
        double hall = input.nextDouble();
        // Ask the user how much the decoration cost
        System.out.println("How much does decorations cost?");
        double decoration = input.nextDouble();
        // Ask the user how much does it cost for staff
        System.out.println("How much does it cost for staff?");
        double staff = input.nextDouble();
        // Ask the user how much the miscellaneous cost
        System.out.println("How much for miscellaneous cost?");
        double other = input.nextDouble();

        double cost = (double) ((food + dj + hall + decoration + staff + other));
        double ticket = (double) ((food + dj + hall + decoration + staff + other) / 35);

        System.out.println("Your total cost is $" + Math.ceil(cost) + ". You will need to sell " + Math.ceil(ticket) + "tickets to break even.");
    }
}
