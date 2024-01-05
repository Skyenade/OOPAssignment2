package PartII;

import Pack1.WheeledTransportation;
import Pack2.*;
import Pack3.Metro;
import Pack4.Monowheel;
import Pack5.Aircraft;
import Pack5.WorldWarIIAirplane;
import Pack6.Ferry;


public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WheeledTransportation wt1 = new WheeledTransportation();
		WheeledTransportation wt2 = new WheeledTransportation(4,180);
		WheeledTransportation wt3 = new WheeledTransportation(wt2);
		
		Train tn1 = new Train();
		Train tn2 = new Train(12,150,8,"Montreal","New York");
		Train tn3 = new Train(tn2);
		
		Tram tm1 = new Tram();
		Tram tm2 = new Tram(8,80,10,"Vancouver","Alberta",5,2012);
		Tram tm3 = new Tram(tm2);
		
		Metro mt1 = new Metro();
		Metro mt2 = new Metro(18,100,6,"Toronto","Québec",20);
		Metro mt3 = new Metro(mt2);
		
		Monowheel ml1 = new Monowheel();
		Monowheel ml2 = new Monowheel(1,90,100);
		Monowheel ml3 = new Monowheel(ml2);
		
		Aircraft a1 = new Aircraft();
		Aircraft a2 = new Aircraft(150000,30000);
		Aircraft a3 = new Aircraft(a2);
		
		WorldWarIIAirplane wIIa1 = new WorldWarIIAirplane();
		WorldWarIIAirplane wIIa2 = new WorldWarIIAirplane(9000000,10000,true);
		WorldWarIIAirplane wIIa3 = new WorldWarIIAirplane(wIIa2);
		
		Ferry f1 = new Ferry ();
		Ferry f2 = new Ferry (60,9000);
		Ferry f3 = new Ferry (f2);
		
		
		Object[] mixedArray1 = {wt1, wt2, wt3, tn1, tn2, tn3, tm1, tm2, tm3, mt1, mt2, mt3, ml1, ml2, ml3,
                a1, a2, a3, wIIa1, wIIa2, wIIa3,
                f1, f2, f3};

		System.out.println("First Array:");
		displayInv(mixedArray1);
		
		Object[] copiedArray = copyTheObjects(mixedArray1);
		
		System.out.println("Copy Array:");
		displayInv(copiedArray);

	}
		
	public static void displayInv(Object[] inv) {
		for (int i = 0; i<inv.length;i++) {
			System.out.println(inv[i]);
		}
	}	
	
	public static Object[] copyTheObjects(Object[] inv) {
		Object[] copyarr = new Object[inv.length];
		for (int i = 0; i<inv.length;i++) {
			if (inv[i] instanceof Object) {
                copyarr[i] = ((Object) inv[i]).copy();
            } else {
                copyarr[i] = null;
            }			
		}
		return copyarr;	
	}
	
	public static Object[] copyInventory2(Object[] inv) {
		Object[] copyarr = new Object[inv.length];
		for (int i = 0; i<inv.length;i++) {
			copyarr[i] = new Object(inv[i]);			
		}
		return copyarr;		
	}
	
	

}

