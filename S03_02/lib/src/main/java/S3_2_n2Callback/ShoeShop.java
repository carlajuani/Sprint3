package S3_2_n2Callback;
/* Simula una passarel·la de pagament que rebi un objecte encapsulador del mètode de pagament a efectuar: 
 * targeta de crèdit, Paypal o deute en compte bancari.
    La passarel·la invocarà el pagament sense conèixer la forma i retornant el control a la classe d'origen.
    La classe que invoca la passarel·la de pagament serà una botiga de sabates.
 */

public class ShoeShop {
	
	public static void main(String[] args) throws InterruptedException {
		/*instanciem tres pagaments diferents en tres passareles de pagament diferents, que en el seu constructor criden al 
		metode del paymentMethod que sigui (payPal...) executePayment amb la quantitat introduida per parametre com a atribut*/
		new PaymentGateway(new PayPal(35.25));
		new PaymentGateway(new CreditCard(35.25));
		new PaymentGateway(new DirectDebit(35.25));
	}
	
	public static void printSuccesful(double amount) {
		System.out.println(amount +"€ payment succesful\n");
	}

}
