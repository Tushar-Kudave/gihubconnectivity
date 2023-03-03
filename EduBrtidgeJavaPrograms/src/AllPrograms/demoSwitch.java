package AllPrograms;
import java.util.Scanner;
public class demoSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your CIBIL score to check you ate eligible for getting home loan ??");
		int score = sc.nextInt();
		switch(score) {
			case 600,620,640:
				System.out.println("can get a home loan");
				break;
			
			case 650,660,670:
				System.out.println("Good CIBIL score you can get home loan");
				break;
			
			case 700,710,720:
				System.out.println("Good score you deifnelty get home loan");
				break;
			
			case 750,740:
				System.out.println("excellent CIBIL score here is your loan approval");
				break;
			
			default:
				System.out.println("Try to maintain good CIBIL score , and better luck next time to get home loan!!!");
				break;
		}
		
		sc.close();
	}
}
