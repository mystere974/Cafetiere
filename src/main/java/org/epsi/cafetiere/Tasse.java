package org.epsi.cafetiere;


public class Tasse {

	double quantiteCafeMax ;

	Cafe cafe ;

	public double getQuantiteCafeMax() {
		return quantiteCafeMax;
	}

	public void setQuantiteCafeMax(double quantiteCafeMax) {
		this.quantiteCafeMax = quantiteCafeMax;
	}

	public Cafe getCafe() {
		return cafe;
	}

	public void setCafe(Cafe cafe) {
		this.cafe = cafe;
	}

	public Tasse() {
		quantiteCafeMax = 100 ;
	}
	
	public Tasse(float quantiteCafeMax) {
		this.quantiteCafeMax = quantiteCafeMax ; 
	}
	
	public double boire(double quantiteBut) {
		cafe.quantiteLiquideMl -= quantiteBut ; 
		return cafe.quantiteLiquideMl ; 
	}
	
	public void boire() {
		cafe.quantiteLiquideMl = 0;

	}
	
	public double getEspaceDisponible() {
		if(cafe == null)
			return quantiteCafeMax ; 
		else 
			return quantiteCafeMax - cafe.quantiteLiquideMl ; 
	}

	public void addCafe(Cafe commandeCafe) {
		if(cafe == null) {
			cafe = commandeCafe ;
		} else {
			cafe.quantiteLiquideMl += commandeCafe.quantiteLiquideMl ; 
			if(cafe.typeCafe != commandeCafe.typeCafe)
				cafe.typeCafe = TypeCafe.BATARD ; 
		}
		
		checkQuantite() ; 
	}
	
	public void checkQuantite() {
		if(cafe == null)
			return ; 
		if(cafe.quantiteLiquideMl > quantiteCafeMax) {
			cafe.quantiteLiquideMl = quantiteCafeMax ;
			System.out.println("Il y a trop de café dans la tasse !");
		}
			
	}
}