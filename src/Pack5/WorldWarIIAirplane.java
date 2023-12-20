package Pack5;

public class WorldWarIIAirplane {
	
	protected boolean twinEngine;
	protected long serialNumber;
	protected static long serialNumbercounter = 80000;
	
	public WorldWarIIAirplane() {
		this(false);
	}
	
	public WorldWarIIAirplane(boolean te) {
		twinEngine = te;
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}

	
}
