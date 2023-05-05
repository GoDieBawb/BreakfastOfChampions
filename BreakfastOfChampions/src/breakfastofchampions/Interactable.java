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
public abstract class Interactable {
    
    private   String name;
    
    public Interactable(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public abstract void getLooked(Player player);
    public abstract void getGrabbed(Player player);
    public abstract void getUsed(Player player);
    public abstract boolean getSpecialed(Player player, String in);
    
}
