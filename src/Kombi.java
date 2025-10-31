
public class Kombi extends Vozilo {
     private int kapacitetPutnika;

	 public Kombi(String proizvodjac, int godinaProizvodnje, float kubikaza, String boja, int kapacitetPutnika) {
		super(proizvodjac, godinaProizvodnje, kubikaza, boja);
		this.kapacitetPutnika = kapacitetPutnika;
	 }

	 public int getKapacitetPutnika() {
		 return kapacitetPutnika;
	 }

	 public void setKapacitetPutnika(int kapacitetPutnika) {
		 this.kapacitetPutnika = kapacitetPutnika;
	 }

	 @Override
	 public String toString() {
		return "Kombi [kapacitetPutnika=" + kapacitetPutnika + "]";
	 }
     
}
