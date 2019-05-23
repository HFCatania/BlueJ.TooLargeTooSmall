

/**
* Write a description of class Main here.
*
* @author (your name)
* @version (a version number or a date)
*/
import java.util.Scanner;
import java.util.Random;
public class Main
{
public static void main (String [] args)
{
Random randomNumber = new Random();
Scanner kbd = new Scanner(System.in);
int computerValue = randomNumber.nextInt(10);
int numberOfTries = 0;
boolean success = false;
int guess = 0;
int prevNumber = 0;
    
    while (success == false){
      
          System.out.println("Please enter an integer between 1 and 10 inclusive: ");
          prevNumber = guess;
          guess = kbd.nextInt();
          
            if(prevNumber != guess)
            {
                numberOfTries++;
            }  
          
          System.out.println("Current number of guesses " + numberOfTries);
            
            if (guess < 1 || guess > 10) {
                System.out.println("Invalid input");
            } 
            else if (guess > computerValue){
                System.out.println("Your guess was too high!");
            }
            else if (guess < computerValue){ 
                System.out.println("Your guess was too low!");
            }
            else
            {
                success = true;
                System.out.println("Congratulations you won! You guessed " + numberOfTries + " times and the number was " + computerValue + "!");
            }       
            
                     
    }
}
}




        /**
     * Constructor for objects of class Main
     */
  
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    