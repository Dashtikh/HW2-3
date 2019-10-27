package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	ME me = new ME();
        System.out.println("insert your name: ");
	 String str ;
        Scanner scanner=new Scanner(System.in);
        str=scanner.nextLine();

        if(str!=null && str.equals("Mohammad Dashti")){


	me.name();
        System.out.println("moaddel :"+me.moaddel());
        System.out.println("tedade vahed: "+me.tedadvahed());}
        else System.out.println("unknown person!");
    }
}
