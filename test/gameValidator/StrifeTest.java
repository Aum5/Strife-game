/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameValidator;

import ca.sheridancollege.project.*;
import java.util.*;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author srinivsi
 */
public class StrifeTest 
{
    
    public StrifeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class PasswordValidator.
     */
    /*@Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PasswordValidator.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test if 2 players are created
     */
    
    @Test
    public void testCheckRoundNumberGood() {
    Game game = new Game();
    boolean result = game.checkRoundNumber(5);
    boolean expResult = true;
    System.out.println("checkRoundNumberGood");
    assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckRoundNumberBad() {
    Game game = new Game();
    boolean result = game.checkRoundNumber(-1); 
    boolean expResult = false;
    System.out.println("checkRoundNumberBad");
    assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckRoundNumberBoundry() {
    Game game = new Game();
    boolean result = game.checkRoundNumber(1);
    boolean result2 = game.checkRoundNumber(10);
    boolean expResult = true;
    System.out.println("checkRoundNumberBad");
    assertEquals(expResult, result);
    assertEquals(expResult, result2);
    }
    
    @Test
    public void testValidCardChoiceGood() {
    Round player = new Round("Vyom");
    player.addCardToHand(new Card("Black", "Ace", 14));
    player.addCardToHand(new Card("Red", "King", 13));
    player.addCardToHand(new Card("Black", "Queen", 12));
    player.addCardToHand(new Card("Red", "Two", 2));
    player.addCardToHand(new Card("Black", "Three", 3));
    
    boolean validChoice = player.isValidChoice(2, player.getHand().size());
    
    boolean expResult = true;
    System.out.println("TestValidCard Good");
    assertEquals(expResult, validChoice);
}
    
    @Test
    public void testValidCardChoiceBad() {
    Round player = new Round("Vyom");
    player.addCardToHand(new Card("Black", "Ace", 14));
    player.addCardToHand(new Card("Red", "King", 13));
    player.addCardToHand(new Card("Black", "Queen", 12));
    player.addCardToHand(new Card("Red", "Two", 2));
    player.addCardToHand(new Card("Black", "Three", 3));
    
    boolean validChoice = player.isValidChoice(10, player.getHand().size());

    boolean expResult = false;
    System.out.println("TestValidCardBad");
    assertEquals(expResult, validChoice);
    }
    
    @Test
    public void testValidCardChoiceBoundry() {
    Round player = new Round("Vyom");
    player.addCardToHand(new Card("Black", "Ace", 14));
    player.addCardToHand(new Card("Red", "King", 13));
    player.addCardToHand(new Card("Black", "Queen", 12));
    player.addCardToHand(new Card("Red", "Two", 2));
    player.addCardToHand(new Card("Black", "Three", 3));
    
    boolean validChoice1 = player.isValidChoice(1, player.getHand().size());
    boolean validChoice2 = player.isValidChoice(5, player.getHand().size());
    
    boolean expResult = true;
    System.out.println("TestValidCardBoundry");
    assertEquals(expResult, validChoice1);
    assertEquals(expResult, validChoice2);
    }
   
    @Test
    public void testAddPlayersGood() {
    List<Player> players = new ArrayList<>();
    Round player1 = new Round("Vyom");
    Round player2 = new Round("Aum");
    players.add(player1);
    
    boolean isUnique = players.stream().noneMatch(p -> p.getName().equals(player2.getName()));
    
    boolean expResult = true;
    System.out.println("TestAddPlayersGood");
    assertEquals(expResult, isUnique);
    }

    
    @Test
    public void testAddPlayersBad() {
    List<Player> players = new ArrayList<>();
    Round player1 = new Round("Vyom");
    Round player2 = new Round("Vyom");
    players.add(player1);
    
    boolean isUnique = players.stream().noneMatch(p -> p.getName().equals(player2.getName()));
    
    boolean expResult = false;
    System.out.println("TestAddPlayersGood");
    assertEquals(expResult, isUnique);
    }
    
    @Test
    public void testAddPlayersBoundry() {
    List<Player> players = new ArrayList<>();
    Round player1 = new Round("Vyom");
    Round player2 = new Round("Vyom1");
    players.add(player1);
    
    boolean isUnique = players.stream().noneMatch(p -> p.getName().equals(player2.getName()));
    
    boolean expResult = true;
    System.out.println("TestAddPlayersGood");
    assertEquals(expResult, isUnique);
    }    
}
