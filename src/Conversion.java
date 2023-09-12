/*
 * Name: Dejanae Shirley
 */
public class Conversion {
	//Declarations
	private double fahrenheit;
	private final double CONSTANT= 0.5556;
	
	//Constructor
	public Conversion (double fahrenheit, double CONSTANT) {
		this.fahrenheit=fahrenheit;
	}
	//Set and Get for Fahrenheit Temperature
	public void setfahrenheit() {
		this.fahrenheit = fahrenheit;
	}
	public double getfahrenheit() {
		return fahrenheit;
	}
	public double calculateCelsius(){
		double CelsiusTemp = ((fahrenheit-32)*CONSTANT);//formula to convert from Fahrenheit to Celsius
		return CelsiusTemp;
		
	}
	
}
