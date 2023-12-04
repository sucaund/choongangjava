package board.iterator;
//재료상자와 해당재료 리스트를 어떻게 배열할지 정하는...
public class BidAggregate implements Aggregate{

	private int[] bidArray = new int[10000];
	
	public BidAggregate() {
		for(int i = 0;i<10000;i++) {
			bidArray[i] =i;
		}
	}
			
	public int[] getBidArray() {
		return this.bidArray;
	}
			
	@Override
	public Object iterator() {
		return new BidIterator();
	}

}
