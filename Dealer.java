//katelynn.graham@malad.us
//Card Project Continued
//Dealer class
//December 7, 2023
//Software and Programming dev
//Mr Gross

import java.util.ArrayList;

public class Dealer {
    //creating the parameters for the class
    static Deck deckInUse;
    static int player1Score=0;
    static int player2Score=0;
    static int player3Score=0;
    static int player4Score=0;
    static int player5Score=0;

//creating the deck and all 5 players
public static void main (String[] args){
    //new deck
    deckInUse=new Deck();
    //making the 5 players
    ArrayList player1=new ArrayList<>();
    ArrayList player2=new ArrayList<>();
    ArrayList player3=new ArrayList<>();
    ArrayList player4=new ArrayList<>();
    ArrayList player5=new ArrayList<>();
    //shuffle the new deck
    deckInUse.DeckShuffle();
    //deal the next card to player 1
    for (int x=0;x<6;x++){
        if (deckInUse.isNextCard){
            player1.add(deckInUse.dealNextCard());
        }

  //deal the next card to player 2

        if (deckInUse.isNextCard()){
            player2.add(deckInUse.dealNextCard());
        }

    //deal the next card to player 3


        if (deckInUse.isNextCard()){
            player3.add(deckInUse.dealNextCard());
        }

    //deal the next card to player 4


        if (deckInUse.isNextCard()){
            player4.add(deckInUse.dealNextCard());
        }

    //deal the next card to player 5


        if (deckInUse.isNextCard()){
            player5.add(deckInUse.dealNextCard());
        }
    }
        //print out player 1's hand and get the value of their cards

        System.out.println("player1's hand is");
        for (int x=0; x<6;x++){
            System.out.println(player1.get(x));
            player1Score=player1Score+player1.get(x).getCardValue();
            
        }

        //print out player 2's hand and get the value of their cards


         System.out.println("player2's hand is");
        for (int x=0; x<6;x++){
            System.out.println(player2.get(x));
            player2Score=player2Score+player2.get(x).getCardValue();
            
        }

        //print out player 3's hand and get the value of their cards

         System.out.println("player3's hand is");
        for (int x=0; x<6;x++){
            System.out.println(player3.get(x));
            player3Score=player3Score+player3.get(x).getCardValue();
            
        }

        //print out player 4's hand and get the value of their cards

         System.out.println("player4's hand is");
        for (int x=0; x<6;x++){
            System.out.println(player4.get(x));
            player4Score=player4Score+player4.get(x).getCardValue();
            
        }

        //print out player 5's hand and get the value of their cards

         System.out.println("player5's hand is");
        for (int x=0; x<6;x++){
            System.out.println(player5.get(x));
            player5Score=player5Score+player5.get(x).getCardValue();
            
        }


    //If player1's score is greater than players 2-5 score, player1 beats players 2-5

    if (player1Score>player2Score){
    System.out.println("Player1 beats Player2");
    if (player1Score>player3Score){
        System.out.println("Player1 beats Player3");
    if (player1Score>player4Score){
        System.out.println("Player1 beats Player4");
    if (player1Score>player5Score){
        System.out.println("Player1 beats Player5");

        //If player2's score is greater than players 3-5 score, player2 beats players 3-5
    if (player2Score>player3Score){
        System.out.println("Player2 beats Player3");
    if (player2Score>player4Score){
        System.out.println("Player2 beats Player4");
    if (player2Score>player5Score){
        System.out.println("Player2 beats Player5");

        //If player3's score is greater than players 4-5 score, player3 beats players 4-5

    if (player3Score>player4Score){
        System.out.println("Player3 beats Player4");
    if (player3Score>player5Score){
        System.out.println("Player3 beats Player5");

    //If player4's score is greater than players 5 score, player4 beats players 5

    if (player4Score>player5Score){
        System.out.println("Player4 beats Player5");


    }
    }
    }
    }
    }
}
}
}
    }
}
}
}