package com.tornam.buy;

import java.io.InputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		
		Domain show = new Domain();
		System.out.println("Please input domain name:");
		Scanner scan =new Scanner(System.in);
		String domain=scan.next();
		
		show.SetName(domain);
		show.setStartPrice(50);
		show.setNowPrice(80);
		show.showInfo();
		
	}

	

}
