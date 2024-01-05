package Pack5;

public class WorldWarIIAirplane extends Aircraft{
	
	private boolean twinEngine;
	private long serialNumber;
	private static long serialNumbercounter = 80000;
	
	public WorldWarIIAirplane() {
		System.out.println("WorldWarIIAirplane default");
		twinEngine = false;
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}
	
	public WorldWarIIAirplane(double pr, double maxe,boolean te) {
		super(pr,maxe);
		System.out.println("WorldWarIIAirplane parameter");
		twinEngine = te;
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}
	
	public WorldWarIIAirplane(WorldWarIIAirplane wIIa) {
		System.out.println("WorldWarIIAirplane copy");
		twinEngine = wIIa.twinEngine;
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}

	public boolean getTwinEngine() {
		return twinEngine;
	}

	public void setTwinEngine(boolean te) {
		twinEngine = te;
	}

	public void getNextSerialNumber() {
		System.out.println("comes from WorldWarIIAirplane");
		System.out.println("The next serial number is " + serialNumbercounter);
	}
	
	public boolean equals(WorldWarIIAirplane wIIa) {
		if (wIIa == null || wIIa.getClass() != this.getClass()) {
	        return false;
		}
	    if (wIIa == this) {
	        return true;
	    }
	    return false;
	}
	
	@Override
	public String toString() {
		return "This World War II Airplane - serial# " + serialNumber + 
				" - has a twinEngine: " + twinEngine +
				", the price is " + getPrice();
	}	
		
}
