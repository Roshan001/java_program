import java.util.Scanner;


public class String_add {

	/**
	 * @param args
	 * 
	 */
	
	public static int S_I_convert(String str) {
	    int sum = 0, factor = 1;
	    for (int i = str.length()-1; i >= 0; i--) {
	        sum += (str.charAt(i) - 48) * factor;
	        factor *= 10;
	    }
	    return sum;
	}
	public static void main(String[] args) {
		
		String str1 = "1234";
		String str2 = "1111";
		
		System.out.println(S_I_convert(str1) + S_I_convert(str2));
		


}

}
