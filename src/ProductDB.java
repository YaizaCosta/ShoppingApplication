import java.util.ArrayList;

public class ProductDB {
	//Attributes
	ArrayList<Product>theProductList = new ArrayList <Product>();	
	private int currentPosition = 0;

	//Methods
	public int getTotal() {
		return currentPosition;
	}	
	//Gets the product by using product id
	public Product getProduct(int pID) {
		return theProductList.get(pID);
	}
	//It removes a product in that index
	private void remove(int index) {
		theProductList.remove(index);
		currentPosition --;
	}

	//Add by productID and what does return? a product right?
	public void add(Product newProduct) {
		theProductList.add(newProduct);
		currentPosition ++;
	}

	//Search by product ID
	public Product search(int pID) { 
		//Start from a non existing point
		int g = -1;
		//System.out.println(getTotal()); -->Debugging
		for (int i = 0; i < getTotal(); i ++) {
			int pI = ((Product) getProduct(i)).getpID() ;
			System.out.println(pI);
			if (pI == pID) {
				g = i;
			}
		}
		return getProduct(g);}

	//Remove product 
	public boolean removeProduct(int i) {
		int bi = -1;
		for (int b = 0; b < getTotal(); b ++) {
			//Getting the pID from the object b and we are casting (Product) so it knows is a product
			int pID = ((Product) getProduct(b)).getpID() ;
			if (pID == i) {
				bi = b;
				remove(bi);
			}
		}
		return true; }
	//It prints the products
	public void print() {

		for (int p = 0; p < getTotal(); p ++) {
			//Getting the bookISBN from the object b and we are casting (Book) so it knows is a book
			((Product) getProduct(p)).print();
		}
	}

	//It prints the products in specific type = Mobile Phone or TV
	public void printSpecs(String type) {

		for (int p = 0; p < getTotal(); p ++) {
			if  (((Product) getProduct(p)).getpName() == type){
				((Product) getProduct(p)).print();
			}
		}

	}
}















