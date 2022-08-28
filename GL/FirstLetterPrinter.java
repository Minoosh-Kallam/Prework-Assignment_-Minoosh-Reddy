
import java.util.Scanner; 

public class FirstLetterPrinter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		System.out.println(firstLetterPrinter(input));
		in.close(); 
	}

	static String firstLetterPrinter(String str) {
		// write your code here
		String ans = "" ;
		char prevChar= ' ' ;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
				if(prevChar == ' ') {
					prevChar = ch ;
					ans += ch ;
				}
			}
			else {
				prevChar = ' ' ;
			}
		}
		
		
		return ans ;
	}
}
