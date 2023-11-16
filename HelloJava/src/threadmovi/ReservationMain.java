package threadmovi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.management.relation.Role;

public class ReservationMain {
	
	public static final int ROOM_COUNT=5;
	public static final int SEAT_ROOM_PER_COUNT=25;
	public static final int CINEMAPERSON_COUNT=200;
	
	public static void main(String[] args) {
//		1.시트 생성
		List<Seat> seatList =new ArrayList<Seat>();
		for (int i=0; i<SEAT_ROOM_PER_COUNT*ROOM_COUNT;i++){
			seatList.add(new Seat(String.valueOf(i+1),false));
		}
		
		System.out.println(seatList);
		
//		2.룸 생성
		List<Room> roomlist=new ArrayList<Room>();
		for (int i=0;i<ROOM_COUNT;i++) {
			roomlist.add(new Room((i+1)+"관",
					seatList.subList(i*SEAT_ROOM_PER_COUNT,
							(i+1)*SEAT_ROOM_PER_COUNT)
						)
					);
		
		}
		System.out.println(roomlict);

		//3. 영화관 생성
		
		Cinema cinema =new Cinema(roomlist);		

		System.out.println(cinema);
		//		4.사람 생성
		List<CinemaPerson>cinemaPersonsList
			= new ArrayList<CinemaPerson>();
		for (int i = 0; i < CINEMAPERSON_COUNT; i++) {
			cinemaPersonsList.add(new CinemaPerson(("CP"+i+(i+1)),null));
		}
		
		System.out.println(cinemaPersonsList);
//		5. 예매 로직
		
//		6.출력 로직
		
	}

}
