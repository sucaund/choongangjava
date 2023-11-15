package threadmovi;

public class CinemaPerson {

	private String name;
	private Seat resevationseat;
	
	public CinemaPerson() {

	}

	public CinemaPerson(String name, Seat resevationseat) {
		super();
		this.name = name;
		this.resevationseat = resevationseat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Seat isResevationseat() {
		return resevationseat;
	}

	public void setResevationseat(Seat resevationseat) {
		this.resevationseat = resevationseat;
	}

	@Override
	public String toString() {
		return "CinemaPerson [name=" + name + ", resevationseat=" + resevationseat + "]";
	}
	
	
}