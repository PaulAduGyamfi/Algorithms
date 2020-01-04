import java.util.Scanner;
public class Matrix {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-3 matrix row by row: ");
		double[][] listrow1 = new double[3][3];
		for(int i=0; i<listrow1.length; i++) {
			for(int j=0; j<listrow1[i].length; j++){
				listrow1[i][j] =input.nextDouble();
			}
		}
		if(isMarkovMatrix(listrow1)) {
			System.out.println("It is a Markov matrix");
		}
		else
			System.out.print("It is not a Markov matrix");
		input.close();
	}

	 public static boolean isMarkovMatrix(double[][] m) {

		double sum1 = 0;
		double sum2 = 0;
		double sum3 = 0;
		for(int x = 0; x<3; x++) {
			sum1 += m[x][0];
			}
		for(int y = 0; y<3; y++) {
			sum2 += m[y][1];
			}
		for(int z = 0; z<3; z++) {
			sum3 += m[z][2];
			}
			if(sum1==1 && sum2==1 && sum3==1) {
				return true;
			}
			else
				return false;
	}
	 	
}

/*
0.15 0.875 0.375
0.55 0.005 0.225
0.30 0.12 0.4
*/
