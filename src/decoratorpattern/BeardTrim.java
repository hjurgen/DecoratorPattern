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
public class BeardTrim extends HaircutDecorator{
    Barber barber;
    
    public BeardTrim(Barber barber){
        this.barber = barber;
    }
    
    public String getDescription(){
        return barber.getDescription() + "; Beard Trim";
    }
    
    public double cost(){
        return 4 + barber.cost();
    }
}
