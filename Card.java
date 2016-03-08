
//Card class represents one of the 52 cards in a standard deck of playing cards.
//Each card has a suit and value.


public class Card 
{
	// Codes for the 4 suits
 public final static int SPADES = 0,HEARTS = 1, DIAMONDS = 2,CLUBS = 3;
                         
 public final static int ACE = 1,          // Codes for the non-numeric cards.
                         JACK = 11,        // Cards 2 through 10 have their numerical values for their codes. 
                         QUEEN = 12,       
                         KING = 13;
                         
 private final int suit;   // The suit of this card, one of the constants(SPADES, HEARTS, DIAMONDS, CLUBS.)
                           
 private final int value;  // The value of this card, from 1 to 11.
 
 
//Construct a card with the specified value and suit.
 public Card(int theValue, int theSuit) 
 {
     value = theValue;
     suit = theSuit;
 }
 
 
 //this method Returns the int that codes for this card's suit.
 public int getSuit() 
 {
     
     return suit;
 }
 
 
//this method Returns the int that codes for this card's value.
 public int getValue() 
 {
     
     return value;
 }
 
 //this method Returns a String representing the card's suit.(If the card's suit is invalid, "unKnown" is returned.)
 public String getSuitAsString() 
 {
         
     switch ( suit )
     {
        case SPADES:   return "Spades";
        case HEARTS:   return "Hearts";
        case DIAMONDS: return "Diamonds";
        case CLUBS:    return "Clubs";
        default:       return "unKnown";
     }
 }
 
 //this method Returns a String representing the card's value.If the card's value is invalid, "unKnown" is returned.
 public String getValueAsString()
 {
      if (value == 1)
    	  return "Ace";
      if (value == 2)
    	  return "2";
      if (value == 3)
    	  return "3";
      if (value == 4)
    	  return "4";
      if (value == 5)
    	  return "5";
      if (value == 6)
    	  return "6";
      if (value == 7)
    	  return "7";
      if (value == 8)
    	  return "8";
      if (value == 9)
    	  return "9";
      if (value == 10)
    	  return "10";
      if (value == 11)
    	  return "Jack";
      if (value == 12)
    	  return "Queen";
      if (value == 13)
    	  return "King";
      else
    	  return "unKnown";  
 }
 
 
 //this method Returns a String representation of this card, such "10 of Hearts" or "Queen of Spades". 
 public String toString() 
 { 
     return getValueAsString() + " of " + getSuitAsString();
 }

} // end class Card
