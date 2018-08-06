package lti.optional;

import java.util.Optional;

public class BankCustomer {
	private Account savings;

	public BankCustomer(Account savings) {
		this.savings = savings;
	}

	public Account getSavings() {
		return savings;
	}
	public void setSavings(Account savings) {
		this.savings = savings;
	}
}

class Account {
	private Card debitCard;
	private Optional<Card> creditCard = Optional.empty();
	
	public Card getDebitCard() {
		return debitCard;
	}
	public void setDebitCard(Card debitCard) {
		this.debitCard = debitCard;
	}
	
	public Optional<Card> getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(Optional<Card> creditCard) {
		this.creditCard = creditCard;
	}
}

class Card {
	private double amount;

	public Card(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
}