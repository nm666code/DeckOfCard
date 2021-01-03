// Fig. 7.11: DeckOfCardsTest.java
// Card shuffling and dealing.

public class DeckOfCardsTest {
   // execute application
   public static void main(String[] args) {
	  DeckOfCards myDeckOfCards = new DeckOfCards();
      myDeckOfCards.shuffle(); // place Cards in random order
      
	  Player player1 = new Player(myDeckOfCards);
	  Player player2 = new Player(myDeckOfCards);
	  
	  System.out.print("Player1's card: ");
	  for(int i = 0; i < 5; i++)
	  System.out.printf("%-19s", player1.getOnHand());
      System.out.println(" sum:" + player1.getsum());
      
	  System.out.print("Player2's card: ");
	  for(int i = 0; i < 5; i++)
	  System.out.printf("%-19s", player2.getOnHand());
      System.out.println(" sum:" + player2.getsum());
      
      if(player1.getsum()>player2.getsum())
      System.out.println("Player1 win" );
      else if(player2.getsum()>player1.getsum())
      System.out.println("Player2 win" );
      else
      System.out.println("Tie" );	  
   } 
} 



/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
