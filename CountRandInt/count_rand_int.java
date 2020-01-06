public class OopRandNum {
	public static void main(String[] args) {
		int[] counts = new int[10];
		 for (int i = 0; i < 100; i++) {
			   counts[genRand(0, 9)]++;
			  } 
		  for (int i = 0; i < counts.length; i++) {
		   System.out.println( i + "----> " + counts[i] + " times" );
		  }
		 
		 }
		 public static int genRand(int y, int x) {
		  return (int) ( Math.random()
		    * (x - y + 1)+ y);
		 }
		 
		}
