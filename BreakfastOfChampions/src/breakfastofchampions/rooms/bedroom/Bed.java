/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakfastofchampions.rooms.bedroom;

import breakfastofchampions.Interactable;
import breakfastofchampions.Player;

/**
 *
 * @author MeanC
 */
public class Bed extends Interactable {
    
    public Bed(String name) {
        super(name);
    }
    
    @Override
    public void getLooked(Player player) {
        System.out.println("This is your bed. It's where you sleep.");
    }
    
    @Override
    public void getGrabbed(Player player) {
        System.out.println("The bed is too big to take!");
    }

    @Override
    public void getUsed(Player player) {
        System.out.println("You don't want to go back to sleep. It's breakfast time.");
    }    
    
    @Override
    public boolean getSpecialed(Player player, String in) {
        if (in.contains("make")) {
            System.out.println("Fuck making your bed. It's breakfast time.");
            return true;
        }
        return false;
    }        
    
}
