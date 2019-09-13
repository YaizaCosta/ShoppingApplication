
public class Phone extends Product {
	//Attributes
	private String phoMake;
	private String phoModel;
	private int phoStorage;

	//Constructor 
	public Phone(String pNamex, String pDescriptionx, double pPricex, String phoMakex, String phoModelx, int phoStoragex) {
		//Super from the inherited class
		super(pNamex, pDescriptionx, pPricex);
		this.phoMake = phoMakex;
		this.phoModel = phoModelx;
		this.phoStorage = phoStoragex;		
	}

	//Getters
	public String getPhoMake() {
		return phoMake;
	}

	public String getPhoModel() {
		return phoModel;
	}

	public int getPhoStorage() {
		return phoStorage;
	}

	//Setters
	public void setPhoMake(String phoMake) {
		this.phoMake = phoMake;
	}

	public void setPhoModel(String phoModel) {
		this.phoModel = phoModel;
	}

	public void setPhoStorage(int phoStorage) {
		this.phoStorage = phoStorage;
	}

	//Print method to print phone details
	public void print() {
		super.print(); 
		System.out.println(" Phone Make: " + phoMake + " Phone Model: " + phoModel + " Phone Storage: " + phoStorage);
	}

}
