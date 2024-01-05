package Pack2;

import Pack3.Metro;

public class Tram extends Metro{
	
	protected int yearOfCreation;
	private long serialNumber;
	private static long serialNumbercounter = 30000;
	
	public Tram() {
		System.out.println("Tram default");
		yearOfCreation = 0;
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}

	public Tram(int nw, double ms, int nv, String nss, String nds, int tns, int yoc) {
		super(nw, ms, nv, nss, nds, tns);
		System.out.println("Tram parameter");
		yearOfCreation = yoc;
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}

	public Tram(Tram tm) {
		System.out.println("Tram copy");
		yearOfCreation = tm.yearOfCreation;
		setNumberOfWheels(tm.getNumberOfWheels());
		setMaximumSpeed(tm.getMaximumSpeed());
		setNumberOfVehicles(tm.getNumberOfVehicles());
		setNameOfTheStartingStation(tm.getNameOfTheStartingStation());
		setNameOfDestinationStation(tm.getNameOfDestinationStation());
		setTotalNumberOfStops(tm.getTotalNumberOfStops());
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}

	public int getYearOfCreation() {
		return yearOfCreation;
	}

	public void setYearOfCreation(int yoc) {
		yearOfCreation = yoc;
	}
	
	public void getNextSerialNumber() {
		System.out.println("comes from Tram");
		System.out.println("The next serial number is " + serialNumbercounter);
	}
	
	public boolean equals(Tram tm) {
		if (tm == null || tm.getClass() != this.getClass()) {
	        return false;
		}
	    if (tm == this) {
	        return true;
	    }
	    return false;
	}
	
	public String toString() {
		return "this Tram - serial# " + serialNumber + 
				" - has " + getNumberOfWheels() + 
				" wheels, has a maximum speed of " + getMaximumSpeed() +
				" km/h. It has " + getNumberOfVehicles() +
				" vehicles, its starting and destination stations are " + getNameOfTheStartingStation()+
				" and " + getNameOfDestinationStation() +
				". The number of stops is " + getTotalNumberOfStops() +
				" and the year of creation is " + yearOfCreation ;
	}
		
}
