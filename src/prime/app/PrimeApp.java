package prime.app;
import java.util.ArrayList;
import consolehelper.util.Console;

public class PrimeApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the prime number checker!");
		int num = Console.getInt("Please enter an integer between 1 and 5000: ", 1, 5000);
		String choice = "n";
		
		do  { 
			ArrayList<String> primeFactor = new ArrayList<String>();
			for(int i = 1; i<= num/2; i++ ) {
				if(num%i == 0) {
					if(!primeFactor.contains(String.valueOf(i))) {
						primeFactor.add(String.valueOf(i));
					} 
				}
			}
	        if(primeFactor.size()<=2) {
	        	System.out.println(num+" is a prime number\n");
	        } else {
	        	System.out.println(num+ " is NOT a prime number\nIt has "+primeFactor.size()+" factors: "+ primeFactor.toString() + "\n");
	        }
	        choice = Console.getString("Try again? (Y/N): ");
		} while (choice.equalsIgnoreCase("n"));
			
	}
}