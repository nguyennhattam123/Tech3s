package com.tech3s.jcoder;

import java.util.Scanner;

public class Cau1 {
	public static void main(String[] args) {
	// cau 1  phuong trinh bac 1
		Scanner sc=new Scanner(System.in);
		float a,b,x;
		System.out.print("nhap so a: ");
		a=sc.nextFloat();
		System.out.print("nhap so b: ");
		b=sc.nextFloat();
		if((int)a==0) {
			if((int)b==0) System.out.print("phuong trinh vo so nghiem");
			else System.out.print("phuong trinh vo nghiem");
		}
		x=-b/a;
		System.out.print("phuong trinh co 1 nghiem: x = "+x);
		
	
	}
	
}

