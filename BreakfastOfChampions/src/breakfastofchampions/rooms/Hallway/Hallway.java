/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakfastofchampions.rooms.Hallway;

import breakfastofchampions.Player;
import breakfastofchampions.rooms.Room;
import breakfastofchampions.rooms.bedroom.Bedroom;
import breakfastofchampions.rooms.kitchen.Kitchen;

/**
 *
 * @author MeanC
 */
public class Hallway extends Room {
    
    public Hallway(String Name) {
        super(Name);
        interactables.add(new Picture("Picture"));
    }
    
    @Override
    public void makeExits() {
        exits.put("north", new Bedroom("Bedroom"));
        exits.put("east", new Kitchen("Kitchen"));
    }    
    
    @Override
    public void describe(Player player) {
        System.out.println("This is the hallway. A picture sits on the wall. Your bedroom door "
        + "is to the north. The Kitchen is to the East.");
    }
    
}
