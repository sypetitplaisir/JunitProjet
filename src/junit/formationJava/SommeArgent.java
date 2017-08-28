package junit.formationJava;

public class SommeArgent {
	
	private int solde;
	private String devise;
	
	public SommeArgent() {
		
	}

	
	public SommeArgent(int solde, String devise) {
		super();
		this.solde = solde;
		this.devise = devise;
	}

	public int getSolde() {
		return solde;
	}


	public void setSolde(int solde) {
		this.solde = solde;
	}

	public String getDevise() {
		return devise;
	}

	public void setDevise(String devise) {
		this.devise = devise;
	}

	public int Verser(int a, int soldcompt) {
		//this.solde += a;
		//return this.solde;
		return soldcompt+a;
		
	}
	
	/*
	public int Retirer(int a, int soldcompt) {
		//this.solde -= a;
		//return this.solde;
		
		try{
		    if (a > 1000){
		    	throw new IllegalArgumentException();
		    }
		 }catch(IllegalArgumentException  e){
		    System.out.println(e + "You entered more than 1000");
		 }
		return soldcompt-a;
	}
	*/
	
	public int Retirer(int a, int soldcompt) throws SommeTresGrandeException {
		//this.solde -= a;
		//return this.solde;
		
		if (a > 1000) {
			throw new SommeTresGrandeException(soldcompt, a);
		}
		return soldcompt-a;
	}

	
	
}


