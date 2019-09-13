import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);	
		//**************** Test addition of phones, tvs, customers and add then to a database and to an specific customer ***************

		//Creation of some phones, tvs and customers
		Phone phone1 = new Phone ("Mobile Phone", "Golden White", 200.50, "Apple", "8S", 64);
		Phone phone2 = new Phone ("Mobile Phone", "Space grey", 999.99,  "Apple", "10S", 64);	
		Phone phone3 = new Phone ("Mobile Phone", "Green", 549.45,  "Samnsung", "Galaxy 7", 256);
		//phone1.print();
		//phone2.print();

		Tv tv1 = new Tv ("Television", "Black", 560.25, "Toshiba", 27, "Flat screen", false);
		Tv tv2 = new Tv ("Television", "Grey", 560.25, "Toshiba", 27, "Flat screen", false);
		Tv tv3 = new Tv ("Television", "White", 560.25, "Toshiba", 27, "Flat screen", false);

		Customer Maria = new Customer ("Maria", "Cork City");
		Customer Juanjo = new Customer ("Juanjo", "Douglas Road");
		Customer Maribel = new Customer ("Maribel", "Wilton 56");

		//Add the products to the database productList1
		ProductDB theProductList = new ProductDB ();//Create a Product list to add new products
		theProductList.add(phone1);
		theProductList.add(phone2);
		theProductList.add(phone3);
		theProductList.add(tv1);
		theProductList.add(tv2);
		theProductList.add(tv3);

		CustomerDB theCustomerList = new CustomerDB(); //Create a Customer list to add new customers
		theCustomerList.add(Maria);
		theCustomerList.add(Juanjo);
		theCustomerList.add(Maribel);


		Order o1 = new Order(); //Create a new order
		o1.add(phone1);
		o1.add(tv1); 
		Maria.addOrder(o1);//Add the order to Maria
		//Maria.printOr();//Print Maria's order --> you can use this if you need to


		//**************** Menu *******************

		//Attributes
		boolean answer = true;
		//Initializing quit = exit the program as a false 
		boolean quit = false;
		int option;
		int pID;

		do {
	
			//Print menu
			System.out.println("1. Create a new phone"); 
			System.out.println("2. Create a new customer");
			System.out.println("3. Search for a product using product ID");
			System.out.println("4. Display all products"); 
			System.out.println("5. Order a product as a customer");
			System.out.println("6. Display all orders that a customer has made"); 
			System.out.println("7. Display all orders for a given product using product ID");
			System.out.println("8. Quit");

			System.out.println("Welcome to this shopping application. Choose one of the options above");
			option = scan.nextInt();

			switch (option) {

			case 1: System.out.println("**** Welcome to the create a new phone section ****");//Create a new phone
			while (answer == true) { 

				System.out.println("Enter the product name: ");
				String pName = scan.next();

				System.out.print("Enter the product description: ");
				String Pdescription = scan.next();

				System.out.println ("Enter the product price: ");
				double pPrice = scan.nextDouble();

				System.out.println("Enter the phone make: ");
				String phoMake = scan.next();

				System.out.println ("Enter the phone model: ");
				String phoModel = scan.next();

				System.out.println ("Enter the phone storage: ");
				Integer phoStorage = scan.nextInt();

				//This will add into the arraylist theproductList --> a new phone details
				theProductList.add( new Phone(pName, Pdescription, pPrice, phoMake, phoModel, phoStorage)); 

				//Options true/false to keep entering information 
				System.out.print("Do you want to keep entering new phone details (true/false)?\n");
				answer = scan.nextBoolean();
			}
			if (answer == false) {

				System.out.println("****** Thank you for adding a phone to the products database *****\n");}
			break;

			case 2: System.out.println("**** Welcome to the create a new customer section ****"); //Create a new customer

			System.out.print("Enter customer name: ");
			String cName = scan.next();

			System.out.print ("Enter customer address: ");
			String cAddress = scan.next();

			//Add the customer to the customer list
			theCustomerList.add(new Customer(cName, cAddress));


			//Options true/false to keep entering information 
			System.out.print("Do you want to keep entering new customers (true/false)?\n");
			answer = scan.nextBoolean();

			if (answer == false) {

				System.out.println("****** Thank you for adding a new customer to the products database *****\n");
			}

			break;


			case 3: System.out.println("**** Welcome to search for a product ****");//Search  for a product using product ID
			try {
				System.out.print("Enter product ID: ");
				pID = scan.nextInt();

				Product psearch = (Product) theProductList.search(pID);//Search for that product id the user just entered
				System.out.println("*****Search result*****");
				psearch.print();


				//Options true/false to keep entering information 
				System.out.print("Do you want to keep searching for a product (true/false)?\n");
				answer = scan.nextBoolean();

				if (answer == false) {

					System.out.println("****** Thank you *****\n");}


			} // print the product that has that product iD
			catch(Exception e){
				System.out.println("Warning: That is not an existing product ID");
			}

			break;

			case 4: System.out.println("**** Welcome to display all products ****");
			//List of all the products in the productDB
			theProductList.print();

			break;


			case 5: System.out.println("**** Welcome to order a product****");

			//Display all customers
			theCustomerList.print();
			System.out.println("Choose a customer ID from the list below: "); //Choose a customer id(index starting from 0)
			int cID = scan.nextInt();

			Customer currentCus = theCustomerList.getCustomer(cID);//get a customer with that customer id from the customer list
			Order currentor = new Order(); //Create a new order "current order = currentor "

			char ans = 'Y';
			do {

				System.out.println("What product would you like to order? Pick A for Mobile phone or B for TV"); //choosing a product Mobile phone or TV
				char cAnswer = scan.next().charAt(0);

				if (cAnswer == 'A' || cAnswer == 'a') {
					//List of available phones so the customer can pick from the list			
					System.out.println("**** Mobiles Phone available ****");
					theProductList.printSpecs("Mobile Phone"); //Print products where type = Mobile phone
					try {
						System.out.print ("Enter the product ID you choose: ");
						pID = scan.nextInt();
						//Choose the quantity of that product
						System.out.print ("Enter the quantity: ");
						int quantity = scan.nextInt();

						for (int p = 0; p < quantity; p ++) {
							currentor.add(theProductList.getProduct(pID)); //Add to the current order -->currentor
							//add it to the customer
						}
					}
					catch(Exception e){
						System.out.println("Warning: That is not an existing product ID");
					}
					System.out.println("Would you like to order another product? Y for yes, anything else for no");
					ans = scan.next().charAt(0);

				}else if (cAnswer == 'B' || cAnswer == 'b'){
					//List of available TVs
					System.out.println("**** TVs available ****");
					theProductList.printSpecs("Television");
					try {
						System.out.print ("Enter the product ID you choose: ");
						pID = scan.nextInt();

						//Choose the quantity of that product
						System.out.print ("Enter the quantity: ");
						int quantity = scan.nextInt();

						for (int p = 0; p < quantity; p ++) {
							currentor.add(theProductList.getProduct(pID));//Add to the current order -->currentor
							//add it to the customer!!!!!
						}
					}
					catch(Exception e){
						System.out.println("Warning: That is not an existing product ID");
					}
					System.out.println("Would you like to order another product? Y for yes, anything else for no");
					ans = scan.next().charAt(0);
				}else {
					System.out.println("Incorrect choice. Please try again");
				}
			} while (ans == 'Y' || ans == 'y' );
			break;

			case 6: System.out.println("**** Welcome to display all orders from a customer****");
			//Display all customers here and then choose one
			theCustomerList.print();
			try {
				System.out.println("Choose a customer ID from the list below: "); //Is the index where is it starting from 0
				cID = scan.nextInt();

				Customer currentCust = theCustomerList.getCustomer(cID);//get the customer with that "ID" from the customerlist 
				currentCust.printOr();// print the order of that customer
			}
			catch(Exception e){
				System.out.println("Warning: That is not an existing customer ID");
			}

					
			break;

			case 7: System.out.println("**** Welcome to display all orders for a given product ****");
			System.out.println("Enter product ID: ");
			pID = scan.nextInt();
			try {
			/***************Here I could have add an orderdb so I store all orders there and then I can search trough them and print the ones with that ID
			but because there was not mention of it in the brief I decided to go trough each customers to check if they ordered something with that ID
			then get that order, get the product with that ID only and then only print those ones********************/

			for (int c = 0; c < theCustomerList.getTotal(); c ++) {	
				Customer currentCusto = theCustomerList.getCustomer(c); //current customer starting from the one at index 0			
				for (int o = 0; o < currentCusto.totalOrder(); o ++) { 
					Order currentOrder = currentCusto.getOrder(o);//get order from that current currentCusto
					for (int p = 0; p < currentOrder.getTotal(); p ++) {
						Product currentProduct = currentOrder.getProduct(p); //get product from that order
						if (currentProduct.getpID() == pID) { //Compare the ID of that product in that order of that customer to the ID we are passing
							currentProduct.print(); //If is the same print it 
						}
					}		
				}
			}}
			catch(Exception e){
				System.out.println("Warning: That is not an existing product ID");
			}
			break;

			//Exit the program
			case 8: quit = true;
			
			break;
			}
		} while (!quit);
		System.out.println("Bye!");
		
	}

}




