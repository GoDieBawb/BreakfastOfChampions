/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakfastofchampions;

import java.util.HashSet;

/**
 *
 * @author MeanC
 */
public class Player {
    
    private HashSet<String> inventory;
   
    public Player() {
        inventory = new HashSet<>();
    }
    
    public HashSet<String> getInventory() {
        return inventory;
    }
    
}
