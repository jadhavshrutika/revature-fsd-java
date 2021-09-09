import java.util.Scanner;

public class TimeFormatTask {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter hour : ");
		int hr=scanner.nextInt();
		System.out.println("Enter min : ");
		int min=scanner.nextInt();
		System.out.println("Enter seconds : ");
		int sec=scanner.nextInt();
		System.out.println("Time is : "+hr +":"+ min +":"+sec);
		System.out.println("minutes :"+min);
		

	}

}


