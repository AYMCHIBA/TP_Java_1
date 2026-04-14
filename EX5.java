package TP3;

class CompteBancaire{
	int numero;
	double solde;
	public CompteBancaire(int numero,double soldeInitial) {
	        this.numero = numero;
	        this.solde = soldeInitial;
	}
	void deposer(double montant) {
		if(montant>0) {
			this.solde+=montant;
			System.out.println(montant+" a ete ajouter a votre compte");
		}else {
				System.out.println("montant est negatif");
			}
		}
	void retirer(double montant) {
		if(montant>0 && montant<= this.solde) {
			this.solde-=montant;
			System.out.println(montant+" a ete retirer successfuly");
		}else {
			System.out.println("Solde insuffisant ou montant invalide !");
		}
	}
	void transferer(double montant,CompteBancaire A) {
		if(montant>0 && montant<=this.solde) {
			this.solde -= montant;        
            A.deposer(montant);     
            System.out.println( montant + " a ete transfere au compte n°" + A.numero + " avec succes.");
		}else {
			System.out.println("Transfert impossible : Solde insuffisant.");
		}
	}
	public double afficherSolde() {
		return this.solde;
	}
}
public class EX5 {
	public static void main(String[] args) {
		CompteBancaire c1 = new CompteBancaire(10, 3000);
		CompteBancaire c2 = new CompteBancaire(20, 2000);
		System.out.println("solde de 1 account : ");
		System.out.println(c1.afficherSolde());
		System.out.println("solde de 2 account : ");
		System.out.println(c2.afficherSolde());
		c1.transferer(400, c2);
		System.out.println("apres la transfer de 400 de account n°"+c1.numero+" vers account n°"+c2.numero);
		System.out.println("account 1 : ");
		System.out.println(c1.afficherSolde());
		System.out.println("account 2 : ");
		System.out.println(c2.afficherSolde());
		
	}

}