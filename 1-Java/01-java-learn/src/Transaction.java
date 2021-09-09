
public class Transaction {
	private char type;
	private double amount;
	
	//constructor
	public Transaction(char type, double amount) {
		this.type=type;
		this.amount=amount;
	}
	
	
	public char getType() {
		return type;
	}

	public double getAmount() {
		return amount;
	}

	//instatnce method...it dont have static and to call this methods we need to create an instance
	public void displayTransaction(double balance) {
		System.out.printf("%4c %12.2f     %8.2f\n", type, amount, balance);

	}
	

	
	public static void main(String[] args) {
		Transaction transaction1=new Transaction('w',2000);
		Transaction transaction2=new Transaction('d',20000);
		Transaction transaction3=new Transaction('d',500);
		Transaction transaction4=new Transaction('w',15000);
		Transaction transaction5=new Transaction('w',10000);
		
		Transaction[] transactionList= {transaction1,transaction2,transaction3,transaction4,transaction5};
		for(Transaction transaction: transactionList) {
			transaction.displayTransaction(5000);
			
		}
		
		
		
	}
}
