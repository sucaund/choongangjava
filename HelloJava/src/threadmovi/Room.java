package threadmovi;

import java.util.List;

public class Room {

	private String Roomname;
	private List<Seat> seatlist;
	
	public Room() {
		// TODO Auto-generated constructor stub
	}

	public Room(String roomname, List<Seat> seatlist) {
		super();
		Roomname = roomname;
		this.seatlist = seatlist;
	}

	public String getRoomname() {
		return Roomname;
	}

	public void setRoomname(String roomname) {
		Roomname = roomname;
	}

	public List<Seat> getSeatlist() {
		return seatlist;
	}

	public void setSeatlist(List<Seat> seatlist) {
		this.seatlist = seatlist;
	}

	@Override
	public String toString() {
		return "Room [Roomname=" + Roomname + ", seatlist=" + seatlist + "]";
	}
	
	
	

}
