public class CardDeck {
    public static void main(String[] args) {
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suit = {"S", "D", "H", "C"};

        String[] deck = new String[52];

        //Put all the cards in the deck, all the combos
        for(int j = 0; j < suit.length; j++){
            for(int i = 0; i < rank.length; i ++){
                deck[i + 13*j] = rank[i] + suit[j];
                //Fills out all the cards of a suit, 0 -12,
                // then for suit 1, 13 - 25
                // suit 2, 26 - 38
                // suit 3 , 39 - 51          
            }
        }

        for (int i = 0; i < deck.length; i++) {
            System.out.println(deck[i]);
        }
    }
    
}
