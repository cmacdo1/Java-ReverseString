import java.util.Scanner;

public class ReverseString
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter A Phrase: ");
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();

		String rev = "";

		for (char i: arr)

			rev = i + rev;  

		System.out.println("Your phrase in reverse is: " + rev); 
		
		scanner.close();
	}
}
