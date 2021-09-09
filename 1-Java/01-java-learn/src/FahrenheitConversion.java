import java.util.Scanner;

public class FahrenheitConversion {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter value which is to be converted :");
		int celsius=scanner.nextInt();
		float fahrenheit= (celsius*9/5)+32;
		System.out.println("coverted value is :"+fahrenheit);
		
		
		

	}

}
