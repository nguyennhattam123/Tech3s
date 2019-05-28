package com.tech3s.jcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Cau3 {
    private static Scanner sc = new Scanner(System.in);
    
    static int createRamdom(int n)
    {
        Random rd = new Random();
        int number = rd.nextInt(n);
        return number;
    }
    
    static List<Integer> subCollection(List<Integer> list1,List<Integer> list2)
    {
        List<Integer> listCollection = new ArrayList<Integer>();
        for (Integer i : list1) {
            for (Integer j : list2) {
                if (i==j)
                    listCollection.add(j);
            }
        }//gom các phần tử giống nhau của 2 list vào một list mới
        return listCollection;
    }
    
    public static void main(String[] args) {
        System.out.print("Nhập số lượng số lượng phần tử cần thêm vào list của bạn:");
        int num1 = sc.nextInt();
        
        List<Integer> listInt = new ArrayList<Integer>();
        for(int i=0;i<num1;i++)
        {
            int temp;
            System.out.print("Nhập số nguyên thứ " +(i+1)+":");
            temp = sc.nextInt();
            listInt.add(temp);
        }//nhập danh sách các số nguyên và thêm vào list các số nguyên
        
        System.out.print("Nhập số lượng số ngẫu nhiên bạn cần:");
        int num = sc.nextInt();
        
        List<Integer> listIntRamdom = new ArrayList<Integer>();
        for (int i=0;i<num;i++) {
            listIntRamdom.add(createRamdom(66)+1);//tạo ra 6 số ramdom lucky từ 1-66
        }
        
        System.out.println("List bạn vừa nhập là:"+listInt);
        System.out.println("List danh sách 6 số ngẫu nhiên:"+listIntRamdom);
        if(listInt.containsAll(listIntRamdom)){//kiểm tra xem có phần tử nào trong listIntRamdom thuộc listInt không?
            System.out.println("Các con số may mắn là:"+ subCollection(listInt,listIntRamdom));
        }
        else{
            System.out.println("Rất tiếc không có ai trúng thưởng");
        }
        
    }
    
}
