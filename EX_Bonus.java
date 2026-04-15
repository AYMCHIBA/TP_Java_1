package TP3;
import java.util.Scanner;
import java.util.Random;
public class EX_Bonus {
	public static void main(String[] args) {
		int n,nb=10,chance=0;
		Scanner in = new Scanner(System.in);
		Random r= new Random();
		int r1 = r.nextInt(10)+1;
		//System.out.println("R1: "+r1);
		do {
			System.out.println("\nEntrer le nombre : ");
			n=in.nextInt();
			nb--;
			chance++;
			if(n<r1) {
			System.out.println("\nPlus grand");
			}else if (n>r1){
				System.out.println("\nPlus petit");
			}
			System.out.println("\nnombre d eteration restant: "+nb);
		} while (n!=r1 && nb!=0);
		if(n==r1) {
		System.out.println("Bravo!");
		System.out.println("Score: "+(10-chance+1)+"/10");
        }else {
        	System.out.println("bonne chance la prochaine fois.");
        	System.out.println("Le nombre était : " + r1);
        	
        }
	}
}