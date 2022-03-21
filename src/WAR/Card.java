package WAR;

public class Card {
	  private int value;
	  private String name;
	  public Card(String name, int value) {
	    if (value > 14 || value < 2) {
	    	System.out.println("Please enter a value between 2-14.");
	    }
	    else {
		this.name = name;
	    this.value = value;
	    	}	
	  	}
	    public String getName() {
			return name;
	    }
		public void setName(String name) {
			this.name = name;
		}
		public int getValue() {
			return value;
		}
		public void setvalue(int value) {
			this.value = value;
		}
		public void describe() {
			System.out.println("Card name is: " + name + ".");
			System.out.println("Card value is: " + value + ".");
		}
}