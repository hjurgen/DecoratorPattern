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
public class DecoratorPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Barber barber = new Haircut();
        System.out.println(barber.getDescription() + " $" + barber.cost());
        
        Barber barber2= new Haircut();
        barber2 = new hairTreatment(barber2);
        barber2 = new BeardTrim(barber2);
        barber2 = new FaceMask(barber2);
        System.out.println(barber2.getDescription() + " $" + barber2.cost());

    }
    
}
