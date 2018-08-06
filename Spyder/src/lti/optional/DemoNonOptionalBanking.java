package lti.optional;

import java.util.Optional;

public class DemoNonOptionalBanking {
	public static void main(String[] args) {
		// Use-case 1
		Account sb = new Account();
		sb.setDebitCard(new Card(500));
		sb.setCreditCard(Optional.of(new Card(1000)));
		
		BankCustomer cust1 = new BankCustomer(sb);
		System.out.println(cust1.getSavings().getDebitCard().getAmount());
		System.out.println(cust1.getSavings().getCreditCard().get().getAmount());
		
		// User-case 2
		Account cb = new Account();
		cb.setDebitCard(new Card(1000));
		
		BankCustomer cust2 = new BankCustomer(cb);
		System.out.println(cust2.getSavings().getDebitCard().getAmount());
		
		Optional<Card> cc = cust2.getSavings().getCreditCard();
//		System.out.println(cc.get());
		System.out.println(cc);
		System.out.println(cc.orElseGet(() -> new Card(0)).getAmount());
		try {
			cc.orElseThrow(() -> new NoCardException());
		} catch (NoCardException e) {
			e.printStackTrace();
		}
	}

}


