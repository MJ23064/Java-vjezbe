
public class Automobil extends Vozilo {
	    private int brojVrata;
        private String tipMotora;
        private boolean dizel;
	    public Automobil(String proizvodjac, int godinaProizvodnje, float kubikaza, String boja, int brojVrata,
				String tipMotora) {
			super(proizvodjac, godinaProizvodnje, kubikaza, boja);
			this.brojVrata = brojVrata;
			this.tipMotora = tipMotora;
			this.dizel = dizel;
		}

		public boolean isDizel() {
			return dizel;
		}

		public void setDizel(boolean dizel) {
			this.dizel = dizel;
		}

		public int getBrojVrata() {
			return brojVrata;
		}

		 public void setBrojVrata(int brojVrata) {
			 this.brojVrata = brojVrata;
		 }

		 public String getTipMotora() {
			 return tipMotora;
		 }

		 public void setTipMotora(String tipMotora) {
			 this.tipMotora = tipMotora;
		 }

		 @Override
		 public String toString() {
			return "Automobil [brojVrata=" + brojVrata + ", tipMotora=" + tipMotora + ", dizel=" + dizel + "]";
		 }

		 
	
		 

		

	    
	   
	}


