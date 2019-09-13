import java.util.ArrayList;

public class Customer {

	//Attributes
	private String cName;
	private String cAddress;
	//Arraylist of orders
	ArrayList<Order>theOrderList = new ArrayList <Order>();
	private int cID; 
	//Static customerIDcounter so we can identify each customer with an unique cID
	private static int customerIdCounter = 0;
	private int orderCounter = 0;

	//Constructor
	public Customer (String cNamex, String cAddressx) {
		this.cName = cNamex;
		this.cAddress = cAddressx;
		this.cID = customerIdCounter ++;
	}

	//Getters
	public String getcName() {
		return cName;
	}

	public String getcAddress() {
		return cAddress;
	}
	//Get the order from theOrderList
	public Order getOrder(int ord) {
		Order o = theOrderList.get(ord);
		return o;
	}

	//Setters
	public void setcName(String cName) {
		this.cName = cName;
	}

	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}

	//Managing the order, we return the orderCounter
	public int totalOrder() {
		return orderCounter;
	}
	//We add the order o to theOrderList and increase the counter
	public void addOrder(Order o) {
		theOrderList.add(o);
		orderCounter ++;
	}

	//Print customer details
	public void print() {
		System.out.println(" Customer Name: " + cName + " Customer Address: " + cAddress);
	}
	//Print method to print customer orders
	public void printOr() {
		for (int p = 0; p < theOrderList.size(); p ++) {

			Order o = theOrderList.get(p);
			for (int i = 0; i < o.getTotal(); i ++) {
				Product pr = o.getProduct(i);
				pr.print();
			}
		}
	}
}



