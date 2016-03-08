
// this Deck class represents an ordinary deck of 52 playing cards.
//The deck can be shuffled, and cards can be dealt from the deck.


public class Deck 
{
    private Card[] deck;   // An array of 52 Cards, representing the deck.
    private int cardsUsed; // How many cards have been dealt from the deck.
    
    //Deck constructor 
    public Deck() 
    {
      // Create an un-shuffled deck of cards.
       deck = new Card[52];
       int cardCt = 0; //as initial number of cards
       for ( int suit = 0; suit <= 3; suit++ ) 
         {
          for ( int value = 1; value <= 13; value++ )
             {
             deck[cardCt] = new Card(value,suit);
             cardCt++;
             }
         }
       cardsUsed = 0;
    }
    
    
    //this method Put all the used cards back into the deck, and shuffle it into a random order.
    public void shuffle() 
    {
        for ( int i = 51; i > 0; i-- ) 
          {
            int rand = (int)(Math.random()*(i+1));
            Card temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
          }
        cardsUsed = 0;
    }
    
    //This method returns the number of cards that are still left in the deck.
    public int cardsLeft() 
    {
        return 52 - cardsUsed;
    }
    
    //this method Deals one card from the deck and returns it.
    public Card dealCard() 
    {
        if (cardsUsed == 52)
           shuffle();
        cardsUsed++;
        return deck[cardsUsed - 1];
    }

} // end class Deck