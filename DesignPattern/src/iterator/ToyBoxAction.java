package iterator;
//iterator의 hasnext와 next에 살을 붙여 어떠한 조건으로 사용할 액션을 정한다
public class ToyBoxAction implements Iterator{

	int currIndex = 0;
	int[] numbers;
//	실제 배열에 필요한 Toybox 배열을 집어넣어야 본 클래스가 실행된다!!
//	그렇기에 Toybox 클래스에선 Aggregate에 의해 생성된Iterator를 오버로딩후
//	new toyBoxAction(Iterator 에 살을붙힌) 라는 새로운 객체 만들어 준다 
	public ToyBoxAction(int[] numbers) {
		this.numbers=numbers;
	}

	@Override
	public boolean hasnext() {
		if(currIndex>4) {
			return false;
		}else {
			return true;			
		}
	}
	@Override
	public Object next() {
		
		return numbers[currIndex++];
	}
	
}
