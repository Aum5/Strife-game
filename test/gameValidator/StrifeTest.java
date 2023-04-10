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
public void testAddPlayers() {
    List<Player> players = Arrays.asList(new Player("Vyom"), new Player("Aum"));
    Round round = new Round(players, new Deck());
    assertEquals(round.getPlayers().size(), 2);
    players.forEach(player -> System.out.println(player.getName()));
    }
}