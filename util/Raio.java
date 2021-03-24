package util;

public class Raio {
    private static final double PI = 3.14159;
    public double raio;

    public double circunferencia(){
       return 2*raio*PI;
    }
    public double volume(){
        return 4*(Math.pow(raio, 3))*PI/3.0;
    }

    public String toSting(){
        return "\n"
        + "Valor do raio: "
        + raio
        + "\nCircunferencia: "
        + String.format("%.2f\n", circunferencia())
        + "Volume da esfera: "
        + String.format("%.2f\n", volume())
        + "Valor de PI: "
        + String.format("%.2f\n", PI);
    }
}
