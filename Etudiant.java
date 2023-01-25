package TP2.bac3;

public class Etudiant {
	private int Matricule;
	private String Nom;
	private String Promotion;
	private int Age;
	private String Etciv;
	
	//CONSTRUCTEUR AVEC PARAMETRES
	
public Etudiant(int matricule, String nom, String promotion, int age, String etciv) {
	
	Matricule = matricule;
	Nom = nom;
	Promotion = promotion;
	Age = age;
	Etciv = etciv;
	}
	//CONSTRUCTEUR SANS PARAMETRES

public Etudiant() {
		
	}
//GETTEURS ET SETTEURS

public int getMatricule() {
	return Matricule;
}

public void setMatricule(int matricule) {
	Matricule = matricule;
}

public String getNom() {
	return Nom;
}

public void setNom(String nom) {
	Nom = nom;
}

public String getPromotion() {
	return Promotion;
}

public void setPromotion(String promotion) {
	Promotion = promotion;
}

public int getAge() {
	return Age;
}

public void setAge(int age) {
	Age = age;
}

public String getEtciv() {
	return Etciv;
}

public void setEtciv(String etciv) {
	Etciv = etciv;
}
//METHODE toString

@Override
public String toString() {
	return "Etudiant [Matricule=" + Matricule + ", Nom=" + Nom + ", Promotion=" + Promotion + ", Age=" + Age
			+ ", Etciv=" + Etciv + "]";
}


	
	

}
