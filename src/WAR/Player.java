package WAR;

import java.util.ArrayList;

public class Player {
	private ArrayList<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;
	public Player(String name) {
		this.name = name;
	    this.score = 0;
	    this.hand = new ArrayList<Card>();
	  }
	public void describe() {
		System.out.println("Player name: " + name);
		System.out.println(name + "'s score is " + score);
		for (Card card : hand) {
			card.describe();
		}
	}
	public Card flip() {
		Card cardToDraw = hand.get(0);
		hand.remove(0);
		return cardToDraw;
	}
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	public void incrementScore() {
		score += 1;
	}
    public int getScore() {
		return score;
    }
}