import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Main {

    protected static List<Card> deal(Deck deck, Integer amount) {
        return IntStream.range(0, amount)
                .mapToObj(i -> deck.dealOneCard())
                .filter(cardOptional -> cardOptional.isPresent())
                .map(cardOptional -> cardOptional.get()).collect(Collectors.toList());
    }



    public static void main(String[] args) {
//        Deck deck = Deck.newDeck();
//        deck.shuffle();
//
//        List<Card> hand1 = deal(deck, 5);
//        List<Card> hand2 = deal(deck, 5);
//        List<Card> hand3 = deal(deck, 5);
//        List<Card> rest = deal(deck, 37);
//
//        System.out.println("Ręka 1 gracza:");
//        hand1.forEach(card -> System.out.println(card.getLabel()));
//        System.out.println();
//
//        System.out.println("Ręka 2 gracza:");
//        hand2.forEach(card -> System.out.println(card.getLabel()));
//        System.out.println();
//
//        System.out.println("Ręka 3 gracza:");
//        hand3.forEach(card -> System.out.println(card.getLabel()));
//        System.out.println();
//
//        System.out.println("Pozostałe karty:");
//        rest.forEach(card -> System.out.println(card.getLabel()));
        Deck anotherdeck = Deck.newDeck();
        List<Card> wszystkiekarty = deal(anotherdeck, 52);
        wszystkiekarty.forEach(card -> System.out.println(card.getLabel()));

    }
}