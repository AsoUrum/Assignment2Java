package packageComputer;

public class Computer {

	// Attribute
	
	
	private String brand;
	private String model;
	private long sn;
	private double price;
	private static int numOfComputersCreated;
	
	
	// constructors constructor.
	
	public Computer() {
		
		this.brand = "Not defined";
		this.model = "Not defined";
		this.sn = 0;
		this.price = 0;
		this.numOfComputersCreated++;
	}
	// constructors full parameter constructor.
	public Computer(String brand, String model, long sn, double price) {
		
		
		this.brand = brand;
		this.model = model;
		this.sn = sn;
		this.price = price;
		this.numOfComputersCreated++;
		
		
		
	}
	
	

	
	// getter and setters brand
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	// getter and setter model
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	// getter and  setter sn
	
	public long getSn() {
		return sn;
	}
	
	public void setSn(long sn) {
		this.sn = sn;
	}
	
	
	// getter and setter price
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		
		
		
		
		return  
				"Brand : " + brand +  "\n" +
				"Model : " + model + "\n" + 
				"Serial Number: " +sn + "\n" +
				"Price: " + price + "$.";
				
				
				
	}
	
	// method to return the number of computer created'
	public static int findNumberOfCreatedComputers() {
		
		return numOfComputersCreated;
		
	}
	
	//method to display in string 
	
	@Override
	public boolean equals(Object obj) {

		if (this == null || obj == null || this.getClass() != obj.getClass()) {
			return false;
		} else {
			
			Computer comp  = (Computer) obj;
			return (this.brand == comp.brand && this.model == comp.model && this.sn ==comp.sn && this.price == comp.price);

		}
		
		
	}
	
	
}
