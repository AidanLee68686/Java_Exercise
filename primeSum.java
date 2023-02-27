import java.util.Scanner; 

public class primeSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		int num = 1;
		int sum = 0;
		int count = 0;
		int tempCount = 0;
		int tempNum = 1;
		
		while (true) {
			if (tempCount == start) {
				break;
			}
			else {
				if (isPrime(tempNum)) {
					tempCount ++;
					tempNum++;
				}
				else {
					tempNum++;
				}
			}
		}
		
		/*
		while (true) {
			if (count > end) {
				break;
			}
			else if (count < start) {
				
			}
		}
		*/
		System.out.print(tempNum);
	}
	
	static boolean isPrime(int n) {
		for (int i=2; i<=Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	static int nextPrime(int n) {
		while (isPrime(n) == false) {
			n++;
		}
		return n;
	}
	
}
