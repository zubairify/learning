package lti.bank;

public class Current extends Account {
	private double overdraft;

	public Current() {
	}

	public Current(String holder) {
		super(holder, INIT_CUR_BAL);
		this.overdraft = OVERDRAFT_AMT;
		
		// Adding opening account transaction
		txns[idx ++] = new CurrentTransaction("OB", balance, balance, overdraft);
	}

	@Override
	public void summary() {
		super.summary();
		System.out.println("Overdraft: " + overdraft);
	}

	@Override
	public void deposit(double amount) {
		overdraft += amount;
		if(overdraft > OVERDRAFT_AMT) {
			balance += overdraft - OVERDRAFT_AMT;
			overdraft = OVERDRAFT_AMT;
		}
		txns[idx ++] = new CurrentTransaction("Cr", amount, balance, overdraft);
	}
	
	@Override
	public void withdraw(double amount) throws BalanceException {
		if(amount <= (balance + overdraft)) {
			balance -= amount;
			if(balance < MIN_CUR_BAL) {
				overdraft += balance;
				balance = MIN_CUR_BAL;
			}
			txns[idx ++] = new CurrentTransaction("Dr", amount, balance, overdraft);
		} else 
			throw new BalanceException("Insufficient funds!");
	}
}
