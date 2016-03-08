

//Hand class represents a hand of cards.  


import java.util.Vector;

public class Hand
{
   private Vector hand;// The cards in the hand.
   
  //constructor
   public Hand()
   {
      hand = new Vector();
   }
   
   //this method Discard all the cards from the hand.
   public void clear()
   {
     
      hand.removeAllElements();
   }
   
   //this method Adds the card x to the hand( x should be non-null :If x is null, nothing is added to the hand)
   public void addCard(Card x) 
   {
      if (x != null)
         hand.addElement(x);
   }
   
   //this method removes the card if it is in the hand
   public void removeCard(Card x) 
   {
      hand.removeElement(x);
   }
   
   // If the specified position is a valid position in the hand then the card in that position is removed.
   public void removeCard(int position) 
   {
      if (position >= 0 && position < hand.size())
         hand.removeElementAt(position);
   }
   
   
   //this method Returns the number of cards in the hand.
   public int getCardCount() 
   {

      return hand.size();
   }
   
   
   //this method Gets the card from the hand in given position, where positions
   // are numbered starting from 0.  If the specified position is
   // not the position number of a card in the hand, then null
   // is returned.
   public Card getCard(int position) 
   {
          
      if (position >= 0 && position < hand.size())
         return (Card)hand.elementAt(position);
      else
         return null;
   }
   
   
   //this method Sorts the cards in the hand so that cards of the same suit are
   // grouped together, and within a suit the cards are sorted by value.
   public void sortBySuit() 
   {
         // 
      Vector newHand = new Vector();
      while (hand.size() > 0)
      {
         int pos = 0;  // Position of minimal card.
         Card c = (Card)hand.elementAt(0);  // Minimal card.
         for (int i = 1; i < hand.size(); i++) 
           {
            Card c1 = (Card)hand.elementAt(i);
            if ( c1.getSuit() < c.getSuit() || (c1.getSuit() == c.getSuit() && c1.getValue() < c.getValue()) ) 
               {
                pos = i;
                c = c1;
               }
           }
         hand.removeElementAt(pos);
         newHand.addElement(c);
      }
      hand = newHand;
   }
  
   //this method sorts the cards in the hand so that cards of the same value are
   // grouped together.  Cards with the same value are sorted by suit.
   public void sortByValue() 
   {
      Vector newHand = new Vector();
      while (hand.size() > 0) 
      {
         int pos = 0;  // Position of minimal card.
         Card c = (Card)hand.elementAt(0);  // Minimal card.
         for (int i = 1; i < hand.size(); i++) 
            {
            Card c1 = (Card)hand.elementAt(i);
            if ( c1.getValue() < c.getValue() || (c1.getValue() == c.getValue()  &&  c1.getSuit() < c.getSuit()) )
               {
                pos = i;
                c = c1;
               }
            }
         hand.removeElementAt(pos);
         newHand.addElement(c);
      }
      hand = newHand;
   }
   
}