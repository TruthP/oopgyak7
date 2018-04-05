package user.first;

public class Number {

	double threshold= 0.001;
	private double realNum;
	public Number(double realNum) {
		super();
		this.realNum = realNum;
	}
	public double getRealNum() {
		return realNum;
	}
	public void setRealNum(double realNum) {
		this.realNum = realNum;
	}
	
	
	
	
		

	public boolean isThreshold(double number){
	if(Math.abs(realNum-number)<threshold){
		return true;
	}	
	else return false;
	}
	
}


