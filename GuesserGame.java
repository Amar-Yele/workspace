import java.util.*;


//create class for Guessing Number
class Guesser{
//	here guesser will guess the Number so we have to take Number from the Guesser
	int GuessNum;
	
	int GuessNum()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value which have to Guess by Guesser: ");
		GuessNum = scan.nextInt();
		return GuessNum;
	
	}
}

//Now Create class for Players to Guess the Number 
class Players{
	
//	here also we have to define the Integer and take inputs from the various Players
	int Player;
	
	int Player() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of Player: ");
		Player = scan.nextInt();
		
//		System.out.println("Enter the value of Player2: ");
//		int player2 = scan.nextInt();
//		System.out.println("Enter the value of Player3: ");
//		int player3 = scan.nextInt();

		return Player;
	}
}

//now create class for the UMPIRE;

class Umpire{
	
//	Here we have to collect number from the Players and Guesser
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
//	NOW Collect the number from the Guesser and Player 
	void collectNumFromGuesser(){
		Guesser g= new Guesser();
		numFromGuesser = g.GuessNum();
	}
	
	void collectNumFromPlayers(){
		Players p1 = new Players();
		Players p2 = new Players();
		Players p3 = new Players();
		numFromPlayer1 = p1.Player();
		numFromPlayer2 = p2.Player();
		numFromPlayer3 = p3.Player();
		
	}
	
	void Compare(){
		if(numFromGuesser==numFromPlayer1) {
			
			if(numFromGuesser==numFromPlayer2 && numFromGuesser == numFromPlayer3) 
			{
				System.out.println("All Players Won The Match");
			}
			
			else if(numFromGuesser==numFromPlayer2) 
			{
				System.out.println("Player 1 and Player 2 are Won The Match");
			}
			else if(numFromGuesser==numFromPlayer3) 
			{
				System.out.println("Player 1 and Player 3 are Won The Match");
			}
			
			else {
			System.out.println("Player 1 Won the Match");
			}
		}
		
		else if(numFromGuesser == numFromPlayer2) {
			
			if(numFromGuesser==numFromPlayer3) 
			{
				System.out.println("Player 2 and Player 3 are Won The Match");
			}
			else 
			{
			System.out.println("Player 2 Won the Match");
			}
		}
		
		else if(numFromGuesser == numFromPlayer3) 
		{
			System.out.println("Player 3 Won the Match");
		}

		else {
			System.out.println("You Lost The Game!\nTry again Later!");
		}
}
	
}

public class GuesserGame {

	public static void main(String[] args) {
	
//		For Running the Game we have to call Class Umpire so we will call it
		
		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		System.out.println("\nWINNER is HERE");
		u.Compare();
		
	}
}
