package lab6;
public class Plate {
	public static void main(String[] args){
		
//random letter----------------------------------------------------------		
		
		double a = Math.random();
		int rand1 = (int) (a *25)+65;
		char firstLetter = (char) rand1;
		System.out.print(firstLetter);
		
		double b = Math.random();
		int rand2 = (int) (b *25)+65;
		char secondLetter = (char) rand2;
		System.out.print(secondLetter);
		
		double c = Math.random();
		int rand3 = (int) (c *25)+65;
		char thirdLetter = (char) rand3;
		System.out.print(thirdLetter);
		
	//random number --------------------------------------------------	
		double d = Math.random();
		double rand4 = (d *10);
		int randNum1 = (int)rand4;
		System.out.print(randNum1);
		
		double e = Math.random();
		double rand5 = (e *10);
		int randNum2 = (int)rand5;
		System.out.print(randNum2);
		
		double f = Math.random();
		double rand6 = (f *10);
		int randNum3 = (int)rand6;
		System.out.print(randNum3);
		
		double g = Math.random();
		double rand7 = (g *10);
		int randNum4 = (int)rand7;
		System.out.print(randNum4);
		
		
		
	}
}
