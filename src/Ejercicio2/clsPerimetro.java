package Ejercicio2;

/**
 *
 * @author cesar
 */
public class clsPerimetro implements Perimetro {

    @Override
    public double getPerimetroRectangulo(double base, double altura) {
        double perimetro = (2 * base) * (2 * altura);
        return perimetro;
    }

    @Override
    public double getPerimetroCirculo(double radio) {
        double perimetro = 2 * Math.PI * radio;
        return perimetro;
    }

}
