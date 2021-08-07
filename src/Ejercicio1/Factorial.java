
package Ejercicio1;

public class Factorial extends cCalculadora {
    public double Factorial (double n1){
        double factorial=1;
        for (int i = 1; i < n1+1; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
