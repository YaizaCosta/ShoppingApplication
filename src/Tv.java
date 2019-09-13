
public class Tv extends Product {

	//Attributes
	private String tMake;
	private int tScreenSize;
	private String tType;
	private boolean tCapab3;

	//Constructor
	public Tv (String pNamex, String pDescriptionx, double pPricex, String tMakex, int tScreenSizex, String tTypex, boolean tCapab3x) {
		//From the superclass Product
		super(pNamex, pDescriptionx, pPricex);
		this.tMake = tMakex;
		this.tScreenSize = tScreenSizex;
		this.tType = tTypex;
		this.tCapab3 = tCapab3x;	
	}

	//Getters
	public String gettMake() {
		return tMake;
	}

	public int gettScreenSize() {
		return tScreenSize;
	}

	public String gettType() {
		return tType;
	}
	
	public boolean istCapab3() {
		return tCapab3;
	}
	//Setters
	public void settMake(String tMake) {
		this.tMake = tMake;
	}

	public void settScreenSize(int tScreenSize) {
		this.tScreenSize = tScreenSize;
	}

	public void settType(String tType) {
		this.tType = tType;
	}
	public void settCapab3(boolean tCapab3) {
		this.tCapab3 = tCapab3;
	}

	
	//Print the TV details
	public void print() {
		super.print();
		System.out.println(" TV Make: " + tMake + " TV Scren Size: " + tScreenSize + " TV Type: " + tType + " TV 3D Capability: " + tCapab3);
	}

}
