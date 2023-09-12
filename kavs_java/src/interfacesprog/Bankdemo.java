package interfacesprog;

public class Bankdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b = new BankImp();
		Account a = new Account(12376, "madhu", 15550,b);
		a.deposit(2000);
		System.out.println(a);
		
		a.withdraw(10000);
		System.out.println(a);
		
	}

}
