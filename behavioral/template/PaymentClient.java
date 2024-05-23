package lld_practice.behavioral.template;

public class PaymentClient {

	public static void main(String args[]) {
		System.out.println("Sending Money to Friend !!!");
		PaymentFlow paymentFlowToFriend = new PaymentToFriend();
		paymentFlowToFriend.sendMoney();
		System.out.println("======================================");
		System.out.println("Sending Money to Merchant !!!");
		PaymentFlow paymentFlowToMerchant = new PaymentToMerchant();
		paymentFlowToMerchant.sendMoney();
		
	}
}
