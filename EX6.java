package TP3;
import java.util.Scanner;

class Voiture{
	String marque;
	float vitesse;
	public Voiture(String marque,float vitesse) {
		this.marque=marque;
		this.vitesse=vitesse;
	}
	public void accelerer(float speed) {
		this.vitesse+=speed;
		if (this.vitesse > 240) {
            this.vitesse = 240;
            System.out.println("Vitesse maximal : 240 km/h");
        } else {
            System.out.println("La nouvelle vitesse de la " + this.marque + " : " + this.vitesse + " km/h");
        }
    }
	public void freiner(float speed) {
		this.vitesse-=speed;
	    if (this.vitesse <0 ) {
	    	this.vitesse =0;
	        System.out.println("La voiture est arreter.");
	    } else {
	        System.out.println(" La vitesse actuelle : " + this.vitesse + " km/h");
	    }
	}
		
}
public class EX6 {
	public static void main(String[] args) {
		float speed;
		String name;
		Scanner in=new Scanner(System.in);
		System.out.println("entrer la marque: ");
		name=in.next();
		System.out.println("entrer votre speed actuelle: ");
		speed=in.nextFloat();
		Voiture V1=new Voiture(name,speed);
		System.out.println("vitesse ajoute?");
		speed=in.nextFloat();
		V1.accelerer(speed);
		System.out.println("la valeur de freinage: ");
		speed=in.nextFloat();
		V1.freiner(speed);
	}
}
	
