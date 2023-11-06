package edu.java;


public class Home {

	//맨처음 home이 가지는 공통데이터를 가져보자!
	String gu;	//소속지역
	String name;	//건물이름
	int ho;	//호수
	int price; //가격

//	자이제 생성자를 만들어보자!(왜?)
	Home(){
			}
	
	
	Home(String gu,String name, int ho,int price){
	this.gu=gu;	
	this.name=name;	
	this.ho=ho;	
	this.price=price;	
	}
	
	String getHomeData() {
		
		String resultStr
		="이집의 지역은"+this.gu+","+"이름은"+this.name+","+
		"호수는?!"+this.ho;
		return resultStr;
	}
	
}


