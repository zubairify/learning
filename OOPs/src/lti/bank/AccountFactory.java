package lti.bank;

public final class AccountFactory {
	private AccountFactory() {
	}

	public static Bank openAccount(String type, String holder) {
		Bank acnt = null;
		
		if(type.equalsIgnoreCase("savings"))
			acnt = new Savings(holder);
		else
			acnt = new Current(holder);
		
		return acnt;
	}
}
