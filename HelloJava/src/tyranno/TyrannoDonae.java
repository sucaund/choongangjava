package tyranno;

import java.io.Serializable;

public class TyrannoDonae implements Serializable{
	public static final long serialVersionUID = 789456122L;
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
	public int setDonae(int donae) {
		return Donae = donae;
	}
	
	
}
