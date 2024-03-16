import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        initializeDeck();
    }

    private void initializeDeck() {
        String[] suits = {"tréboles", "corazones", "picas", "diamantes"};
        String[] colors = {"negro", "rojo"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

        for (String suit : suits) {
            for (String color : colors) {
                for (String value : values) {
                    cards.add(new Card(suit, color, value));
                }
            }
        }
    }
    public void shuffle() {
        Collections.shuffle(cards);
        System.out.println("Se mezcló el Deck.");
    }
    public void head() {
        Card card = cards.removeFirst();
        System.out.println(card);
        System.out.println("Quedan " + cards.size() + " cartas en deck");
    }
    public void pick() {
        int index = (int) (Math.random() * cards.size());
        Card card = cards.remove(index);
        System.out.println(card);
        System.out.println("Quedan " + cards.size() + " cartas en deck");
    }
    public List<Card> hand() {
        List<Card> hand = new ArrayList<>();
        System.out.println("Se repartieron las siguientes cartas:");
        for (int i = 0; i < 5; i++) {
            Card card = cards.removeFirst();
            hand.add(card);
            System.out.println(card);
        }
        System.out.println("Quedan " + cards.size() + " cartas en deck");
        return hand;
    }
}