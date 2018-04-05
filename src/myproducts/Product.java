package myproducts;

public class Product {

		
		private String name;
		private int price;
		private int taxPercent;
		
		public int getPriceWithTax(){
			return price+(price*taxPercent/100);
		}
		
		@Override
		public String toString(){
			return "Product [name=" + name + ", getPriceWithTax()= " + getPriceWithTax()+ "]";
				
		}
		
		public Product(String name, int price, int taxPercent) {
			super();
			this.name = name;
			this.price = price;
			this.taxPercent = taxPercent;
			
	}
		public void price_increase(int taxPercent) {
			price = (int)(price * (1 + taxPercent/ 100.0));
	}
		
		
	
	

}
