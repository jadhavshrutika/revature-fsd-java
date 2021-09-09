import java.util.Scanner;

public class ValidateShortName {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter name ");
		String name = scanner.nextLine();
		
		if((name.length()>=2) && (name.length()<=6)) {
			System.out.println("This is valid name");
		}else {
			System.out.println("This is not valid name");
		}
		
		

	}

}
