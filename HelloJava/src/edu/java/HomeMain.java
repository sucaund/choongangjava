package edu.java;


public class HomeMain {

	public static void main(String[] args) {
		
		Home myhome
			=new Home("양펀구","행복아파트",203,500);
	
			Home yourhome
			=new Home("양천구","기쁨아파트",303,600);
			
			System.out.println(myhome.getHomeData());
			System.out.println(yourhome.getHomeData());
	
	}
	
	
}
