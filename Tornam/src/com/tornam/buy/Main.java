package com.tornam.buy;

public class Main {
	public static void main(String[] args) throws Exception {
		
		Domain show = new Domain();
		show.SetName("tornam.com");
		show.setStartPrice(50);
		show.setNowPrice(80);
		show.showInfo();

	}

}
