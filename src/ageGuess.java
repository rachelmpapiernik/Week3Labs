import java.util.Random;
import java.util.Scanner;

public class ageGuess {
	public static void main(String[] args) {
		//Declare variables
		int ageGuess;
		String name;
		int age;
		
		//Import scanners
		Random generator = new Random ();
		Scanner sc = new Scanner(System.in);
		age = generator.nextInt(100);
		
		//Prompt user to enter name and guess
		System.out.print("Input Name: ");
		name = sc.nextLine();

		System.out.print("Input ageGuess: ");
		ageGuess = sc.nextInt();
		
		//Output what user has entered
		System.out.println("Name: " + name);
		System.out.println("ageGuess: " + ageGuess);
		
		//Check if age guess equals random age
		if (ageGuess == age)
			{
			System.out.println ("You guessed right!");
			}			
		else
			{
			//Loop through while age guess is not equal to random age
			while (ageGuess != age) //loop until user guesses correctly 
				{
				
				if (ageGuess > age) 
					{
					System.out.println ("Too old. Guess a different age.");
					ageGuess = sc.nextInt();

					}
				else 
					{
					System.out.println ("Too young. Guess a different age.");
					ageGuess = sc.nextInt();

					}
					}
			}
		if (ageGuess == age)
		{
		System.out.println ("You guessed right!");
		}			
		}
	}
