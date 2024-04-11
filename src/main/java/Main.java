public class Main {
    //Punto 5
    public static void calcularEcuacionRecta(double x1, double y1, double x2, double y2) {

        double pendiente = (y2 - y1) / (x2 - x1);

        double terminoIndependiente = y1 - pendiente * x1;

        System.out.println("La ecuación de la recta es: Y = " + pendiente + " X + " + terminoIndependiente);
    }

    public static void main(String[] args) {
        // Ejemplo de puntos
        double x1 = 1.0;
        double y1 = 3.0;
        double x2 = 2.0;
        double y2 = -5.0;

        calcularEcuacionRecta(x1, y1, x2, y2);
    }
}
