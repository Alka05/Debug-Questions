package debgquestion;

import java.util.Scanner;

public class Debug4 {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("enter number");
		int Speed = number.nextInt();
		if (Speed < 60){
			System.out.println("speed kam hai");
		}else if (Speed < 30) {
			System.out.println("speed bahut kam hai");
		}else if (Speed > 100) {
			System.out.println("speed bahut fast hai");
			
		}

	}

}
