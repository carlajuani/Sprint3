package n2abstractFactory;
/*Crea un petit gestor de direccions i números de telèfon internacionals.
L'aplicació ha de permetre afegir a l'agenda, adreces i números de telèfon internacionals. 
Tenint en compte els diferents formats dels diferents països, construeix l'agenda, les adreces 
i els telèfons implementant un patró Abstract Factory.*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import n1singleton.Input;

public class App {

	public static void main(String[] args) {
		//instanciem un HashMap pels contactes amb String nom com a key i Contacte (address, phone) com a value
		Map<String,Contact> contactList = new HashMap<>();
		
		boolean exit=false;
	    do
	    {
	      System.out.println("\n1.New contact info");
	      System.out.println("2.Consult contact info");
	      System.out.println("3.Delete contact info");
	      System.out.println("4.Consult contact list");
	      System.out.println("5.Exit\n");
	      int selectedOption = Input.scanningForInt("Please select an option number from the menu:");
	      switch(selectedOption)
	      {
	       case 1: //metode que agafa i retorna el HashMap actualitzat amb nou objecte(nom, contacte)
	   	       addContactInfo(contactList);
	    	   break;
	    	   
	       case 2: //metode que agafa el HashMap per imprimir a consola un objecte(nom, contacte)
	    	   printContactInfo(contactList);
	    	   break;
	    	   
	       case 3: //metode que agafa i retorna el HashMap actualitzat amb un objecte(nom, contacte) eliminat
	    	   deleteContactInfo(contactList);
	    	   break;
	    	   
	       case 4: //metode que agafa el HashMap per imprimir a consola tots els objectes(nom, contacte)
	    	   printContacts(contactList);
	    	   break;

	       case 5:
	    	   exit=true;
	    	   System.out.println("Goodbye, come back soon!");
	    	   break;
	       	  }
	      }while(!exit);
	}
	
	//1. afegim objecte a contactList
	private static Map<String, Contact> addContactInfo(Map<String, Contact> contactList) {
		//creem un nou productor factoryProducer que implementa la interface abstractFactory amb 2 metodes que retornen address i phone
		FactoryProducer factoryProducer = new FactoryProducer();
		//demanem les dades del contact amb scanner classe Input
		String nameComplete = Input.scanningForString("Please insert your full name");
		String country = Input.scanningForString("Please insert country");
		String street = Input.scanningForString("Please insert street");
		String streetNumber = Input.scanningForString("Please insert house number");
		String floor = Input.scanningForString("Please insert floor");  
		String door = Input.scanningForString("Please insert door"); 
		String postcode = Input.scanningForString("Please insert postcode"); 
		String city = Input.scanningForString("Please insert city");
		String phoneNumber = Input.scanningForString("Please insert phone number");
		/*emprem el metode getAdress del factoryproducer que retorna la instancia duna classe filla de la 
		classe abstracta Address(DanishAddres, SpanishAddres o UKAddress segons el valor del String country), 
		que implementa la interface FormattedAddress*/
		FormattedAddress address = factoryProducer.getAddress(country, street, streetNumber, floor, door, postcode, city);
		//fem el mateix amb el metode getPhone que retorna una filla de Phone(DanishPhone, UKPhone o SpanishPhone) que implementa FormattedPhone
		FormattedPhone phone = factoryProducer.getPhone(country, phoneNumber);
		//instanciem un nou objecte Contacte
		Contact contact = new Contact(address, phone);
		//agefim a la contactList amb el nom complet com a key i el contacte com a value
		contactList.put(nameComplete, contact);
		return contactList;
	}
	
	//2.demanem el nom complet i imprimim aquell contacte que tingui aquest nom com a key
	private static void printContactInfo (Map<String, Contact> contactList) {
		String nameComplete = Input.scanningForString("Please insert name complete of contact");
 	    System.out.println(contactList.get(nameComplete));
	}
	
	//3. demanem el nom complet i si la llista conté un objecte amb aquesta key l'esborrem, sinó només imprimim missatge informant
	private static Map<String, Contact> deleteContactInfo (Map<String, Contact> contactList) {
		String nameComplete = Input.scanningForString("Please insert name complete of contact");
 	    if (contactList.containsKey(nameComplete)) {
 	    	contactList.remove(nameComplete);
 	    	System.out.println("The contact has been succesfully deleted");
 	    } else {
 	    	System.out.println("The contact already does not exist");
 	    }
		return contactList;
	}
	
	//4. mostrar llista contactes amb un forEach Set del hashmap imprimim
	private static void printContacts (Map<String, Contact> contactList) {
		for (Object contactInfo : contactList.entrySet()) {
			System.out.println(contactInfo);
		}
	}
}
