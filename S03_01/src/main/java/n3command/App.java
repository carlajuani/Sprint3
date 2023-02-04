package n3command;

/* Dissenya un pàrquing de 4 vehicles: un cotxe, una bicicleta, un avió i un vaixell. 
Mostra com funciona el patró Command que implementa els mètodes 
arrencar, accelerar i frenar per a cada tipus de vehicle. */

public class App {

	public static void main(String[] args) {
		//instanciem 4 vehicles diferents
		Vehicle car = new Car("opel zafira", "red", "2005");
		Vehicle bike = new Bicycle("BMC X200N", "black", "2014");
		Vehicle ship = new Ship("yamaha 324AA", "yellow and white", "2017");
		Vehicle airplane = new Airplane("Boeing 737", "white and blue", "2020");
		//instanciem les 3 classes starter/accelerator/braker que implementen la interface Order amb alguns dels vehicles creats
		VStarter vStarter1 = new VStarter(car);
		VStarter vStarter2 = new VStarter(ship);
		VAccelerator vAccelerator1 = new VAccelerator(bike);
		VBraker vBraker1 = new VBraker(car);
		VAccelerator vAccelerator2 = new VAccelerator(ship);
		VBraker vStarter3 = new VBraker(airplane);
		//instanciem un objecte parking que ens fa de magatzem dels moviments dels vehicles i llistem les ordres abans creades
		Parking parking = new Parking();
		parking.takeOrder(vStarter1);
		parking.takeOrder(vStarter2);
		parking.takeOrder(vAccelerator1);
		parking.takeOrder(vBraker1);
		parking.takeOrder(vAccelerator2);
		parking.takeOrder(vStarter3);
		//executem la llista d'ordres del parking per cada vehicle
		parking.placeOrders();
	}
}
