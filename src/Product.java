
public class Product {
	//Attributes
	private String pName;
	private String pDescription;
	private double pPrice;
	private int pID;
	//We need this static productIdCounter that will be share amongst all the classes, to make sure they do not repeat id
	private static int productIdCounter = 0;

	//Constructor
	public Product(String pNamex, String pDescriptionx, double pPricex) {
		this.pName = pNamex;
		this.pDescription = pDescriptionx;
		this.pPrice = pPricex;
		this.pID = productIdCounter ++;
	}

	//Getters
	public String getpName() {
		return pName;
	}

	public String getpDescription() {
		return pDescription;
	}

	public double getpPrice() {
		return pPrice;
	}

	public int getpID() {		
		return pID;
	}

	//Setters
	public void setpName(String pName) {
		this.pName = pName;
	}

	public void setpDescription(String pDescription) {
		this.pDescription = pDescription;
	}

	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}
	//Print method to print product details --> this will be use to print phone and tv details too (inhereted classes)s
	public void print() {
		System.out.println(" Product ID: " + pID + " Product Name: " + pName + " Product Desciption: " + pDescription + " Product Price: " + pPrice);
	}				
}

		
		
