import java.util.Scanner;
public class StandMean {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers : ");
		double[] myList = new double[10];
		for(int i=0; i< myList.length; i++) {
			
			myList[i] = input.nextDouble();
			
		}
		
		System.out.println("The mean is " + mean(myList));
		System.out.println("The standard deviation is " + deviation(myList));
		
		input.close();
	}
public static double mean(double[] x) {
	
	double sum = 0;
	for(int i=0; i< x.length; i++) {
		
		sum += x[i];
	}
	double average = sum/10.0;
	return average;

}

public static double deviation(double[] x) {
	double devi = 0;
	for(int i=0; i< x.length; i++) {
		
	devi += Math.pow(((x[i]-mean(x))), 2);
		}
	double finaldevi =  Math.sqrt(devi/9);
	return finaldevi;
	}
}
