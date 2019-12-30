import java.util.Scanner;
public class WordReverse{
		public static String reverse(String st){
    		
		char[] x = st.toCharArray();
		String newstring = "";
        for (int i = x.length-1; i>=0; i--)
             newstring += String.valueOf(x[i]);
			return newstring;
}


		public static void main(String args[]){
			Scanner input = new Scanner(System.in);
			String st = input.nextLine();
			
		System.out.println(reverse(st));
			input.close();
		}
}
