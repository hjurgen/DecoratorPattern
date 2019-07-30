/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpattern;

/**
 *
 * @author User
 */
public abstract class Barber {
    String description = "Unknown Haircut";
    
    public String getDescription(){
        return description;
    }
    
    public abstract double cost();
}
