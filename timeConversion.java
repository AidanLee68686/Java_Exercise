import java.util.Scanner;

public class timeConversion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bjt = sc.nextInt();
		int utc = 0;

		if (bjt-800 >= 0) {
			utc = bjt - 800;
		}
		else {
			utc = bjt + 1600;
		}
		
		System.out.print(utc);
		
	}
}
