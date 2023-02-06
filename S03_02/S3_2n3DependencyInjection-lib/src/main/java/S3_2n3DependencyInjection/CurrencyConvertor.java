package S3_2n3DependencyInjection;

public class CurrencyConvertor {
	public static double convertEuros(double amount, String currency) {
		if (currency.equalsIgnoreCase("pounds")) {
			amount *= 1.4;
		} else if (currency.equalsIgnoreCase("dollars")) {
			amount *= 1.1;
		}
		return Math.round(amount*1000)/1000;
	}
	
	public static double convertDollars(double amount, String currency) {
		if (currency.equalsIgnoreCase("euros")) {
			amount *= 0.90;
		} else if (currency.equalsIgnoreCase("pounds")) {
			amount *= 1.25;
		}
		return Math.round(amount*1000)/1000;
	}
	
	public static double convertPounds(double amount, String currency) {
		if (currency.equalsIgnoreCase("euros")) {
			amount *= 0.70;
		} else if (currency.equalsIgnoreCase("dollars")) {
			amount *= 0.80;
		}
		return Math.round(amount*1000)/1000;
	}
}
