import java.util.EnumSet;
import java.util.Optional;

public enum SuitType {
    HEARTS("kier"),
    DIAMONDS("karo"),
    CLUBS("trefl"),
    SPADES("pik");

    private final String suit;

    SuitType(final String suit){
        this.suit = suit;
    }

    public static Optional<SuitType> fromString(final String findSuit) {
        return EnumSet.allOf(SuitType.class).stream()
                .filter(s -> s.toString().equalsIgnoreCase(findSuit)).findFirst();
    }

    @Override
    public String toString() {
        return this.suit;
    }
}