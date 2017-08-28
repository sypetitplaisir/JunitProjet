package junit.formationJava;

public class SommeTresGrandeException extends Exception{
	
	private static final long serialVersionUID = 1L;
	private int somme1,somme2;
	
	public SommeTresGrandeException(int somme1, int somme2) {
		super();
		
		this.somme1 = somme1;
		this.somme2 = somme2;
	}
	
	@Override
	public String toString() {
		return "Somme indisponible en GAB";
	}
	
	
}
