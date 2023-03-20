package ca.sheridancollege.project;

public class Card {

    Card() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  public enum color {
        RED, BLACK
    }

    public enum rank {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, Jack, Queen, King
    }
    
    private final color color;
    private final rank rank;

    public Card(color color, rank rank) {
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

  

