package S3_2_n2Callback;

public interface IPaymentMethod {
	public double amount = 0;
	public abstract void executePayment(double amount) throws InterruptedException;
	public abstract double getAmount();
}
