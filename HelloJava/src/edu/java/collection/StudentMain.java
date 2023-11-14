package edu.java.collection;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;import javax.print.DocFlavor.STRING;

public class StudentMain {

	public static void main(String[] args) {
		Student hong = new Student("std001", "홍길동", 100, 90, 80);
		// hong.kor은 스투던트 파일네에 kor은 프라이빗이므로 해당 클래스내에서만 바꿀수있으므로...
//		hong.setKor(95);
		Student kang = new Student("std002", "홍길동", 45, 80, 20);

		// 1.두학생의 데이터를 collection 으로 만들어서 국어, 영어,수학 점수합계평균을 출력
// list 사용

Map<String,Student>map=new HashMap<String, Student>();
map.put(hong.getSno(),hong);		
map.put(kang.getSno(),kang);		

List<Integer> al= new ArrayList<Integer>();
		
al.add(0);
al.add(0);
al.add(0);

Iterator it=map.entrySet().iterator();
while (it.hasNext()) {
	Map.Entry<String,Student> entry
		=(Map.Entry<String,Student>)it.next();
	Student student=(Student)entry.getValue();
	al.set (0,al.get(0)+student.getKor());
	al.set (1,al.get(1)+student.getEng());
	al.set (2,al.get(2)+student.getMath());
}
for (Integer in : al) {
	System.out.println(in/map.size());
}

	}
}
