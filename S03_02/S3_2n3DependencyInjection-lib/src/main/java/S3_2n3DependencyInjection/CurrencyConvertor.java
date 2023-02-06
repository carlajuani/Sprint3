package S3_2n3DependencyInjection;

public class CurrencyConvertor {
	public static void convertToEuros(Article a) {
		String conversion = a.getPrice() +a.getInitialCurrency();
		if (a.getInitialCurrency().equalsIgnoreCase("£")) {
			conversion =  Math.round((a.getPrice() * 1.4)*1000)/1000d +"€";
		} else if (a.getInitialCurrency().equalsIgnoreCase("$")) {
			conversion = Math.round((a.getPrice() * 1.1)*1000)/1000d +"€";
		}
		System.out.println(a +" ->"+ conversion);	
	}
	
	public static void convertToDollars(Article a) {
		String conversion = a.getPrice() +a.getInitialCurrency();
		if (a.getInitialCurrency().equalsIgnoreCase("€")) {
			conversion =  Math.round((a.getPrice() * 0.90))*1000/1000d +"$";
		} else if (a.getInitialCurrency().equalsIgnoreCase("£")) {
			conversion =  Math.round((a.getPrice() * 1.25))*1000/1000d +"$";
		}
		System.out.println(a +" ->"+ conversion);
	}
	
	public static void convertToPounds(Article a) {
		String conversion = a.getPrice() +a.getInitialCurrency();
		if (a.getInitialCurrency().equalsIgnoreCase("€")) {
			conversion =  Math.round((a.getPrice() * 0.70))*1000/1000d +"£";
		} else if (a.getInitialCurrency().equalsIgnoreCase("$")) {
			conversion =  Math.round((a.getPrice() * 0.80))*1000/1000d +"£";
		}
		System.out.println(a +" ->"+ conversion);
	}
}
