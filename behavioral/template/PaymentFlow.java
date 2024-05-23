package lld_practice.behavioral.template;

public abstract class PaymentFlow {
	public abstract void validatePaymentRequest();
	public abstract void calculatePaymentFees();
	public abstract void debitAmount();
	public abstract void creditAmount();
	
	public final void sendMoney() {
		validatePaymentRequest();
		
		calculatePaymentFees();
		
		debitAmount();
		
		creditAmount();
	}
}
