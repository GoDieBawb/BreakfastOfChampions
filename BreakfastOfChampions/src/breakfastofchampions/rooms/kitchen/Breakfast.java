/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakfastofchampions.rooms.kitchen;

import breakfastofchampions.Interactable;
import breakfastofchampions.Player;

/**
 *
 * @author MeanC
 */
public class Breakfast extends Interactable {

    public Breakfast(String name) {
        super(name);
    }
    
    @Override
    public void getLooked(Player player) {
        System.out.println("Your breakfast looks great. Scrambled eggs, sausage and bacon.");
    }

    @Override
    public void getGrabbed(Player player) {
        System.out.println("The breakfast feels nice and greasy in your hands.");
    }

    @Override
    public void getUsed(Player player) {
        System.out.println("What do you use breakfast for?");
    }

    @Override
    public boolean getSpecialed(Player player, String in) {
        if (in.contains("eat")) {
            System.out.println("You eat the breakfast! Your life is now complete. You take the knife "
            + "and slowly cut your wrists. As you fade into the darkness you know you've felt true happiness. ");
            player.getInventory().add("breakfast");
        }
        return false;
    }
    
}
