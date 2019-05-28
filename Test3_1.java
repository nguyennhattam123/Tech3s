package practice;

import java.util.List;
import java.util.Scanner;

import lib.MathLib;

public class Test3_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Giai pt ax + b=0");
		System.out.print("Nhap a: ");
		double a = scanner.nextDouble();
		
		System.out.print("Nhap b: ");
		double b = scanner.nextDouble();
		
		Double x1= MathLib.ptBac1(a, b);
		if(x1 ==null)
		{
			System.out.println("K gia tri");
		}
		else {
			System.out.println("Co gia tri la :"+x1);
		}
		
		
		System.out.println("Giai pt ax^2 + bx+c=0");
		System.out.print("Nhap a: ");
		a = scanner.nextDouble();
		
		System.out.print("Nhap b: ");
		b = scanner.nextDouble();
		
		System.out.print("Nhap c: ");
		double c = scanner.nextDouble();
		List<Double> x2= MathLib.bac2(a, b, c);
		if(x2.size()==0) {
			System.out.println("Vo nghiem");
		}
		else {
			System.out.println("X1 :"+x2.get(0)+"va nghiem X2 :"+x2.get(1));
		}
		
		scanner.close();
		
		

	}

}
