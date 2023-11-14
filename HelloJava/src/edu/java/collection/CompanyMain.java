package edu.java.collection;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//실습2.회사 2개생성하고 회사 2개의 2022년 수익합꼐와
//    2023년 수익합계를 아래와같이 출력하시오
// ABC회사와 DEF회사의 2022년 총수익은 ___입니다.
// ABC회사와 DEF회사의 2023년 총수익은 ___입니다.
public class CompanyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company abc =new Company("a1002","abc",1500,1600);
		Company def =new Company("b1002","def",2500,3600);
//		HashMap은 MAP의 키,와 값을 쌍으로 저장하는 도구이다
//		(MAP은 키와 값 두가지만 가능 값이 1개를 넘어설수없다)
//		즉 Map<String, Company>map를 통하여 키가될 "a1002","abc"중 하나를 고르고
//		2500,3600를 하나의 값으로서 통합하는 과정이다.▼
Map<String, Company> map = new HashMap<String, Company>();
//put 은 해당 괄호 안의 키와 값을 해당 맵에 연결하는 것이다.
//▼상단의 HashMap을 통해 키와 값을 정했으면 이제 키를 무엇으로 할지 정하는것! 
map.put(abc.getSsn(),abc);
map.put(def.getSsn(),def);
//자! 이제 해당 클래스의 목적인 두회사의 연도별 합계를 저장할 공간또한 필요하다 .
//ArrayList<Integer>는 Company abc 
//=new Company("a1002","abc",1500,1600); 에서 Integer인 1500부터 시작한다는...
ArrayList<Integer> cl = new ArrayList<Integer>();
//2022
cl.add(0);
//2023
cl.add(1);
//맵안의 세트를(map.entrySet()) ... 반복하며 순회하기위한명령어로 
// map안의 세트를 순환하며 수정할수있게 해주는 ,,,
//순환되는 map의상태 it=map.안의 set로 입장.순환	
Iterator it=map.entrySet().iterator();
while(it.hasNext()) {
	Map.Entry<String, Company> entry = 
			(Map.Entry<String, Company>)it.next();
	Company company=(Company)entry.getValue();
	cl.set(0, null)
	
}



	}

}
