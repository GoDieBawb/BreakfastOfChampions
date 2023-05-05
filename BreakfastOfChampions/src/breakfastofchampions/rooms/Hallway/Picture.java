/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakfastofchampions.rooms.Hallway;

import breakfastofchampions.Interactable;
import breakfastofchampions.Player;

/**
 *
 * @author MeanC
 */
public class Picture extends Interactable {

    public Picture(String name) {
        super(name);
    }
    
    @Override
    public void getLooked(Player player) {
        System.out.println("It's a picture of your family.");
    }

    @Override
    public void getGrabbed(Player player) {
        System.out.println("You can't eat a picture. You want some breakfast.");
    }

    @Override
    public void getUsed(Player player) {
        System.out.println("You can't use a picture.");
    }

    @Override
    public boolean getSpecialed(Player player, String in) {
        return false;
    }
    
}
