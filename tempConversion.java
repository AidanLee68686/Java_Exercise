import java.util.Scanner;

//     5/9=0 
public class tempConversion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fahrenheit = sc.nextInt();
		double celsius = (fahrenheit-32) * (5.0/9);
		System.out.print((int)celsius);		
	}
}
