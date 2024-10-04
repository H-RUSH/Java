package newerajava;
import java.util.Scanner;
public class userinput {
	public static void main(String[] args) {
		Scanner himadry =new Scanner(System.in);
		System.out.println(" what is yout name ??");
		String name = himadry.nextLine();
		System.out.println("hellow "+name);
		System.out.println("your age ???");
		int age =himadry.nextInt();
		himadry.nextLine();
		System.out.println("you are "+ age+ " years old");
		himadry.close();
	}

}
