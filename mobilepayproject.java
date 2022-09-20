package mobilepayproject;
import java.util.*;
public class mobilepayproject {
	public static void main(String args[]) {
//String [] users = {};
//String] password 
	int balance =0, request, send;
	
	Scanner scan = new Scanner(System.in);
	
	while(true) {
		// user options 
	System.out.println("____Mobile Pay____");
	System.out.println("Press 1 to Request");
	System.out.println("Press 2 to Send");
	System.out.println("Press 3 to Check Balance");
	System.out.println("Press 4 to EXIT");
	
	
	int option = scan.nextInt();
	switch(option) {
	
	case 1:
	System.out.println("Enter Amount:$ ");
	request = scan.nextInt();
	balance = balance + request;
	System.out.println("You have received $"+request);
	System.out.println("");
	break;
	case 2:
		System.out.println("Enter Amount:$");	
		send = scan.nextInt();
		if(balance>=send) {
			balance=balance-send;
			System.out.println("You have sent $"+send);
		}
			else {
		
			System.out.println("ERROR! Insufficient Balance");		
			}
	System.out.println("");
	break;
	case 3:
		System.out.println("Balance:$" +balance);
		System.out.println("");
		break;
	
	case 4:
		System.exit(0);
	}
	
	
}
	}
	
}
	


	
