package lld_practice.behavioral.template;

public class PaymentToFriend extends PaymentFlow{

	@Override
	public void validatePaymentRequest() {
		System.out.println("Validated Payment Request !!! ");
	}

	@Override
	public void calculatePaymentFees() {
		System.out.println("0% - Fees Charged !!! ");
	}

	@Override
	public void debitAmount() {
		System.out.println("Amount Debited !!! ");
	}

	@Override
	public void creditAmount() {
		System.out.println("Amount Credited to Friend !!!");
	}
}
