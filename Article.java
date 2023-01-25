package ht.bac3;

public class Article {
	private String ref;
	private String libelle;
	private String cat;
	private float prix;
//CONSTRUCTEUR AVEC PARAMETRES
public Article(String ref, String libelle, String cat, float prix) {
	this.ref = ref;
	this.libelle = libelle;
	this.cat = cat;
	this.prix = prix;
	}
//CONSTRUCTEUR SANS PARAMETRES
public Article() {
		
	}
//GETTEURS AND SETTEURS
public String getRef() {
	return ref;
}
public void setRef(String ref) {
	this.ref = ref;
}
public String getLibelle() {
	return libelle;
}
public void setLibelle(String libelle) {
	this.libelle = libelle;
}
public String getCat() {
	return cat;
}
public void setCat(String cat) {
	this.cat = cat;
}
public float getPrix() {
	return prix;
}
public void setPrix(float prix) {
	this.prix = prix;
}
//METHODE TOSTRING
@Override
public String toString() {
	return "Article [ref=" + ref + ", libelle=" + libelle + ", cat=" + cat + ", prix=" + prix + "]";
}
	
	

}
