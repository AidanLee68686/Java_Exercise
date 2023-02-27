import java.util.Scanner;

public class signalReport {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int signal = sc.nextInt();
		int secondNum = signal % 10;
		int firstNum = (signal - secondNum)/10;
		
		String firstMessage = "";
		String secondMessage = "";
		
		switch(secondNum) {
		case(1):
			firstMessage = "Faint signals, barely perceptible";
			break;
		case(2):
			firstMessage = "Very weak signals";
			break;
		case(3):
			firstMessage = "Weak signals";
			break;
		case(4):
			firstMessage = "Fair signals";
			break;
		case(5):
			firstMessage = "Fairly good signals";
			break;
		case(6):
			firstMessage = "Good signals";
			break;
		case(7):
			firstMessage = "Moderately strong signals";
			break;			
		case(8):
			firstMessage = "Strong signals";
			break;			
		case(9):
			firstMessage = "Extremely strong signals";
			break;		
		}
		
		switch(firstNum) {
		case(1):
			secondMessage = "unreadable";
			break;
		case(2):
			secondMessage = "barely readable, occasional words distinguishable";
			break;
		case(3):
			secondMessage = "readable with considerable difficulty";
			break;	
		case(4):
			secondMessage = "readable with practically no difficulty";
			break;	
		case(5):
			secondMessage = "perfectly readable";
			break;		
		}
		
		System.out.println(firstNum + "  " + secondNum);
		String message = firstMessage + ", " + secondMessage + ".";
		System.out.print(message);
	}
}
