package tyranno;

import java.io.Serializable;

public class TyrannoIn implements Serializable {
	public static final long serialVersionUID = 789456123L;
	private String name;
	private int maxmoney;
	private int money;
	private String detail;
	
	public TyrannoIn() {
		// TODO 자동 생성된 생성자 스텁
	}
	
	
	public TyrannoIn(String name, int maxmoney, int money, String detail) {
		super();
		this.name = name;
		this.maxmoney = maxmoney;
		this.money = money;
		this.detail = detail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxmoney() {
		return maxmoney;
	}

	public void setMaxmoney(int maxmoney) {
		this.maxmoney = maxmoney;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}


	
}
