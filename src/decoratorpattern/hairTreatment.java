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
public class hairTreatment extends HaircutDecorator{
    
    Barber barber;
    
    public hairTreatment(Barber barber){
        this.barber = barber;
    }
    
    public String getDescription(){
        return barber.getDescription() + "; Hair Treatment";
    }
    
    public double cost(){
        return 3 + barber.cost();
    }
    
}
