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
public class FaceMask extends HaircutDecorator{
    Barber barber;
    
    public FaceMask(Barber barber){
        this.barber = barber;
    }
    
    public String getDescription(){
        return barber.getDescription() + "; Face Mask";
    }
    
    public double cost(){
        return 7 + barber.cost();
    }
}
