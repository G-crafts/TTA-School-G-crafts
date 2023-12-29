//katelynn.graham@malad.us
//Katelynn Graham
//G-crafts
//Mr. Gross
//Cards Project Card Class
//Software and Programming Development 11A
//December 1, 2023

import java.util.List;


public class Card{
 
     
        //Create the class variables
        String cardType;
        int cardSuitNumber; //Total number of suits in the deck, 4 if a normal deck, but can be any number for a custom deck
        int cards;
        int cardsSuit; //Reference to suit of card: 1 = spade, 2 = hearts, 0 = clubs, 3 = diamonds
        String suitType; //String that names the suit type
        String typeofCard; // description of the card 2, queen, ace, king, jack, etc.
        int cardsDealt;
        int cardsDealtPerHand;
        int numberOfHands;
        int cardValue;
        
    //create the cards
    
    public Card (int cardsSuit, String suitType, String typeofCard, int cardValue) {
        //Setting the card suit
        this.cardsSuit=cardsSuit;
        //Sets the suit type
        this.suitType=suitType;
        //Sets the card type
       this.typeofCard=typeofCard;
       //Sets card value
       this.cardValue=cardValue;
    }
//using the to string method to type of suit and usign getters for suit type, type of card, and card value
public String toString(){
    String cardTraits;
    cardTraits = "This card is a "+typeofCard+" of "+suitType;
    return cardTraits;
        }
        public String gettypeofCard(){
            return typeofCard;
        }
        public String getSuitType(){
            return suitType;
        }
        public int getCardValue(){
            return cardValue;
        }
    }







//turned all of this old code into an example/comment


  /*   {
        Card cardInfo1 = new int cardSuitNumber [4];
        //how many suits there are
        Card cardInfo2 = new int cardsSuit [13];
        // how many cards are in a suit
        Card cardInfo3 = new suitType ("Spades");
        Card cardInfo3 = new suitType ("Clubs");
        Card cardInfo3 = new suitType ("Hearts");
        Card cardInfo3 = new suitType ("Diamonds");
        //the different suits
        Card cardInfo4 = new int cards [54];
        //number of cards in the deck
        Card cardInfo5 = new typeOfCard ("Ace of Spades");
        Card cardInfo5 = new typeOfCard ("King of Spades");
        Card cardInfo5 = new typeOfCard ("Queen of Spades");
        Card cardInfo5 = new typeOfCard ("Jack of Spades");
        Card cardInfo5 = new typeOfCard ("2 of Spades");
        Card cardInfo5 = new typeOfCard ("3 of Spades");
        Card cardInfo5 = new typeOfCard ("4 of Spades");
        Card cardInfo5 = new typeOfCard ("5 of Spades");
        Card cardInfo5 = new typeOfCard ("6 of Spades");
        Card cardInfo5 = new typeOfCard ("7 of Spades");
        Card cardInfo5 = new typeOfCard ("8 of Spades");
        Card cardInfo5 = new typeOfCard ("9 of Spades");
        Card cardInfo5 = new typeOfCard ("10 of Spades");
// the cards in the spades suit
        Card cardInfo5 = new typeOfCard ("Ace of Hearts");
        Card cardInfo5 = new typeOfCard ("King of Hearts");
        Card cardInfo5 = new typeOfCard ("Queen of Hearts");
        Card cardInfo5 = new typeOfCard ("Jack of Hearts");
        Card cardInfo5 = new typeOfCard ("2 of Hearts");
        Card cardInfo5 = new typeOfCard ("3 of Hearts");
        Card cardInfo5 = new typeOfCard ("4 of Hearts");
        Card cardInfo5 = new typeOfCard ("5 of Hearts");
        Card cardInfo5 = new typeOfCard ("6 of Hearts");
        Card cardInfo5 = new typeOfCard ("7 of Hearts");
        Card cardInfo5 = new typeOfCard ("8 of Hearts");
        Card cardInfo5 = new typeOfCard ("9 of Hearts");
        Card cardInfo5 = new typeOfCard ("10 of Hearts");
        // cards in the hearts suit
        Card cardInfo5 = new typeOfCard ("Ace of Diamonds");
        Card cardInfo5 = new typeOfCard ("King of Diamonds");
        Card cardInfo5 = new typeOfCard ("Queen of Diamonds");
        Card cardInfo5 = new typeOfCard ("Jack of Diamonds");
        Card cardInfo5 = new typeOfCard ("2 of Diamonds");
        Card cardInfo5 = new typeOfCard ("3 of Diamonds");
        Card cardInfo5 = new typeOfCard ("4 of Diamonds");
        Card cardInfo5 = new typeOfCard ("5 of Diamonds");
        Card cardInfo5 = new typeOfCard ("6 of Diamonds");
        Card cardInfo5 = new typeOfCard ("7 of Diamonds");
        Card cardInfo5 = new typeOfCard ("8 of Diamonds");
        Card cardInfo5 = new typeOfCard ("9 of Diamonds");
        Card cardInfo5 = new typeOfCard ("10 of Diamonds");
        // the cards in diamonds suit
        Card cardInfo5 = new typeOfCard ("Ace of Clubs");
        Card cardInfo5 = new typeOfCard ("King of Clubs");
        Card cardInfo5 = new typeOfCard ("Queen of Clubs");
        Card cardInfo5 = new typeOfCard ("Jack of Clubs");
        Card cardInfo5 = new typeOfCard ("2 of Clubs");
        Card cardInfo5 = new typeOfCard ("3 of Clubs");
        Card cardInfo5 = new typeOfCard ("4 of Clubs");
        Card cardInfo5 = new typeOfCard ("5 of Clubs");
        Card cardInfo5 = new typeOfCard ("6 of Clubs");
        Card cardInfo5 = new typeOfCard ("7 of Clubs");
        Card cardInfo5 = new typeOfCard ("8 of Clubs");
        Card cardInfo5 = new typeOfCard ("9 of Clubs");
        Card cardInfo5 = new typeOfCard ("10 of Clubs");
// cards in clubs suit
        Card cardInfo6 = new int cardsDealt [30];
        //cards dealt overall in all 5 hands
        Card cardInfo7 = new int cardsDealtPerHand [6];
        Card cartInfo8 = new int numberOfHands [5];
    }
        {
    //Now let's print each section out
    System.out.println (cardInfo1);
    System.out.println  (cardInfo2);
    System.out.print (cardInfo3);
    System.out.println (cardInfo4);
    System.out.print (cardInfo5);
    System.out.println (cardInfo6);
    System.out.println (cardInfo7);
    System.out.println (cardInfo8);
        }

}
 //Let's inherit the deck into another class to make it shuffle the different types of cards
 */