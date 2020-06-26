package Cards;

public enum Suit {
    CLUBS("Clubs"), HEARTS("Hearts"), SPADES("Spades"), DIAMONDS("Diamonds");

    public final String label;

    private Suit(String label) {
        this.label = label;
    }
}