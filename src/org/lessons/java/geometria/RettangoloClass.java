package org.lessons.java.geometria;

public class  RettangoloClass {
	
	private int base;
	
	private int altezza;
	
	private int area;
	private int perimetro;
	
	public RettangoloClass (int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	
	
	//public RettangoloClass (int area, int perimetro) {
		//this.area = area;
		//this.perimetro = perimetro;
	//}
	
	public int calcolaArea (int area) {
		
		area = this.base * this.altezza;	
		return area;
	}
	
    public int calcolaPerimetro (int perimetro ) {
		
    	perimetro = (this.base + this.altezza) * 2;
    	return perimetro;
    }
    	
    public void stampaBaseAltezza () {
    	System.out.println ("Base: " + base);
    	System.out.println ("Altezza: " + altezza);
    }
    public void stampaAreaPerimetro () {
    		System.out.println ("Area: " + calcolaArea(area));
    		System.out.println ("Perimetro: " + calcolaPerimetro(perimetro));
    	}
    
    public void stampaRettangolo () {
    	for (int i = 1; i <= this.altezza; i++) {
    		
    		for (int y = 1; y <= this.base; y++) {
    			
    			if (i == 1 || i == this.altezza) {
    				System.out.print('@');
    				
    			} else if (y == 1 || y == this.base) {
    				System.out.print('@');
    				
    			} else {
    				System.out.print(' ');
    			}
    			
    			if (y == this.base ) {
    				System.out.print('\n');
    			}
    		}
    	}
    }
}
    	

