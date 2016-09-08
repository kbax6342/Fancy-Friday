import java.util.Scanner;

/**
 *This is a demo app for deciding what to wear.
 * 
 */

/**
 * @author kbaxter
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String inputFancyFriday, inputSunny , inputRaining;
		
		boolean fancyFriday = false;
		boolean sunny =false; 
		boolean raining = false;
		
		Scanner input = new Scanner(System.in);
		// Get input from the user
		System.out.println("Is it fancy friday?");
			inputFancyFriday = input.nextLine();
			
		System.out.println("Is it sunny?");
			inputSunny = input.nextLine();	
			
		System.out.println("Is it raining?");
			inputRaining = input.nextLine();
			
		//Test if the variable is working
		//System.out.println(inputFancyFriday + " " + inputSunny + " " + inputRaining);
			
		if(inputFancyFriday.equalsIgnoreCase("yes")) fancyFriday = true;
		
		if(inputSunny.equalsIgnoreCase("yes"))  sunny = true;
		
		if(inputRaining.equalsIgnoreCase("yes"))  raining = true;
		
		//Test if the variable is working
				System.out.println(fancyFriday + " " + sunny + " " + raining);
		
		//Set condition variables based on input

		
		
		//Use if statement to decide what to wear
		
		
		
	}

}
