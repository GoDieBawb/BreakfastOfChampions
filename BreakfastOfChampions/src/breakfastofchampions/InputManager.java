/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakfastofchampions;

import java.util.Scanner;

/**
 *
 * @author MeanC
 */
public class InputManager {
    
    private Scanner s;
    
    public InputManager() {
        s = new Scanner(System.in);
    }
    
    public String getInput() {
        System.out.print("Enter a Command: ");
        return s.nextLine();
    }
    
}
