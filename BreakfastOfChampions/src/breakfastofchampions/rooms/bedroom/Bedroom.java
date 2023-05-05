/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakfastofchampions.rooms.bedroom;

import breakfastofchampions.Player;
import breakfastofchampions.rooms.Hallway.Hallway;
import breakfastofchampions.rooms.Room;

/**
 *
 * @author MeanC
 */
public class Bedroom extends Room {
    
    public Bedroom(String name) {
        super(name);
        interactables.add(new Bed("Bed"));
    }
    
    @Override
    public void makeExits() {
        exits.put("south", new Hallway("Hallway"));
    }
    
    @Override
    public void describe(Player player) {
        System.out.println("This is your bedroom. Your bed sits in the corner. The exit to the "
        + "hallway lies to the South.");
    }
    
}
