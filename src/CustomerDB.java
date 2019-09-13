import java.util.ArrayList;

public class CustomerDB {
	//Attributes
	//Arraylist of customers
	ArrayList<Customer>theCustomerList = new ArrayList <Customer>(); 	
	private int currentPosition = 0;

	//Methods
	//Gettotal of customers by returning currentPosition
	public int getTotal() {
		return currentPosition;
	}	

	//getCustomer from the customerlist passing customerID
	public Customer getCustomer(int cID) {
		return theCustomerList.get(cID);
	}

	//Add new customer Object Customer new Customer
	public void add(Customer newCustomer) {
		theCustomerList.add(newCustomer);
		currentPosition ++;
	}

	//Print customer we choose "p"
	public void print() {
		for (int p = 0; p < getTotal(); p ++) {
			//Getting the customer p and we are casting (Customer) so it knows is a customer
			((Customer)getCustomer(p)).print();
		}
	}

}


		






