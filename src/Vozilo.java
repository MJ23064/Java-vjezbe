
class Vozilo {

	private String proizvodjac;
    private	int godinaProizvodnje;
    private float kubikaza;
    private String boja;
	public Vozilo(String proizvodjac, int godinaProizvodnje, float kubikaza, String boja) {
		super();
		this.proizvodjac = proizvodjac;
		this.godinaProizvodnje = godinaProizvodnje;
		this.kubikaza = kubikaza;
		this.boja = boja;
	}
	public String getProizvodjac() {
		return proizvodjac;
	}
	public void setProizvodjac(String proizvodjac) {
		this.proizvodjac = proizvodjac;
	}
	public int getGodinaProizvodnje() {
		return godinaProizvodnje;
	}
	public void setGodinaProizvodnje(int godinaProizvodnje) {
		this.godinaProizvodnje = godinaProizvodnje;
	}
	public float getKubikaza() {
		return kubikaza;
	}
	public void setKubikaza(float kubikaza) {
		this.kubikaza = kubikaza;
	}
	public String getBoja() {
		return boja;
	}
	public void setBoja(String boja) {
		this.boja = boja;
	}
	@Override
	public String toString() {
		return "Vozilo [proizvodjac=" + proizvodjac + ", godinaProizvodnje=" + godinaProizvodnje + ", kubikaza="
				+ kubikaza + ", boja=" + boja + "]";
	}
	
	
    
    
	
}
