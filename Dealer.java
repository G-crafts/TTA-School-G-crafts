//katelynn.graham@malad.us
//Card Project Continued
//Dealer class
//December 7, 2023
//Software and Programming dev
//Mr Gross

import java.util.ArrayList;

public class Dealer {
    Deck deckInUse;
    int player1Score=0;
    int player2Score=0;
    int player3Score=0;
    int player4Score=0;
    int player5Score=0;

public static void main (String[] args){
    deckInUse=new Deck();
    ArrayList player1=new ArrayList<>();
    ArrayList player2=new ArrayList<>();
    ArrayList player3=new ArrayList<>();
    ArrayList player4=new ArrayList<>();
    ArrayList player5=new ArrayList<>();
    deckInUse.DeckShuffle();
    for (int x=0;x<6;x++){
        if (deckInUse.isNextCard){
            player1.add(deckInUse.dealNextCard());
        }
        if (deckInUse.isNextCard){
            player2.add(deckInUse.dealNextCard());
        }
        if (deckInUse.isNextCard){
            player3.add(deckInUse.dealNextCard());
        }
        if (deckInUse.isNextCard){
            player4.add(deckInUse.dealNextCard());
        }
        if (deckInUse.isNextCard){
            player5.add(deckInUse.dealNextCard());
        }
        System.out.println("player1's hand is");
        for (int x=0; x<6;x++){
            System.out.println(player1.get(x));
            player1Score=player1Score+player1.get(x).getCardValue();
            
        }
         System.out.println("player2's hand is");
        for (int x=0; x<6;x++){
            System.out.println(player2.get(x));
            player2Score=player2Score+player2.get(x).getCardValue();
            
        }
         System.out.println("player3's hand is");
        for (int x=0; x<6;x++){
            System.out.println(player3.get(x));
            player3Score=player3Score+player3.get(x).getCardValue();
            
        }
         System.out.println("player4's hand is");
        for (int x=0; x<6;x++){
            System.out.println(player4.get(x));
            player4Score=player4Score+player4.get(x).getCardValue();
            
        }
         System.out.println("player5's hand is");
        for (int x=0; x<6;x++){
            System.out.println(player5.get(x));
            player5Score=player5Score+player5.get(x).getCardValue();
            
        }

    }
    if (player1Score>player2Score){
    System.out.println("Player1 beats Player2");
}
}
}