//katelynn.graham@malad.us
//Katelynn Graham
// Software and Programming Development 11A
//Cards Project inherited class and Deck class
//December 1, 2023

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Deck{
    
    //Let's inherit the card descriptions to be able to put them into the deck
   ArrayList cardsInDeck;
   int nextCard;
   int totalNumberOfCardsInDeck=52;

   public Deck (){
    cardsInDeck = new ArrayList <Card>();

    
//create the cards

    Card cardInfo1 = new Card(0,"Spades","Ace", 13);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Spades","King", 12);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Spades","Queen", 11);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Spades","Jack", 10);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Spades","10", 9);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Spades","9", 8);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Spades","8", 7);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Spades","7", 6);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Spades","6", 5);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Spades","5", 4);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Spades","4", 3);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Spades","3", 2);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Spades","2", 1);
    cardsInDeck.add (cardInfo1);

    cardInfo1 = new Card(0,"Hearts","Ace", 13);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Hearts","King", 12);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Hearts","Queen", 11);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Hearts","Jack", 10);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Hearts","10", 9);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Hearts","9", 8);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Hearts","8", 7);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Hearts","7", 6);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Hearts","6", 5);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Hearts","5", 4);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Hearts","4", 3);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Hearts","3", 2);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Hearts","2", 1);
    cardsInDeck.add (cardInfo1);

    cardInfo1 = new Card(0,"Diamonds","Ace", 13);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Diamonds","King", 12);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Diamonds","Queen", 11);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Diamonds","Jack", 10);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Diamonds","10", 9);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Diamonds","9", 8);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Diamonds","8", 7);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Diamonds","7", 6);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Diamonds","6", 5);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Diamonds","5", 4);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Diamonds","4", 3);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Diamonds","3", 2);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Diamonds","2", 1);
    cardsInDeck.add (cardInfo1);

    cardInfo1 = new Card(0,"Clubs","Ace", 13);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Clubs","King", 12);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Clubd","Queen", 11);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Clubs","Jack", 10);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Clubs","10", 9);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Clubs","9", 8);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Clubs","8", 7);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Clubs","7", 6);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Clubs","6", 5);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Clubs","5", 4);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Clubs","4", 3);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Clubs","3", 2);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Clubs","2", 1);
    cardsInDeck.add (cardInfo1);
    nextCard=0;
}
public void DeckShuffle(){
    Collections.shuffle(cardsInDeck);
    nextCard=0;
}
public Card dealNextCard(){
return cardsInDeck.get(nextCard++);
}
public boolean isNextCard(){
    if (nextCard<=cardsInDeck.size()) {
        return true;
    }
    return false;
    }
}