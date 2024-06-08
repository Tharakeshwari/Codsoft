package Task3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount(1000.0);  // Initial balance of 1000
        ATM atm = new ATM(account);
        atm.start();

	}

}
