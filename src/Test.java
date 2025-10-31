import java.util.ArrayList;
public class Test {

	public static void main(String[] args) {
		ArrayList<Vozilo>Vozila = new ArrayList<>();
		int registracija = 100;
		Automobil auto1 = new Automobil("Audi", 2020, 2400,"zelena",4,"12b");
        Kamion kamion1 = new Kamion("Volvo",2004,2000,"Bijela",14,true);
        Kombi kombi1 = new Kombi("Mercedes",2009,2540,"Crna",30);
        Vozila.add(auto1);
        Vozila.add(kamion1);
        Vozila.add(kombi1);
        for (Vozilo v : Vozila) {
        	if(v.getGodinaProizvodnje()>2010) {
        		registracija+=30;
        	}
        	if(v.getKubikaza()>2000) {
        		registracija+=50;
        	}
        	 
        		
        	
        }
		
        	
        

	}

}
