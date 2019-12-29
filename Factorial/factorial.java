import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int userIn  = input.nextInt();
		int all = 1;
		for(int i= 1; i<=userIn; i++) {
		all = all * i;
			
		}
		System.out.print("Factorial is : " + all);
		input.close();
	}
}
