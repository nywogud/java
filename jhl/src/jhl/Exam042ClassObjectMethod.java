package jhl;

class Card{
	String kindString;
	int number;

	Card(){
		this("SPACE", 1);
	}

	Card(String kindString, int number){
		this.kindString = kindString;
		this.number = number;
	}

	public String toString() {
		return "kind : " + kindString +", number : " + number; 
	}



	//	public boolean equals(Object obj) {
	//		if (!(obj instanceof Card)) return false;
	//		Card c = (Card) obj;
	//		return this.kindString.equals(c.kindString) 
	//				&& this.number == c.number;
	//	}
	//	
	//	public int hashcode() {
	//		return Objects.hash(number, kindString);
	//	}
	//	
	//}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kindString == null) ? 0 : kindString.hashCode());
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (kindString == null) {
			if (other.kindString != null)
				return false;
		} else if (!kindString.equals(other.kindString))
			return false;
		if (number != other.number)
			return false;
		return true;
	}



	public static class Exam042ClassObjectMethod {

		public static void main(String[] args) {
			Card card1 = new Card();
			Card card2 = new Card("Diamond", 10);

			System.out.println(card1.toString());
			System.out.println(card1.toString());

			System.out.println(card2.kindString);
			System.out.println(card2.number);

			System.out.println(card1.equals(card2));
			System.out.println(card1.hashCode());


		}
	}
}
