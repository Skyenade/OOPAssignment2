package Pack5;

public class Aircraft {

	protected double price;
	protected double maxElevation;
	protected long serialNumber;
	protected static long serialNumbercounter = 55000;
	
	public Aircraft() {
		price = 0.0;
		maxElevation = 0.0;
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}

	public Aircraft(double pr, double maxe) {
		price = pr;
		maxElevation = maxe;
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}
	
	public Aircraft(Aircraft a) {
		price = a.price;
		maxElevation = a.maxElevation;
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double pr) {
		price = pr;
	}

	public double getMaxElevation() {
		return maxElevation;
	}

	public void setMaxElevation(double me) {
		maxElevation = me;
	}

	@Override
	public String toString() {
		return "The Aircraft price is" + price +
				", the maxElevation is " + maxElevation +
				" and the serialNumber is " + serialNumber;
	}
	
		
}
