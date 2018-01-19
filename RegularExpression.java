
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public boolean PatternMatching(String line) {

		Pattern ptn = Pattern.compile("\\d{2}(-|/|.)\\d{2}(-|/|.)\\d{4}");
		Matcher mtch = ptn.matcher(line);
		if (mtch.find()) {
			return true;
		}
		return false;
	}

	public static void main(String a[]) {
		RegularExpression msp = new RegularExpression();
		System.out.println("Enter the string");
		Scanner read1 = new Scanner(System.in);
		String input_string = read1.nextLine();
		System.out.println("Does entered string has date in it " + msp.PatternMatching(input_string));
	}
}
