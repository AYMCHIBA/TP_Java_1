package TP3;

import java.util.Scanner;
class Etudiant{
	String cne;
	double note;
	public String to_String() {
		return  "cne = "+cne+" note "+String.valueOf(note);
	}
	public void estAdmis() {
		if(this.note>12){
			System.out.println("etudiant admis");		
		}else {
			System.out.println("etudiant ajourne");
		}
	}
}
public class EX3 {
	public static void main(String[] args) {
		Etudiant E1=new Etudiant();
		Scanner in=new Scanner(System.in);
		System.out.println("donner CNE:");
		E1.cne=in.nextLine();
		System.out.println("donner la note :");
		E1.note=in.nextDouble();
		System.out.println(E1.to_String());
		E1.estAdmis();
	}
}