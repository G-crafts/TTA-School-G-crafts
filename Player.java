//katelynn.graham@malad.us
//CardProjectContinued
//Player list
//December 7, 2023
//Software and Programming dev
//Mr Gross
import.util.ArrayList;
import.util.List;

//Class of the players
public class Player {

    
    private String name;
    private List<Card> hand;

// player with no cards and name
    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }
    //Getter for name
        public String getName(){
            return name;
        }
    //setting up the method that adds cards to players hands
        public void recieveCard(List<Card> cards) {
            hand.add (card);
        }
    //Getter for hand
    public List<Card> getHand(){
        return hand;
    }
}
