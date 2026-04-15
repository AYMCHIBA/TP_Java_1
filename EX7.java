package TP3;
import java.util.Scanner;

class Produit{
	int id;
	String nom;
	String description;
	double prix;
	int quantite;
	static Produit[] Produits=new Produit[40];
	static int count=0;
	
	public Produit(int id,String nom,String descri,double prix,int quantite) {
		this.id=id;
		this.nom=nom;
		this.description=descri;
		this.prix=prix;
		this.quantite=quantite;
	}
	public static void ajouterProd(Produit p) {
		if(count<Produits.length) {
			Produits[count]=p;
			count++;
		}else {
			System.out.println("warehouse est plein");
		}
	}
	public static void modifierProd(int id,String nom,String descri,double prix,int quantite) {
		for(int i=0;i<count;i++) {
			if(Produits[i].id==id) {
				Produits[i].nom=nom;
				Produits[i].description=descri;
				Produits[i].prix=prix;
				Produits[i].quantite=quantite;
				System.out.println("produit N:"+id+" est modifie");
				return;
			}
		}
		System.out.println("produit n existe pas.");
	}
	public static void supprimerProd(int id) {
		for(int i=0;i<count;i++) {
			if(Produits[i].id==id) {
				for(int j=i;j<count-1;j++) {
					Produits[j]=Produits[j+1];
				}
			Produits[count-1]=null;
			count--;
			System.out.println("Produit est supprime.");
			return;
			}
		}
		System.out.println("produit n existe pas.");
	}
	  public static Produit getProduitByID(int id) {
	        for (int i=0;i<count;i++) {
	            if (Produits[i].id==id) {
	                return Produits[i];
	            }
	        }
	        System.out.println("produit n existe pas.");
	        return null;
	  }
	  public static void getAllProduit() {
	        for (int i=0;i<count;i++) {
	            Produits[i].afficher();
	        }
	   }
	  public void afficher() {
	    System.out.println("ID: "+ id +", Nom: " + nom+", Description: "+description+
	    ", Prix: "+prix+", Quantité: "+quantite);
	    }
	 
		
}
public class EX7 {
	 public static void main(String[] args) {
		Produit.ajouterProd(new Produit(1, "PC","GAMER",5000,10));
		Produit.ajouterProd(new Produit(2, "PC","Bureau",2000,20));
		Produit.ajouterProd(new Produit(3, "Ecran","MSI",1000,10));
		Produit.getAllProduit();
		Produit.modifierProd(1, "PC Gamer", "Puissant", 6000,3);
	    Produit p = Produit.getProduitByID(1);
	    if (p != null) {
	        p.afficher();
	    }
	    Produit.supprimerProd(2);
	    Produit.getAllProduit();
		}
}
