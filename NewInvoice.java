	//NewInvoice.java
	//Invoice class

	/*
	*Olatunji Israel Oladotun
	*Friday 25th July 2025
	*15:29
	*/

	public class NewInvoice {
		
		private String partNumber;
		private String partDescription;
		private int partQuantity;
		private double pricePerItem;
		
		
		// No-argument constructor
		public NewInvoice() {
        this.partNumber = "";
        this.partDescription = "";
        this.partQuantity = 0;
        this.pricePerItem = 0.0;
		
		}
    
		//Constructor
		public NewInvoice(String partNumber, String partDescription, int partQuantity, double pricePerItem) {
			
			this.partNumber = partNumber;
			
			this.partDescription = partDescription;
			
			if (partQuantity > 0)
				this.partQuantity = partQuantity;
			
			if (pricePerItem > 0.0)
				this.pricePerItem = pricePerItem;

			}
			
		//Setter for Part Number
		public void setPartNumber(String partNumber) {
			this.partNumber = partNumber;
		}
		
		//Getter for Part Number
		public String getPartNumber() {
			return partNumber;
		}
		
		//Setter for Part Description

		public void setPartDescription(String partDescription) {
			this.partDescription = partDescription;
		}
		
		//Getter for Part Description
		public String getPartDescription() {
			return partDescription;
		}
		
		//Setter for Part Quantity
		public void setPartQuantity(int partQuantity) {
			if (partQuantity < 0)
				System.out.println("Invalid Part Quantity\n");
			else
				this.partQuantity = partQuantity;
		}
		
		//Getter for Part Quantity
		public int getPartQuantity() {
			return partQuantity;
		}

		//Setter for Price Per Item
		public void setPricePerItem(double pricePerItem) {
			if (pricePerItem < 0)
				System.out.println("Invalid Price Per Item\n");
			else
				this.pricePerItem = pricePerItem;
		}
		
		//Getter for Part Quantity
		public double getPricePerItem() {
			return pricePerItem;
		}


		
		//Getter for Get Invoice Amount
		public double getInvoiceAmount() {
			return pricePerItem * partQuantity;
		}

	}
