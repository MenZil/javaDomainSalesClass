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
			System.out.println("������ļ۸������ڵ�ǰ�۸�"+this.startPrice+"��������10���ı�����");
		}else{
			 this.nowPrice= nowPrice;
		}
	}
	public void showInfo() throws Exception{
		System.out.println("��    ����"+getName());
		System.out.println("��ʼ�ۣ�"+getStartPrice()+"��");
		System.out.println("��ǰ�ۣ�"+getNowPrice()+"��");
		System.out.println("------------------------------");
		System.out.println("��    ����"+getName()+" ��ע����Ϣ���£�");
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
