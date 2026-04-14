package TP3;

import java.util.Scanner;

class Point{
	double x;
	double y;
	public Point() {
		this.x=10;
		this.y=11;
	}
	
	public Point(double x,double y) {
		this.x=x;
		this.y=y;
	}
	public void afficher(){
		System.out.println("x: "+x+"\ny: "+y);
	}
	public void deplacer(double x,double y) {
		this.x+=x;
		this.y+=y;
		}
	public double distance() {
		double res=0;
		res=Math.sqrt((this.x*this.x)+(this.y*this.y));
		return res;
	}
	public double distance2pts(Point A) {
		double res;
		res=Math.sqrt(Math.pow((A.x-this.x),2)+Math.pow((A.y-this.y),2));
		return res;
	}
	}

public class EX1 { 
	public static void main(String[] args) {
	double x,y,res,res2pt;
	Point p1=new Point();
	Scanner in = new Scanner(System.in);
	System.out.println("entrer x :");
	x=in.nextDouble();
	System.out.println("\nentrer y :");
	y=in.nextDouble();
	Point p2=new Point(x,y);
	System.out.println("\nP1:");
	p1.afficher();
	System.out.println("\nP2:");
	p2.afficher();
	//p1.deplacer(x, y);
	//System.out.println("\nP1 apres deplacement:");
	//p1.afficher();
	res=p1.distance();
	System.out.println("\ndistance a l origine:"+res);
	res2pt=p1.distance2pts(p2);
	System.out.println("\ndistance entre P1 et P2:"+res2pt);
	}
}