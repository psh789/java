package test03;

public class MovieTicket {
	public String movieTitle;
	public String screenTime;
	public String seatNumber;
	public boolean isBooked;


	public MovieTicket(String movieTitle, String screenTime, String seatNumber) {
		this.movieTitle = movieTitle;
		this.screenTime = screenTime;
		this.seatNumber = seatNumber;
		this.isBooked = false;	
	}

	public void bookTicket() {
		if(isBooked==true)
		{
			System.out.println("이미 예매됨");
		} else {

			System.out.println(movieTitle + ", " + screenTime + ", " + seatNumber + " 예매완료");
			isBooked = true;
		}			
	}

	public void cancelBooking() {
		if(isBooked==false) {
			System.out.println("아직 예매 안됨");
		}else {

			System.out.println(movieTitle + ", " + screenTime + ", " + seatNumber + " 취소 완료");
			isBooked = false;
		}
	}


	public void printTicketInfo() {
		System.out.println("영화제목 : " + movieTitle);
		System.out.println("상영시간 : " + screenTime);
		System.out.println("좌석번호 : " + seatNumber);
		if(isBooked == false) {
			System.out.println("예매여부 : No");

		}else {
			System.out.println("예매여부 : Yes");
		}
	}
}
