package com.tornam.buy;

 class Domain{
	private String name=null;
	private int startPrice;
	private int nowPrice;
	
	public String getName(){
		return name;
	}
	public void  SetName(String name){
		this.name= name;
		
	}
	public int getStartPrice(){
		return startPrice;
	}
	
	public void setStartPrice(int startPrice){
		
		this.startPrice= startPrice;	
	}
	
	public int getNowPrice(){
		 return nowPrice;
	}
	public void setNowPrice(int nowPrice){
		this.nowPrice = this.startPrice;
		if((nowPrice<=this.nowPrice)||(nowPrice%10!=0)){
			System.out.println("你输入的价格必须大于当前价格"+this.startPrice+"￥，并得10￥的倍数！");
		}else{
			 this.nowPrice= nowPrice;
		}
	}
	public void showInfo() throws Exception{
		System.out.println("域    名："+getName());
		System.out.println("初始价："+getStartPrice()+"￥");
		System.out.println("当前价："+getNowPrice()+"￥");
		System.out.println("------------------------------");
		System.out.println("域    名："+getName()+" 的注册信息如下：");
		System.out.println("------------------------------");
		Whois w = new Whois();
		System.out.println(w.query(getName()));
	}
}
 

/*
public class BuyDomain {

	public static void main(String[] args) {
		Domain show = new Domain();
		show.SetName("tornam.com");
		show.setStartPrice(50);
		show.setNowPrice(80);
		show.showInfo();
	}

}*/
