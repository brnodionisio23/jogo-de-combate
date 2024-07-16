package application;

public class Imc {
    public static double imc(double altura, double peso) {
        return peso / (Math.pow(altura, 2));
    }
}
