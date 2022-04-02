package fundamentos;

public class ConversaoTemperatura {

	public static void main(String[] args) {
		double fahrenheit = 125;
		double celcius = (fahrenheit - 32) * 5 / 9;
		
		System.out.println("A temperatura em Celcius é de " + celcius + " ºC");
	}
}
