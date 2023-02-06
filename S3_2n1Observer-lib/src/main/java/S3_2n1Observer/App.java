package S3_2n1Observer;

/*Dissenya un sistema en el qual un Agent de Borsa (Observable) notifica a diverses agències de Borsa (Observers) 
 * canvis quan la Borsa puja o baixa. És necessari que l'objecte Observable mantingui referències als Observers.
 */
public class App {

	public static void main(String[] args) {
		//instanciem un objecte agent de borsa
		Broker broker = new Broker();
		//instanciem 3 agencies de borsa diferents amb el mateix agent de borsa
		new EuroStockAgency(broker);
		new DollarStockAgency(broker);
		new PoundStockAgency(broker);
		/*imprimim els canvis d'estat i actualitzem les agencies a traves del metode setState del broker, que les notifica 
		amb el metode notifyAllAgencies que a la vegada empra un for each amb cada agencia de la llista per executar 
		el metode update per cadascuna*/
		System.out.println("State change 1: 10");
		broker.setState(10);
		System.out.println("State change 2: 12.4");
		broker.setState(12.4f);
	}
}
