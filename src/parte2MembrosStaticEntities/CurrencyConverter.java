package parte2MembrosStaticEntities;

public class CurrencyConverter {//Conversor de moeda
	
	public static double dolar;
	public static double qtsDolar;
	public static final double IOF = 0.06;

	public static double Converte() {
		return (((qtsDolar  * dolar) * IOF )+ qtsDolar * dolar);
	}

}
