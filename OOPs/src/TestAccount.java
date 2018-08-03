import lti.bank.AccountFactory;
import lti.bank.BalanceException;
import lti.bank.Bank;

public class TestAccount {
	public static void main(String[] args) {
		Bank sav = AccountFactory.openAccount("savings","Polo");
		sav.summary();

		sav.deposit(2000);
		sav.deposit(4000);

		try {
			sav.withdraw(7000);
		} catch (BalanceException e) {
//			e.printStackTrace();	// for developers to trouble shoot.
//			System.out.println(e);	// for logging purpose to audit
			System.out.println(e.getMessage());		// for end users
		}
	}
}
