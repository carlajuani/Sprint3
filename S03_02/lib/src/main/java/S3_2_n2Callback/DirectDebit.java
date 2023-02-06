package S3_2_n2Callback;

public class DirectDebit implements IPaymentMethod{
	private double amount;
	
	public DirectDebit (double amount) {
		this.amount = amount;
	}
	
	@Override
	public void executePayment(double amount) throws InterruptedException {
		System.out.println("direct debit payment on course");
		long startTime = 100;
		long elapsedTime = System.currentTimeMillis() - startTime;
		long timeTillNextDisplayChange = 1000 - (elapsedTime % 1000);
		Thread.sleep(timeTillNextDisplayChange);
		System.out.println(".");
		Thread.sleep(timeTillNextDisplayChange);
		System.out.println(".");
		Thread.sleep(timeTillNextDisplayChange);
		System.out.println(".");
		Thread.sleep(timeTillNextDisplayChange);
		System.out.println(amount +"€ payment succesful\n");
		Thread.sleep(timeTillNextDisplayChange);
	}
	
	@Override
	public double getAmount() {
		return this.amount;
	}
}
