//katelynn.graham@malad.us
//Card Project Continued
//Dealer class
//December 7, 2023
//Software and Programming dev
//Mr Gross

public class Dealer {
    private Deck deck;

    public Dealer (){
        this.deck = new Deck();
        this.deck.shuffle();
    }
    //Method to dealing the cards to players
    public void dealCards(Player player, int num cards) {
        for (int i = 0 ; i < num cards; i++){
            Card dealtCard = deck.dealCard();
            if (dealtCard != null) {
                player.recieveCard(dealtCard);
            } else {
                System.out.println("Deck is gone");
            }
        }
    }
}
