package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Test3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] listA = new int[] {1,6,454,12,67,6};
		
		System.out.println("TIm so 6 dau tien trong chuoi" +Arrays.toString(listA));
		
		
		boolean check = false;
		for(int i =0;i<listA.length;i++) {
			if (listA[i]==6) {
				System.out.println("Nam tai vi tri "+(i+1));
				check=true;
				break;
				
				
			}else {
				System.out.println("Khong tim thay 6");
			}
			
		}
		
		 //Set
		Random random = new Random();
		List<Product> listProducts = new ArrayList<>();
		Set<Product> setProducts = new HashSet<>();
		for(int i=0;i<6; i++) {
			Product product = new Product();
			product.setTitle("Title la "+(i+1));
			product.setDescription("" +(i+1));
			product.setPrice(random.nextInt(100));
			product.setQuantity(i*2+1);
			listProducts.add(product);
			setProducts.add(product);
		}
		
		for(Product product : listProducts) {
			if(product.getPrice()>=100) {
				System.out.println(product);
			}
		}
		
		
	}

	
	
}
