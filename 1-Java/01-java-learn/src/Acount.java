
public class Acount {
	private String accountNumber;
	private double balance;
	private Transaction[] transactions;
	
	

	public Acount(String accountNumber, double balance, Transaction[] transactions) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.transactions = transactions;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdrow(double amount) {
		if (balance > amount) {
			balance -= amount;
		}
	}

	public double getBalance() {
		return balance;
	}
	public void printStatement() {
		System.out.println("Account statement of "+ accountNumber);
		System.out.println("Initial Balance :"+ balance);
		
		System.out.println("\n------------------------------------");
		System.out.println("Type     Transaction   Balance");
		System.out.println("--------------------------------------");
		
		for(Transaction transaction:transactions) {
			if(transaction.getType()=='d') {
				//balance += transaction.getAmount();
				deposit(transaction.getAmount());
			}if(transaction.getType()=='w') {
				//balance -= transaction.getAmount();	
				withdrow(transaction.getAmount());
			}
			transaction.displayTransaction(balance);
			
			System.out.println("--------------------------------------");
			
		}
	}


	public static void main(String[] args) {
		Transaction transaction1=new Transaction('w',2000);
		Transaction transaction2=new Transaction('d',20000);
		Transaction transaction3=new Transaction('d',500);
		Transaction transaction4=new Transaction('w',15000);
		Transaction transaction5=new Transaction('w',10000);
		
		Transaction[] transactionList= {transaction1,transaction2,transaction3,transaction4,transaction5};
		
		Acount account = new Acount("01302343794", 5000.0, transactionList);
		account.printStatement();

	}

}
