import java.util.Scanner;


public class String_Rev {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "";
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the String");
		input = reader.nextLine();
		
		String[] ary = input.split("");
		System.out.println("Reverse:");
		
		for(int i = input.length()-1; i>=0;i--){
			System.out.print(ary[i]);
		}

	}

}
