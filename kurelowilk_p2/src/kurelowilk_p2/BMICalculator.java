package kurelowilk_p2;
import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
	    BMICalculator app = new BMICalculator();
	    app.readUserData();
	    app.calculateBmi();
	    app.displayBmi();
	}
	
	private Scanner sc = new Scanner(System.in);
	
	private int unitType; // 0 = Metric, 1 Imperial. -> (Default is 0.)
	private double height; //Height in cm or inches (depends on unitType)
	private double weight; //Weight in kg or pounds.
	private double bmi;
	private String bmiCategory;
	
	//Starts our beautiful calculator :D
	public void readUserData() {
		this.readUnitType();
		this.readMeasurementData();
	}
	
	//Reads user input to select Metric or Imperial system. 0 = Metric, 1=Imperial
	private void readUnitType() {
		
		System.out.println("Welcome to the BMI calculator. Enter 0 for Metric System or 1 to Imperial.");
		
		
		int selection = this.sc.nextInt();
		
		while(selection!=0 && selection!=1) {
			System.out.println("Invalid Number. Please type 0 for metrical or 1 for imperial");
			selection = this.sc.nextInt();
		}
		
		 ;
		this.unitType = selection;
	}
	
	//I need to determine if we are using Metric or Imperial System.
	//I'm checking if the unitType is 0 (Metric) or 1 (Imperial).
	private void readMeasurementData() {
		if(this.unitType == 0) {
			this.readMetricData();
		}
		else if(this.unitType == 1) {
			this.readImperialData();
		}
	}
	
	// reads user input to populate our instance variables. If input is negative, program exits.
	private void readMetricData() {
		
		
		System.out.println("Enter your height in centimeters.");
		this.height = this.sc.nextDouble();
		
		if(this.height < 0) {
			System.out.println("Invalid Height. Exitting Program.");
			System.exit(1);
		}
		
		System.out.println("Enter your weight in kilograms.");
		this.weight = this.sc.nextDouble();
		
		if(this.weight < 0) {
			System.out.println("Invalid Weight. Exitting Program.");
			System.exit(1);
		}
		
		 ;
	}
	
	//Read the Imperial data & checks if input is valid. If the inputs are negative, program exits.
	private void readImperialData() {
		
		System.out.println("Enter your height in inches.");
		this.height = this.sc.nextDouble();
		
		if(this.height < 0) {
			System.out.println("Invalid Height. Exitting Program.");
			System.exit(1);
		}
		
		System.out.println("Enter your weight in pounds.");
		this.weight = this.sc.nextDouble();
		
		if(this.weight < 0) {
			System.out.println("Invalid Weight. Exitting Program.");
			System.exit(1);
		}
		;		
	}
	
	//Calculates the BMI using the Metric or Imperial Formulas provided in the Assignment.
	
	public void calculateBmi() {
		if(this.unitType == 0) { //Use Metric formula
			this.bmi = this.weight/(Math.pow(this.height/100.0, 2));
		}
		else if(this.unitType == 1) { //Use Imperial formula.
			this.bmi = (703*this.weight)/(Math.pow(this.height, 2));
		}
		this.calculateBmiCategory();
	}
	
	//Evaluates in which category of BMI a person falls into based on their calculatedBMI.
	private void calculateBmiCategory() {
		if(this.bmi < 18.5) {
			this.bmiCategory = "Underweight";
		}
		else if(this.bmi < 25) {
			this.bmiCategory = "Normal weight";
		}
		else if(this.bmi < 30) {
			this.bmiCategory = "Overweight";
		}
		else {
			this.bmiCategory = "Obesity";
		}
	}
	
	//Displays the BMI & BMI Category in a nice way.
	public void displayBmi() {
		System.out.println("BMI: "+this.bmi+" Category: "+this.bmiCategory);
	}
	
	//Return weight.
	public double getWeight() {
		return this.getWeight();
	}
	
	//Set a new weight to a person. If it's negative, program exits.
	private void setWeight(double newWeight) {
		this.weight = newWeight;
		if(this.weight < 0) {
			System.out.println("Invalid Weight. Exitting Program.");
			System.exit(1);
		}
	}
	
	//Return the height of the person
	public double getHeight() {
		return this.height;
	}
	
	//Set a new height & exit if it's negative.
	private void setHeight(double newHeight) {
		this.height = newHeight;
		if(this.height < 0) {
			System.out.println("Invalid Height. Exitting Program.");
			System.exit(1);
		}
	}
	
	//return the bmi
	public double getBmi() {
		return this.bmi;
	}
	
	//return a String with the bmi category.
	public String getBmiCategory() {
		return this.getBmiCategory();
	}
	

}
