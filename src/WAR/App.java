package WAR;

public class App {
	public static void main(String[] args) {
		Deck MainDeck = new Deck();
		MainDeck.shuffle();
		Player Player1 = new Player("Player1");
		Player Player2 = new Player("Player2");
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				Player2.draw(MainDeck);
			}
			else {
				Player1.draw(MainDeck);
			}
		}
//		Joe.describe();
//		Daniel.describe();
		for (int i = 0; i < 26; i++) {
//			System.out.println("Round: " + (i + 1));
			Card Player1Card = Player1.flip();
			Card Player2Card = Player2.flip();
			if (Player1Card.getValue() > Player2Card.getValue()) {
				Player1.incrementScore();
//				System.out.println("Player1 point");
			}
			else if (Player1Card.getValue() < Player2Card.getValue()) {
				Player2.incrementScore();
//				System.out.println("Player2 point");
			}
			else {
//				System.out.println("Draw");
				continue;
			}
		}
		System.out.println("Player1's score is " + Player1.getScore() + ".");
		System.out.println("Player2's score is " + Player2.getScore() + ".");
		if (Player1.getScore() > Player2.getScore()) {
			System.out.println("Player1");
		}
		else if (Player1.getScore() < Player2.getScore()) {
			System.out.println("Player2");
		}
		else {
			System.out.println("Draw");
		}
	}
}