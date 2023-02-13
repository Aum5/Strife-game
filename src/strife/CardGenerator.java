package strife;

public class CardGenerator {
  public enum color {
        RED, BLACK
    }

    public enum rank {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, Jack, Queen, King
    }
    
    private final color color;
    private final rank rank;

    public CardGenerator(color color, rank rank) {
        this.color = color;
        this.rank = rank;
    }

    public rank getrank() {
        return this.rank;
    }

    public color getColor() {
        return this.color;
    }
}

  

