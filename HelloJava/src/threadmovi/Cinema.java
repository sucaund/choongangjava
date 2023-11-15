package threadmovi;


import java.util.List;

public class Cinema {

	private List<Room> roomlist;

	public Cinema() {
	
	}

	public Cinema(List<Room> roomlist) {
		super();
		this.roomlist = roomlist;
	}

	public List<Room> getRoomlist() {
		return roomlist;
	}

	public void setRoomlist(List<Room> roomlist) {
		this.roomlist = roomlist;
	}

	@Override
	public String toString() {
		return "Cinema [roomlist=" + roomlist + "]";
	}

	
	
}
