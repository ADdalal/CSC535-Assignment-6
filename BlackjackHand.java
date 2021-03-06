
//A subclass of the Hand class that returns the value
//of the hand for the game of Blackjack. 
public class BlackjackHand extends Hand 
{

   public int getBlackjackValue() 
   {      
       int val;      // The value computed for the hand.
       boolean ace;  // This will be set to true if the hand contains an ace.
       int cards;    // Number of cards in the hand.
       val = 0;
       ace = false;
       cards = getCardCount();

       for ( int i = 0;  i < cards;  i++ ) 
         {
           // Add the value of the i card in the hand.
           Card card;    // The i card; 
           int cardVal;  // The blackjack value of the i card.
           card = getCard(i);
           cardVal = card.getValue();  // The normal value, 1 to 13.
           if (cardVal > 10) 
              {
               cardVal = 10;   // For a Jack, Queen, or King.
              }
           if (cardVal == 1  || cardVal == 11)
              {
               ace = true;     // There is at least one ace.
              }
           val = val + cardVal;
         }

           // Now, val is the value of the hand, counting any ace as 1 or 11.
           // If there is an ace, and if changing its value from 1 to 
           // 11 would leave the score less than or equal to 21,
           // then do so by adding the extra 10 points to val. 

        if ( ace == true  &&  val + 10 <= 21 )
            val = val + 10;

        return val;

   }  // end getBlackjackValue()

} // end class BlackjackHand
