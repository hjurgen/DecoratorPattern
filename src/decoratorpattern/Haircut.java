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
public class Haircut extends Barber{
    
    public Haircut(){
        description = "Normal Haircut";
    }
    
    public double cost(){
        return 5;
    }
    
}
