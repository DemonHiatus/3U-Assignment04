
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
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create the input for the user 
        Scanner input = new Scanner(System.in);
        
        // ask user the number of daytime minutes
        System.out.println("Number of daytime minutes?");
        double day = input.nextDouble();
        
        // ask user the number of evening minutes
        System.out.println("Number of evening minutes?");
        double eve = input.nextDouble();
        
        // ask user the number of weekend minutes
        System.out.println("Number of weekend minutes?");
        double weekend = input.nextDouble();

        // storing Plan A 
        double planA = (day - 100) * .25;
        if (planA < 0) {
            planA = 0;
        }
        double alpha = planA + (eve * .15) + (weekend * .20);

        // storing Plan B
        double planB = (day - 250) * .45;
        if (planB < 0) {
            planB = 0;
        }
        double beta = planB + (eve * .35) + (weekend * .25);
        
        // rounding off result
        alpha = Math.round(alpha * 100) / 100.0;
        beta = Math.round(beta * 100) / 100.0;

        // output of which one is cheaper
        System.out.println("Plan A cost $" + alpha + ".");
        System.out.println("Plan B cost $" + beta + ".");

        if (alpha == beta) {
            System.out.println("Plan A and B are the same price.");
        } else if (alpha > beta) {
            System.out.println("Plan B is the cheapest.");
        } else if (beta > alpha) {
            System.out.println("Plan A is the cheapest.");
        }

    }
}
