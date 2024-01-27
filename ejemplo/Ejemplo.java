package ejemplo;

public class Ejemplo {
    public static void main (String[] args){
        // Operadores aritmeticos
        int a = 20, b = 5;
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;
        int residuo = a % b;

        System.out.println("Operadores Aritmeticos: ");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
        System.out.println("Residuo: " + residuo);

        // Operadores relacionales
        System.out.println("\nOperadores Relacionales:");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // Operadores logicos
        boolean x = true, y = false;
        System.out.println("\nOperadores Logicos:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

    }
}
