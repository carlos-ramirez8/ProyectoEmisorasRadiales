
public class Controlar {
	private double frecuencia;
	
	public Controlar(double frecuencia) {
		super();
		this.frecuencia = frecuencia;
	}
	public double getFrecuencia() {
		return frecuencia;
	}
	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}
	
	public void SubirFrecuencia() {
	if (frecuencia >= 80 && frecuencia <=108);
	   frecuencia +=0.5;
}

    public void BajarFrecuencia() {
    	if (frecuencia <=80) {
    		frecuencia =108;
    	} else {
    	  frecuencia-=0.5;
    
    }
    }
}