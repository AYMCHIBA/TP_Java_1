package TP3;
import java.util.Scanner;
class Rectangle{
	double largeur;
	double hauteur;
	public Rectangle(double h,double l) {
		this.largeur=l;
		this.hauteur=h;
	}
	public double surface() {
		double surf=this.largeur*this.hauteur;
		return surf;
	}
	public double perimetre() {
		double peri=(this.hauteur*2)+(this.largeur*2);
		return peri;
	}
}
public class EX2 {
	public static void main(String[] args) {
		double h,l;
		Scanner in = new Scanner(System.in);
		System.out.println("entrer hauteur: ");
		h=in.nextDouble();
		System.out.println("entrer hauteur: ");
		l=in.nextDouble();
		Rectangle R1=new Rectangle(h,l);
		System.out.println("surface : "+R1.surface());
		System.out.println("perimetre : "+R1.perimetre());
		
		
	}

}
