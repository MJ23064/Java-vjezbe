
public class Kamion extends Vozilo {
      private int kapacitetTereta;
      private boolean prikolica;
	  public Kamion(String proizvodjac, int godinaProizvodnje, float kubikaza, String boja, int kapacitetTereta,
			boolean prikolica) {
		super(proizvodjac, godinaProizvodnje, kubikaza, boja);
		this.kapacitetTereta = kapacitetTereta;
		this.prikolica = prikolica;
	  }
	  public int getKapacitetTereta() {
		  return kapacitetTereta;
	  }
	  public void setKapacitetTereta(int kapacitetTereta) {
		  this.kapacitetTereta = kapacitetTereta;
	  }
	  public boolean isPrikolica() {
		  return prikolica;
	  }
	  public void setPrikolica(boolean prikolica) {
		  this.prikolica = prikolica;
	  }
	  @Override
	  public String toString() {
		return "Kamion [kapacitetTereta=" + kapacitetTereta + ", prikolica=" + prikolica + "]";
	  }
      
}
