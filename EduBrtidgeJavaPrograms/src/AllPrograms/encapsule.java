package AllPrograms;
import java.util.Scanner;
class example{
	private String bnum="";
	private int dnum =0;

	public void setBnum(String bnum) {
		this.bnum = bnum;
	}
	
	public int getDnum(String bnum) {
		int decimal = Integer.parseInt(bnum , 2);
		return decimal;
	}
}

public class encapsule {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary number.");
		String st = sc.nextLine();
		
		example e = new example();
		e.setBnum(st);
		int decimal=e.getDnum(st);
		System.out.println("Binary to decimal of "+st+ " is = "+decimal);
		sc.close();
	}
}
