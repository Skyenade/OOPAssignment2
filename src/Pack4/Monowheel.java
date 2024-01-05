package Pack4;

import Pack1.WheeledTransportation;

public class Monowheel extends WheeledTransportation{

	protected double maximumWeigth;
	private long serialNumber;
	private static long serialNumbercounter = 55000;
	
	public Monowheel() {
		System.out.println("Monowheel default");
		maximumWeigth = 0.0;
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}

	public Monowheel(int nw, double ms, double mw) {
		super(nw, ms);
		System.out.println("Monowheel parameter");
		maximumWeigth = mw;
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}
	
	public Monowheel(Monowheel ml) {
		System.out.println("Monowheel copy");
		maximumWeigth = ml.maximumWeigth;
		setNumberOfWheels(ml.getNumberOfWheels());
		setMaximumSpeed(ml.getMaximumSpeed());
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}

	public double getMaximumWeigth() {
		return maximumWeigth;
	}

	public void setMaximumWeigth(double mw) {
		maximumWeigth = mw;
	}
	
	public void getNextSerialNumber() {
		System.out.println("comes from Monowheel");
		System.out.println("The next serial number is " + serialNumbercounter);
	}
	
	public boolean equals(Monowheel ml) {
		if (ml == null || ml.getClass() != this.getClass()) {
	        return false;
		}
	    if (ml == this) {
	        return true;
	    }
	    return false;
	}

	
	@Override
	public String toString() {
		return "This Monowheel - serial# " + serialNumber + 
				" - has " + getNumberOfWheels() + 
				" wheels, has a maximum speed of " + getMaximumSpeed() +
				" km/h. It has a maximum weigth of " + maximumWeigth +
				" kg.";
	}
			
}
