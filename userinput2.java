package newerajava;
import java.util.Scanner;
public class userinput2 {
	public static void main(String[] args) {
		Scanner rush= new Scanner(System.in);
		System.out.println("please tell me your name???");
		String x = rush.nextLine();
		System.out.println(""+x);
		System.out.println("please insert yout age ");
		int z= rush.nextInt();
		System.out.println("you are "+z+ "years old");
		rush.nextLine();
		System.out.println("yout wife name please");
		String y = rush.nextLine();
		System.out.println(""+y);//for next line understanding
		System.out.println("your wife name is "+y);
	}
}
