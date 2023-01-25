package ht.bac3;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {

	public static void main(String[] args) {
		Hashtable<String, String> mapArticle = new Hashtable<String, String>();
		mapArticle.put("A01","LAIT");
		mapArticle.put("A02","SAVON");
		mapArticle.put("A03","STYLO");
		mapArticle.put("B01","BROSSE A DENTS");
		mapArticle.put("B02","SUCRE");
		mapArticle.put("B03","FLASH DISC");
		mapArticle.put("C01","DISC DUR");
		mapArticle.put("C02","LUNETTE");
		mapArticle.put("C03","CASQUETTE");
		mapArticle.put("D01","CHARGEUR TELEPHONE");
		mapArticle.put("D01","CABLE USB");
		mapArticle.put("D03","SOCKET");
		mapArticle.put("E01","TAPIS");
		mapArticle.put("E02","CHAISSE EN PLASTIQUE");
		mapArticle.put("E03","LAIT DE BEAUTE");
		mapArticle.put("F01","CARTON BABY FOOD");
		mapArticle.put("F02","PINCE CHEVEU");
		mapArticle.put("F03","TISSU");
		mapArticle.put("G01","BOUCLE D'OREILLE");
		mapArticle.put("G02","CHOSSETTE");
		
		for (Map.Entry mapentry : mapArticle.entrySet()){
			if(mapentry.getKey().equals("B03"))
			System.out.println("cle: "+mapentry.getKey()
			+  " | value : " + mapentry.getValue());
		}


	}

}
