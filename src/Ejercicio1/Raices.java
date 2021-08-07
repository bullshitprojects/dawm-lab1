
package Ejercicio1;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Raices{
    public ArrayList raiz (double a , double b, double c){
        ArrayList x = new ArrayList<Double>();
        DecimalFormat df = new DecimalFormat("#.00");
        double x1 = (-b +(Math.sqrt((Math.pow(b, 2)-(4*a*c)))))/(2*a);
        x.add(df.format(x1));
        double x2 = (-b -(Math.sqrt((Math.pow(b, 2)-(4*a*c)))))/(2*a);
        x.add(df.format(x2));
        return x;
    }
    
    public boolean Prueba(double a , double b, double c){
        double discriminate = Math.pow(b, 2)-(4*a*c); 
        if (discriminate >= 0 ) {
            return true;
        }
        else{
            return false;
        } 
    }   
}
