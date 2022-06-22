package mocktest;



public class Krankenkasse {

	Gehaltsrechner g = new Gehaltsrechner();

	/*
	public Krankenkasse(Gehaltsrechner g) { // Prinzip Dependency Injecton
		this.g = g;
	} // geht auch mit Setter! 
    */
    
	public double calcBeitrag(double grossSalary) {
		double net =  g.calcNetto(grossSalary);  // not desired dependency
		return net / 5; // That is, what we want to test
	}
}
