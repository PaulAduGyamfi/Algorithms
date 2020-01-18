import java.util.Scanner;

public class ElimDup {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		int[] numbers = new int[10]; 
		
		System.out.print("Enter ten number: ");
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextInt();

		
		int[] myList = eliminateDuplicates(numbers);

		
		System.out.print("The distinct numbers are:");
		for (int x: myList) {
			if (x > 0)
				System.out.print(" " + x);
		}
		System.out.println();
		
		input.close();
	}

	
	public static int[] eliminateDuplicates(int[] list) {
		int[] dlist = new int[list.length];
		int i = 0;	
		for (int x: list) {
			if (linearSearch(dlist, x) == -1) {
				dlist[i] = x;
				i++;
			}
		}
		return dlist;
	}

	public static int linearSearch(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (key == array[i])
				return i;
		}
		return -1;
	}
}
