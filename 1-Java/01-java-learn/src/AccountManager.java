
public class AccountManager {

	public static void main(String[] args) {
		String accountNumber = "01302343794";
		double balance =5000.0;
		
		System.out.println("Account statement of 01302343794");
		System.out.println("Initial Balance :"+balance);
		
		System.out.println("\n------------------------------------");
		System.out.println("Type     Transaction   Balance");
		System.out.println("--------------------------------------");
		
		/*char type ='w';
		double transaction = 2000.0;
		balance = balance-transaction;
		System.out.printf("   %c %12.2f     %8.2f\n",type, transaction, balance);
		
		type ='d';
		transaction = 20000.0;
		balance = balance + transaction;
		System.out.printf("   %c %12.2f     %8.2f\n",type, transaction, balance);
		
		type ='d';
		transaction = 500.0;
		balance = balance + transaction;
		System.out.printf("   %c %12.2f     %8.2f\n",type, transaction, balance);
		
		type ='w';
		transaction = 15500.0;
		balance = balance - transaction;
		System.out.printf("   %c %12.2f     %8.2f\n",type, transaction, balance);
		
		type ='w';
		transaction = 10000.0;
		balance = balance - transaction;
		System.out.printf("%4c %12.2f     %8.2f\n",type, transaction, balance);
		System.out.println("--------------------------------------");
		*/
		
		balance= CalculateBalanceAndPrint('w',2000, balance);
		balance= CalculateBalanceAndPrint('d',2000,balance);
		balance= CalculateBalanceAndPrint('d',500, balance);
		balance= CalculateBalanceAndPrint('w',15500,balance);
		balance= CalculateBalanceAndPrint('w',10000,balance);
		System.out.println("--------------------------------------");
		
		

	}
	
	public static double CalculateBalanceAndPrint(char type, double transaction, double balance){
		if(type=='d') {
			balance += transaction;	
		}if(type=='w') {
			balance -= transaction;	
		}
		System.out.printf("%4c %12.2f     %8.2f\n",type, transaction, balance);
		
		return balance;
	}

}
