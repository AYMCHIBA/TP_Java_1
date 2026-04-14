package TP3;

import java.util.Scanner;
class NombreComplexe{
	double reel;
	double imaginaire;
	public NombreComplexe() {
	}
	public NombreComplexe(double re,double im) {
		this.reel=re;
		this.imaginaire=im;
	}
	public NombreComplexe addition(NombreComplexe N){
	
		double re=this.reel+N.reel;
		double im=this.imaginaire+N.imaginaire;
		NombreComplexe som=new NombreComplexe(re,im);
		return som;
	}
	public NombreComplexe multiplication(NombreComplexe N) {
		NombreComplexe mul=new NombreComplexe();
		mul.reel=this.reel*N.reel-this.imaginaire*N.imaginaire;
		mul.imaginaire=this.reel*N.imaginaire+this.imaginaire*N.reel;
		return mul;
	}
	public void afficher() {
		System.out.println(this.reel+"+i"+this.imaginaire);
	}	
	public static void tostring() {
		System.out.println("");
	}
}
public class EX4 {
	public static void main(String[] args) {
		NombreComplexe nbC=new NombreComplexe();
		Scanner in=new Scanner(System.in);
		System.out.println("entrer partie reel: ");
		nbC.reel=in.nextDouble();
		System.out.println("entrer partie imagi: ");
		nbC.imaginaire=in.nextDouble();
		System.out.println("nbc que tu a entrer: ");
		nbC.afficher();
		NombreComplexe nbC1=new NombreComplexe(2,5);
		System.out.println("nbc1: ");
		nbC1.afficher();
		NombreComplexe nbC2=new NombreComplexe(3,4);
		System.out.println("nbc2: ");
		nbC2.afficher();
		System.out.println("l addition de nbc1 et nbc2: ");
		nbC1.addition(nbC2).afficher();
		System.out.println("la multiplication de nbc1 et nbc2: ");
		nbC1.multiplication(nbC2).afficher();
	}
}