package S3_2_n2Callback;

public class PaymentGateway {
	private IPaymentMethod paymentMethod;
	
	public PaymentGateway(IPaymentMethod paymentMethod) throws InterruptedException {
		this.paymentMethod = paymentMethod;
		this.paymentMethod.executePayment(paymentMethod.getAmount());
	}
}
