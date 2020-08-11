
public class Main {
	public static void main (String[]args) {
		Controlar c1= new Controlar (90);
		c1.SubirFrecuencia();
		c1.BajarFrecuencia();
		System.out.println(c1.getFrecuencia());

}
}