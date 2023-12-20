package Pack4;

import Pack1.WheeledTransportation;

public class Monowheel extends WheeledTransportation{

	protected double maximumWeigth;
	protected long serialNumber;
	protected static long serialNumbercounter = 55000;
	
	public Monowheel() {
		maximumWeigth = 0.0;
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}

	public Monowheel(int nw, double ms, double mw) {
		super(nw, ms);
		maximumWeigth = mw;
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}
	
	public Monowheel(Monowheel ml) {
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
	
	@Override
	public String toString() {
		return "Monowheel info: maximumWeigth = " + maximumWeigth +
				", serial Number = " + serialNumber +
				", Number of Wheels = " + getNumberOfWheels()+
				", maximum speed = " + getMaximumSpeed();
	}
	
	
	
	
	
}
