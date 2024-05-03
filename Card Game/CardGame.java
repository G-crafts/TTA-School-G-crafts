//katelynn.graham@malad.us
//Katelynn Graham
// Software and Programming Development 11A
//Cards Project inherited class and Deck class
//December 1, 2023 - December 7, 2023
// Mr Gross
import java.util.ArrayList;
import java.util.List;


public class CardGame extends Card {  
    public static viod main(String[] args) {
//create the cards

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

    // let's make the deck and shuffle the cards
    {
//Creating the deck
    Deck deck = new Deck();
    // to shuffle the new deck
    deck.shuffle();
    }
    {
    //create a new dealer
    Dealer dealer = new Dealer ();
    }
    {
        //Let's create 5 players
        Player mom = new Player ("Mom");
        Player dad = new Player ("Dad");
        Player me = new Player ("Me");
        Player brother = new Player ("Brother");
        Player sister = new Player ("Sister");

        //Let's deal out 6 cards to each player
        dealer.dealCards(brother, 6);
        dealer.dealCards(sister, 6);
        dealer.dealCards(mom, 6);
        dealer.dealCards(dad, 6);
        dealer.dealCards(me, 6);

        //Print out each card in each person's hand
        System.out.println(sister.getName() + "'s hand:" + sister.getHand());
        System.out.println(brother.getName() + "'s hand:" + brother.getHand());
        System.out.println(mom.getName() + "'s hand:" + mom.getHand());
        System.out.println(dad.getName() + "'s hand:" + dad.getHand());
        System.out.println(me.getName() + "'s hand:" + me.getHand());

        //Determine the winner based on the total value of their hand and print them out 
        Player winner = determineWinner(sister, brother, mom, dad, me){
        System.out.println("Winner: " + winner.getName());}
       }
        // Method that determines the winner based on their hand value
        private static Player determineWinner(List<Player> mom, dad, sister, brother,me) {
        Player winner = players.get (0);
        int maxTotalValue = calculateTotalValue(players.get(0));

        for (int i = 1; i < players.length; i++) {
            int totalValue = calculateTotalValue(players[i]);
            if (totalValue > maxTotalValue) {
            maxTotalValue = totalValue;
            winner = players[i];
             }
            }
            return winner;
        }
}