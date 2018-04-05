package myproducts;

public class Bread extends Product{





	private float volume;
	private int size;



	public Bread(String name, int price, int taxPercent, float volume){
		super(name, price, taxPercent);
		
		this.volume=volume;
	}
		public float getVolume(){
			return volume;
		}
		
		@Override
		public String toString() {
			return "Bread [volume=" + volume + ",toString()=" + super.toString() + "]";
		}
		public int getWeightedPrice(){
			return (int) (getPriceWithTax()/size);
		}
		public double getSize(){
			return size;
		}

		
		
		public static boolean compareBreads(Bread bread1, Bread bread2){
			if(bread1.getWeightedPrice()>bread2.getWeightedPrice()){
				return true;
			}
			else return false;
		}
		
		

		
		
	
	
}
