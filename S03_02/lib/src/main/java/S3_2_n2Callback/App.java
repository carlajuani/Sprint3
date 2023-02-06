package S3_2_n2Callback;
/* Simula una passarel·la de pagament que rebi un objecte encapsulador del mètode de pagament a efectuar: 
 * targeta de crèdit, Paypal o deute en compte bancari.
    La passarel·la invocarà el pagament sense conèixer la forma i retornant el control a la classe d'origen.
    La classe que invoca la passarel·la de pagament serà una botiga de sabates.
 */

public class App {

	public static void main(String[] args) throws InterruptedException {
		PaymentGateway payment = new PaymentGateway(new PayPal(35.25));
		PaymentGateway payment2 = new PaymentGateway(new CreditCard(35.25));
		PaymentGateway payment3 = new PaymentGateway(new DirectDebit(35.25));
	}

}
