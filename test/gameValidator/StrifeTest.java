/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameValidator;

import ca.sheridancollege.project.*;
import ca.sheridancollege.project.Deck.Rank;
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
        assertTrue(game.checkRoundNumber(5));
        boolean expResult = true;
        System.out.println(expResult + "checkRoundNumber Good");
    }
    
    @Test
    public void testCheckRoundNumberBad() {
        Game game = new Game();
        assertFalse(game.checkRoundNumber(-1));
        boolean expResult = false;
        System.out.println(expResult + "checkRoundNumber Bad");
    }
    
    @Test
    public void testCheckRoundNumberBoundry() {
        Game game = new Game();
        assertTrue(game.checkRoundNumber(1));
        assertTrue(game.checkRoundNumber(10));
        boolean expResult = true;
        System.out.println(expResult + "checkRoundNumber Bad");
    }
    
    @Test
    public void testValidCardChoiceGood() {
        Player player = new Player("Vyom");
        player.addCardToHand(new Card(Deck.Color.BLACK, Rank.ACE));
        player.addCardToHand(new Card(Deck.Color.RED, Rank.KING));
        player.addCardToHand(new Card(Deck.Color.BLACK, Rank.QUEEN));
        player.addCardToHand(new Card(Deck.Color.RED, Rank.TWO));
        player.addCardToHand(new Card(Deck.Color.BLACK, Rank.THREE));
        
        boolean validChoice = player.isValidChoice(2, player.getHand().size());
        
        boolean expResult = true;
        System.out.println(expResult + "TestValidCard Good: " + validChoice);
    }
    
        @Test
    public void testValidCardChoiceBad() {
        Player player = new Player("Vyom");
        player.addCardToHand(new Card(color.black, Rank.ACE));
        player.addCardToHand(new Card(Deck.Color.RED, Rank.KING));
        player.addCardToHand(new Card(Deck.Color.BLACK, Rank.QUEEN));
        player.addCardToHand(new Card(Deck.Color.RED, Rank.TWO));
        player.addCardToHand(new Card(Deck.Color.BLACK, Rank.THREE));
        
        boolean validChoice = player.isValidChoice(10, player.getHand().size());

        boolean expResult = false;
        System.out.println(expResult + "TestValidCard Bad: " + validChoice);
    }
    
        @Test
    public void testValidCardChoiceBoundry() {
        Player player = new Player("Vyom");
        player.addCardToHand(new Card(Deck.Color.BLACK, Rank.ACE));
        player.addCardToHand(new Card(Deck.Color.RED, Rank.KING));
        player.addCardToHand(new Card(Deck.Color.BLACK, Rank.QUEEN));
        player.addCardToHand(new Card(Deck.Color.RED, Rank.TWO));
        player.addCardToHand(new Card(Deck.Color.BLACK, Rank.THREE));

        boolean validChoice1 = player.isValidChoice(1, player.getHand().size());
        boolean validChoice5 = player.isValidChoice(5, player.getHand().size());  
        
        boolean expResult = true;
        System.out.println(expResult + "TestValidCard Boundry: " + "1." + validChoice1 + " 5." + validChoice5);
    }
    
    @Test
    public void testIsUniqueNameForUniqueInput() {
        Game game = new Game();
        assertTrue(game.isUniqueName("Player1"));
    }
    
    @Test
    public void testIsUniqueNameForNonUniqueInput() {
        Game game = new Game();
        Player player1 = new Player("Player1");
        Player player2 = new Player("Player1");
        assertFalse(game.isUniqueName("Player1"));
    }
    
    @Test
    public void testAddPlayersWhenPlayerListIsEmpty() {
        Game game = new Game();
        game.addPlayers();
        assertEquals(game.players.size(), 2);
    }
}
