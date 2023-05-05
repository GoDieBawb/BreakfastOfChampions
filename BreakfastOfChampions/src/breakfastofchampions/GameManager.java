/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakfastofchampions;

import breakfastofchampions.rooms.Room;
import breakfastofchampions.rooms.bedroom.Bedroom;
import java.util.HashSet;

/**
 *
 * @author MeanC
 */
public class GameManager {
    
    private Player       player;
    private InputManager inputManager;
    private Room         currentRoom;
    
    public GameManager() {
        player = new Player();
        inputManager = new InputManager();
    }
    
    public void startGame() {
        
        currentRoom = new Bedroom("Bedroom");
        currentRoom.makeExits();
        
        System.out.println("You wake up. It's breakfast and you are hungry.");
        currentRoom.describe(player);
        while (true) {
            
            if (player.getInventory().contains("breakfast")) {
                System.out.println("Thanks for playing!");
                break;
            }
            
            String input = inputManager.getInput().toLowerCase();
            if (exitCheck(input)) break;
            else if (moveCheck(input)) {
                if (currentRoom.exit(input) != null ) {
                    currentRoom = currentRoom.exit(input);
                    currentRoom.describe(player);
                    currentRoom.makeExits();
                }
                else {
                    System.out.println("You can't go that way.");
                }
            }
            else if (grabCheck(input)) {
                if (!input.contains(" "))
                    System.out.println("Grab What?");
                else if (!currentRoom.grabCheck(player, input))
                    System.out.println("You can't grab that.");
            }
            else if (lookCheck(input)) {
                if (!input.contains(" "))
                    currentRoom.describe(player);
                else if(!currentRoom.lookCheck(player, input))
                    System.out.println("You don't see that.");
            }
            else if (useCheck(input)) {
                if (!input.contains(" "))
                    System.out.println("Use What?");                
                else if (!currentRoom.useCheck(player, input))
                    System.out.println("You can't use that.");
            }
            else if (currentRoom.specialCheck(player, input)) {
                //Do nothing let fall to unknown command
            }
            else {
                System.out.println("Unknown command.");
            }
        }
        System.out.println("Good Bye");
    }
    
    private boolean exitCheck(String in) {
        HashSet<String> exits = new HashSet<>();
        exits.add("exit");
        exits.add("quit");
        for (String s : exits) {
            if (in.contains(s)) {
                return true;
            }
        }
        return false; 
    }
    
    private boolean moveCheck(String in) {
        
        HashSet<String> moves = new HashSet<>();
        moves.add("move");
        moves.add("go");
        moves.add("walk");
        moves.add("run");
        
        for (String s : moves) {
            if (in.contains(s)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean grabCheck(String in) {
        
        HashSet<String> grabs = new HashSet<>();
        grabs.add("grab");
        grabs.add("take");
        grabs.add("get");
        grabs.add("pick up");
        
        for (String s : grabs) {
            if (in.contains(s)) {
                return true;
            }
        }
        return false;        
        
    }
    
    private boolean lookCheck(String in) {
        
        HashSet<String> looks = new HashSet<>();
        looks.add("look");
        looks.add("check");
        looks.add("examine");
        looks.add("search");
        
        for (String s : looks) {
            if (in.contains(s)) {
                return true;
            }
        }        
        return false;
        
    }
    
    private boolean useCheck(String in) {
        
        HashSet<String> uses = new HashSet<>();
        uses.add("use");
        
        for (String s : uses) {
            if (in.contains(s)) {
                return true;
            }
        }        
        return false;
        
    }
    
}
