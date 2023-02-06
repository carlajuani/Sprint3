package S3_2n3DependencyInjection;
/* Dissenya una classe que mostri en pantalla el preu de diversos articles. 
 * Ja que haurà de mostrar-los també en diversos tipus de moneda.
 * Assegura't d'afegir-li com a Injecció de Dependència una classe Convertidor de Moneda 
 * que efectuï la correcció del preu en funció del canvi de divisa. */

public class App {

	public static void main(String[] args) {
		//emprem els metodes estatics del currencyConvertor per fer el canvi de moneda del preu de l'article 
		CurrencyConvertor.convertToPounds(new Article("lollipop", 1.95, "€"));
		CurrencyConvertor.convertToEuros(new Article("bicycle", 325.00, "$"));
		CurrencyConvertor.convertToPounds(new Article("cookies", 6.30, "$"));
		CurrencyConvertor.convertToDollars(new Article("umbrella", 15.75, "€"));
		CurrencyConvertor.convertToDollars(new Article("gold ring", 129.99, "€"));
		CurrencyConvertor.convertToPounds(new Article("jacket", 80.57, "$"));
		CurrencyConvertor.convertToEuros(new Article("lamp", 44.60, "£"));
	}
}
