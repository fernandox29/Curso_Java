package util;

public class Calculator {

	public static final double PI = 3.14159;
	public static double IOF = 0.06;
	
	public static double circunferencia (double raio) {
		return 2.0 * PI * raio;
	}
	public static double volume (double raio) {
		return (4.0 * PI * (Math.pow(raio, 3)))/3;
	}
	
	public static double dollarReal (double cotDollar, double dollar) {
		return cotDollar * dollar * (1.0 + IOF);
	}
	
}
