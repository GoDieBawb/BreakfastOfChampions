/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakfastofchampions.rooms;

import breakfastofchampions.Interactable;
import breakfastofchampions.Player;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author MeanC
 */
public abstract class Room {
    
    private   String name;
    protected HashMap<String, Room> exits;
    protected HashSet<Interactable> interactables;
    
    
    public Room(String name) {
        this.name     = name;
        interactables = new HashSet<>();
        exits         = new HashMap<>();
    }
    
    public abstract void describe(Player player);
    public abstract void makeExits();
    
    public String getName() {
        return name;
    }
    
    public HashSet<Interactable> getInteractables() {
        return interactables;
    }
    
    public boolean lookCheck(Player player, String in) {
        for (Interactable i : interactables) {
            if (in.contains(i.getName().toLowerCase())) {
                i.getLooked(player);
                return true;
            }
        }
        return false;
    }
    
    public boolean grabCheck(Player player, String in) {
        for (Interactable i : interactables) {
            if (in.contains(i.getName().toLowerCase())) {
                i.getGrabbed(player);
                return true;
            }
        }        
        return false;
    }

    public boolean useCheck(Player player, String in) {
        for (Interactable i : interactables) {
            if (in.contains(i.getName().toLowerCase())) {
                i.getUsed(player);
                return true;
            }
        }        
        return false;
    }    
   
    public boolean specialCheck(Player player, String in) {
        for (Interactable i : interactables) {
            if (in.contains(i.getName().toLowerCase())) {
                if (i.getSpecialed(player, in))
                    return true;
            }
        }        
        return false;
    }      
    
    public Room exit(String in) {
        for (String s : exits.keySet()) {
            if (in.contains(s)) {
                return exits.get(s);
            }
        }
        return null;
    }
    
}
