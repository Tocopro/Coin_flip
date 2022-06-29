
package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Introduction into the Function for coin simulation
        System.out.println("Coin Flip Simulations");
        // Heads = 0 and Tails = 1
        // initialize the variables for the while loop
        int consecutive = 0;
        int count = 0;
        int coin;
        Scanner result = new Scanner(System.in);
        // get the input from the user in yes or no to flip the coin
        System.out.println("Would you like to continue");
        System.out.println("Enter your Choice 'Yes' or 'No'");
        String answer = result.nextLine();
        answer = answer.substring(0, 1).toUpperCase() + answer.substring(1).toLowerCase();
       if (Objects.equals(answer, "Yes"))
       {
           while (true)
           {
               // initialize the random variable
               Random rand = new Random();
               coin = rand.nextInt(2);
               // condition if true the coin flips head
               if (coin == 0)
               {
                   // display the flip coin face
                   System.out.println( "Coin flip number " + count + " Heads");
                   consecutive += 1;
                   // if the consecutive heads have totaled 3 consecutively
                   if (consecutive == 3)
                   {
                       System.out.println("Simulation Complete! 3 Consecutive Heads have been flipped");
                       break;
                   }
               }
               else
               {
                   // if the coin flip is tails zero consecutive
                   consecutive = 0;
                   System.out.println("Coin flip number " + count + " Tails");
               }
               // increment the count
               count += 1;

           }
           // display the number of flips to reach three consecutive heads 
           System.out.println("Total Number of times the coin was flipped " + count);

       }
       // if the user declines to flip the coin
       else
       {
           System.out.println("Indeterminate");
       }
    }
}
