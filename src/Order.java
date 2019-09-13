import java.util.ArrayList;

public class Order {
	//Attributes
	//Arraylist of orders with products
	ArrayList<Product>theOrderList = new ArrayList <Product>();	
	private int currentPosition =0;

	//
	public int getTotal() {
		return currentPosition;
	}	
	//Get product by using product id
	public Product getProduct(int pID) {
		return theOrderList.get(pID);
	}
	//Add a new product of Product call newProduct
	public void add(Product newProduct) {
		theOrderList.add(newProduct);
		currentPosition ++;
	}

}
