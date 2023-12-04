package iterator;
//iterator 를 실제로 사용할제료와 해당재료를 어떻게 정렬할지 정하는iterator와 
//return new ToyBoxAction(numbers);

public class Toybox implements Aggregate{
//	 iterator 를 실제로 사용할 장난감박스 목록 (재료)
	String[] numbers = {"로봇","건담","자동차","곰돌이","비행기"};
	
//	해당 장난감 목록을 Aggregate가 생성한 iterator의 hasnext와 next를 가지고살을 붙힌
//	ToyBoxAction을 Object iterator로 반환하여 Object iterator의 값은

	
//	Aggregate에의해 생성된 iterator에 ToyBoxAction이란 살을 붙인 실행문을 만들어준다.
	@Override
	public Object iterator() {		
		return new ToyBoxAction(numbers);
	}
	
	
	
	}//class
	

