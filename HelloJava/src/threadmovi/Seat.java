package threadmovi;

public class Seat {

	private String seatNO;
	private boolean resevationsea;

	public Seat() {
		
	}

	@Override
	public String toString() {
		return "Seat [seatNO=" + seatNO + ", resevationsea=" + resevationsea + "]";
	}

	public Seat(String seatNO, boolean resevationsea) {
		super();
		this.seatNO = seatNO;
		this.resevationsea = resevationsea;
	}

	public String getSeatNO() {
		return seatNO;
	}

	public void setSeatNO(String seatNO) {
		this.seatNO = seatNO;
	}

	public boolean isResevationsea() {
		return resevationsea;
	}

	public void setResevationsea(boolean resevationsea) {
		this.resevationsea = resevationsea;
	}
	

}
