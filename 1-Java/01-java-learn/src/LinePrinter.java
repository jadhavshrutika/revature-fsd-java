
public class LinePrinter {


		public static void main(String[] args) {
			
	
		PrintLine(20);

		PrintLine(25);

		}
		//method overloading - polymorphism happening here bcoz here same function having multiple forms and that same function itself performming different role during different call
		public static void PrintLine() {
			System.out.println("--------");
		}
		public static void PrintLine(int NoOfchars) {
			for(int i=0; i < NoOfchars; i++) {
				System.out.print("-");
				
			}
			System.out.println();
		}
		

	}



