import java.util.Scanner;

public class pp {
	public static void main (String[] args) {
		String temp;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name of your first gf here: ");
		temp = input.nextLine();
		practice practiceObject = new practice();
		
		practiceObject.setName(temp);
		practiceObject.saying();
	} 

}
