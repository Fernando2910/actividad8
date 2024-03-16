

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        System.out.println();

        deck.head();
        System.out.println();

        deck.pick();
        System.out.println();

        deck.hand();
        System.out.println();
    }
}