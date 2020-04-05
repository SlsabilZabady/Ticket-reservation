//import java.text.*;
//import java.time.LocalDate;
//import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
		//create an instance of Admin and Event holder.
		eventHolder exhHolder = new eventHolder("Ali", 567);
		Admin exhAdmin = new Admin("Sara", 678);
		
		eventHolder musHolder = new eventHolder("Ahmed", 400);
		Admin musAdmin = new Admin("nada", 668);
		
		eventHolder sprHolder = new eventHolder("Omar", 500);
		Admin sprAdmin = new Admin("Mahmoud", 660);
		
		//create an events.
		Event exhibition = new Exhibition("ANALYTECH 2020", "2020-04-15", "Lutfi Kirdar Center", 4, 50, exhHolder,exhAdmin);
		System.out.println();

		Event music = new Music ("TAMER 2020","2020-05-20","Riyadh stadium",30,100,musHolder,musAdmin);
		System.out.println();

		PerformedArt performArt = new PerformedArt("art gallery 2020", "2020-04-15", "Lutfi Kirdar Center", 4, 50, exhHolder,exhAdmin);
		System.out.println();

		Event sport = new Sport ("World Cup 2022","2022-03-20","stadium",30,100,sprHolder,sprAdmin);
		System.out.println();
		System.out.println("*****************************************************************");

		//create a register user.
		registered buyer = new registered("Noor", 898);
		registered buyerr = new registered("mohammed",1000);
		
		// user buy tickets 
		exhibition.buy(buyer, 4);
		System.out.println();
		System.out.println("*****************************************************************");
		
		// user trying to return ticket do not belong to him/her.
		exhibition.returnTicket(buyerr,4);
		System.out.println();
		System.out.println("*****************************************************************");

		// user reserve tickets 
		music.reserveTickets(buyerr, 5);
		System.out.println();
		System.out.println("*****************************************************************");
		
		//Admin trying to add event already there.
		exhHolder.addEvent(exhibition);
		System.out.println();
		System.out.println("*****************************************************************");

		// Event holder modify the event place and notify users. 
		exhHolder.modifyPlace(exhibition, "Ankara");
		System.out.println();
		System.out.println("*****************************************************************");

		//display the daily report.
		exhAdmin.dailyReport();
		System.out.println();
		System.out.println("*****************************************************************");

		//user try to buy 5 tickets for perform Art.
		performArt.buy(buyerr, 5);
		System.out.println();
		System.out.println("*****************************************************************");

		//user try to reserve spesific seat for perform Art.
		performArt.reserveSeat(buyer,3);
		System.out.println();
		System.out.println("*****************************************************************");

		//user try to buy spesific seat for perform Art.
		performArt.buySeat(buyerr, 4);
		System.out.println();
		System.out.println("*****************************************************************");

		// another user try to choose already taken.
		performArt.reserveSeat(buyerr, 3);
		System.out.println();
		System.out.println("*****************************************************************");

		//user cancle the reservtion for perform Art.
		performArt.cancelSeat(buyer, 3);
		System.out.println();
		System.out.println("*****************************************************************");

		//another user try to reserve spesific seat for perform Art.
		performArt.reserveSeat(buyerr, 3);
		System.out.println();
		System.out.println("*****************************************************************");

		//Admin reject Sport Event
		sprAdmin.rejectEvents(sport);
		System.out.println();
		System.out.println("*****************************************************************");

		//user try to reserve tickets for sport event after it rejected by Admin
		sport.reserveTickets(buyer, 2);
		System.out.println();
		System.out.println("*****************************************************************");
		//user try to reserve tickets for exhibition
		exhibition.reserveTickets(buyer, 1);
		System.out.println();
		System.out.println("*****************************************************************");

		//user try to cancel tickets reservation for exhibition
		exhibition.cancelTickets(buyer, 1);
		System.out.println();
		System.out.println("*****************************************************************");


	}
	
	
}
