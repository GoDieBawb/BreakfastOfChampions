/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakfastofchampions.rooms.kitchen;

import breakfastofchampions.Player;
import breakfastofchampions.rooms.Hallway.Hallway;
import breakfastofchampions.rooms.Room;

/**
 *
 * @author MeanC
 */
public class Kitchen extends Room {

    public Kitchen(String name) {
        super(name);
        interactables.add(new Breakfast("Breakfast"));
    }
    
    @Override
    public void describe(Player player) {
        System.out.println("You are now in the kitchen. Your breakfast sits on the table. The hallway is to your West.");
    }

    @Override
    public void makeExits() {
        exits.put("west", new Hallway("Hallway"));
    }
    
}
