package org.epsi.cafetiere;

public class Cafe {
 
	TypeCafe typeCafe ;
	double quantiteLiquideMl ;

	public TypeCafe getTypeCafe() {
		return typeCafe;
	}

	public void setTypeCafe(TypeCafe typeCafe) {
		this.typeCafe = typeCafe;
	}

	public double getQuantiteLiquideMl() {
		return quantiteLiquideMl;
	}

	public void setQuantiteLiquideMl(double quantiteLiquideMl) {
		this.quantiteLiquideMl = quantiteLiquideMl;
	}

	public Cafe() {
		typeCafe = TypeCafe.MOKA ; 
		quantiteLiquideMl = 100 ; 
	}
	
	Cafe(TypeCafe typeCafe, double quantiteLiquideMl) {
		this.typeCafe = typeCafe ; 
		this.quantiteLiquideMl = quantiteLiquideMl ; 
	}
	
}