package lti.pojo;

public class CreditCard extends BillingDetails {
	private String type;
	private String expiryMonth;
	private String expiryYear;
	
	public String getExpiryMonth() {
		return expiryMonth;
	}
	public void setExpiryMonth(String expiryMonth) {
		this.expiryMonth = expiryMonth;
	}
	public String getExpiryYear() {
		return expiryYear;
	}
	public void setExpiryYear(String expiryYear) {
		this.expiryYear = expiryYear;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "CreditCard [type=" + type + ", expiryMonth=" + expiryMonth
				+ ", expiryYear=" + expiryYear + ", toString()="
				+ super.toString() + "]";
	}
}
