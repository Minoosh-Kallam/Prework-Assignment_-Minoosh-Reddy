import java.util.Scanner;

class PatternPrinter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		patternPrinter(n);
	}

	static void patternPrinter(int n) {
		int freq = n ;
		
		while(freq > 0) {
			for(int i=n;i>0;i--) {
				for(int j=0;j<freq;j++) {
					System.out.print(i+" ");
				}
			}
			System.out.println() ;
			freq--;
		}
	}
}