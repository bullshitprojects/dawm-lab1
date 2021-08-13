package Ejercicio2;
/**
 *
 * @author cesar
 */
public class clsArea implements Area {

    @Override
    public double getAreaCirculo(double radio) {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    @Override
    public double getAreaRectangulo(double base, double altura) {
        double area = base * altura;
        return area;
    }
}
