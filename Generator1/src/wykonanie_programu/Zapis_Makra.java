package wykonanie_programu;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import stale.Cykle;
import zmienne.Czynnosc;
public class Zapis_Makra {
	

	public static void main(String[] args) throws FileNotFoundException{
		 PrintWriter zapis = new PrintWriter("makro.txt");
		 
		
		  
		/*  int licznik = 0;

			  do{
				  zapis.println(Clap_Medium.clap);
				  licznik++;
			  }
			  while(licznik<10);
			  zapis.println("");  */
		  	 
		 
		  zapis.println (Cykle.cykl100);
		  
		  zapis.close();
	  }
	}
	


