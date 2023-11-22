package tyranno;

import java.io.Serializable;

public class TyrannoDonae implements Serializable{

	private int Donae;

	public TyrannoDonae() {
		// TODO 자동 생성된 생성자 스텁
	}
	public int getDonae() {
		return Donae;
	}

	public TyrannoDonae(int donae) {
		super();
		Donae = donae;
	}
	public void setDonae(int donae) {
		Donae = donae;
	}
	
	
}
