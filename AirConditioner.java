// Class AirConditioner by (c) Dami

	public class AirConditioner {

//attribute
	private String model;
	private String color;
	private int weight;

//Method

//setMethod
	public void setColor(String color) {
	    this.color = color;	
	}	

//getMethod
	public String getColor() {
	    return color;
	}

//Class AirConditioner. Let's get weight.

	public void setWeight(int weight) {
	    this.weight = weight;
	}

	public int getWeight() {
	    return weight;
	}

//main method
	public static void main(String[] args) {
	AirConditioner samsung = new AirConditioner(); 	//Note that "AirConditioner()" is the contrustor that creates a NEW Object called Samsung of the Class Airconditioner.
	samsung.setColor("brown"); 	//I'm trying here to change the color using methods that I already have inside the class.
	samsung.getColor();
	
	System.out.print("It R U N S!");
	System.out.print(samsung.getColor());		
	
}

}