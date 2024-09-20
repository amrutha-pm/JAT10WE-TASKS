package Task10;

public class AccountClassQuest4 {
	int balance;

	public AccountClassQuest4()
	{
	}

	public AccountClassQuest4(int balance)
	{
		this.balance=balance;
		System.out.println("Current account balance :" +balance);
	}

	public void withdraw(int amount)
	{
		balance=balance-amount;
		System.out.println("Balance after withdrawal  :" +balance);
	}
	public void deposit(int amount)
	{
		balance=balance+amount;
		System.out.println("Balance after deposit : "+balance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       AccountClassQuest4 objA=new AccountClassQuest4(1000);
       objA.withdraw(100);
       objA.deposit(500);

	}

}
