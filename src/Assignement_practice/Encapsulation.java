package Assignement_practice;

public class Encapsulation 
{
	public class Car {
	    // Private data members
	    private String model;
	    private int year;

	    // Constructor
	    public Car(String model, int year) {
	        this.model = model;
	        this.year = year;
	    }

	    // Getter for model
	    public String getModel() {
	        return model;
	    }

	    // Setter for model
	    public void setModel(String model) {
	        this.model = model;
	    }

	    // Getter for year
	    public int getYear() {
	        return year;
	    }

	    // Setter for year
	    public void setYear(int year) {
	        if (year > 1885) { // Simple validation
	            this.year = year;
	        }
	    }
	}


}
