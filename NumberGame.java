package numberGame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	
        Scanner input = new Scanner(System.in);
        boolean hasEqual=false;
         int randomNumber = (int) (Math.random()*100) + 1; // Assigning a random Number to randomNumber Variable
        System.out.println("I have chosen a random Number from 1 to 100.");
        System.out.println("Try to Guess it and you win.");
        for(int i=10; i>0; i--)
        {
            System.out.println("You have "+i+" guess(es) left, Guess again: ");
            int guess = input.nextInt();
            System.out.println("Your guess was "+guess+".");
            if(guess>randomNumber)
                System.out.println("It is less than "+guess+".");
            else if(guess<randomNumber)
                System.out.println("It is greater than "+guess+".");
            else {
                hasEqual = true;
                break;
            }
        }

        if(hasEqual)
            System.out.println("Correct...You Win!!!");
        else{
            System.out.println("Game Over....You Lose!!!");
            System.out.println("The Number was "+randomNumber+".");
        }
    }
}
