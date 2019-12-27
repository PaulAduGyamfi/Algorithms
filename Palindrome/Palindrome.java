import java.util.Scanner;
public class Palindrome2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the input string: ");
		String userIn = input.nextLine();
		if(palin(userIn) == true) {
			System.out.print("Input string "+ userIn + " is a palindrome" );
		}
		else {
			System.out.print("Input string "+ userIn + " is NOT a palindrome" );
		}
		input.close();
	}
	
	public static Boolean palin(String x) {
		String reverse = "";
		for(int i=x.length() -1; i>=0; i--) {
			 reverse += x.charAt(i);
		}
		
		String neww = reverse.replaceAll("\\s", "".trim());
		String orig = x.replaceAll("\\s", "".trim());
		
		if(orig.equalsIgnoreCase(neww)) {
			 return true;
		 }
		return false;
	}
}
