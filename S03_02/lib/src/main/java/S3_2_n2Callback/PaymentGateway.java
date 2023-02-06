package S3_2_n2Callback;

public class PaymentGateway {
	private IPaymentMethod paymentMethod;
	
	public PaymentGateway(IPaymentMethod paymentMethod) throws InterruptedException {
		this.paymentMethod = paymentMethod;
		executePayment(paymentMethod.getAmount());
	}

	public void executePayment(double amount) throws InterruptedException {
		paymentMethod.executePayment(amount);
	}
}
