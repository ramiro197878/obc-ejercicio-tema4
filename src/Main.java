public class Main {
    public static void main(String[] args) {

        // Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        // Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
        System.out.println("----  Uso de IF - ELSE IF - ELSE ---");
        System.out.println(" ");

        int numeroIf = 0;

        if (numeroIf == 0) {
            System.out.println("El valor de numeroIf es 0");
        } else if (numeroIf < 0) {
            System.out.println("El valor de numeroIf es negativo");
        } else {
            System.out.println("El valor de numeroIf es positivo");
        }

        System.out.println(" ");
        System.out.println("-------------------------------------");
        System.out.println(" ");

        //Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
        //
        //Incrementar el valor de la variable en uno cada vez que se ejecute.
        //
        //Mostrarlo por pantalla cada vez que se ejecute.

        System.out.println("--- Uso de WHILE ---");
        System.out.println(" ");

        int numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println("El valor de numeroWhile es: " + numeroWhile);
            numeroWhile++;
        }

        System.out.println(" ");
        System.out.println("-------------------------------------");
        System.out.println(" ");

        // Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

        System.out.println("--- Uso de DO WHILE ---");
        System.out.println(" ");

        int numeroDoWhile = 0;

        do {
            System.out.println("El valor de numeroDoWhile es: " + numeroDoWhile);
            numeroDoWhile++;
        }
        while (numeroDoWhile < 3);

        System.out.println(" ");
        System.out.println("-------------------------------------");
        System.out.println(" ");

        // Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será
        // que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y
        // deberá mostrarse por pantalla.

        System.out.println("--- Uso de FOR ---");
        System.out.println(" ");

        int numeroFor = 0;

        for (; numeroFor <= 3; numeroFor++) {
            System.out.println("El valor de numeroFor es: " + numeroFor);
        }

        System.out.println(" ");
        System.out.println("-------------------------------------");
        System.out.println(" ");

        // Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones
        // del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando
        // de la estación en la que está. También habrá que poner un default para cuando el valor
        // de la variable no sea una estación.

        System.out.println("--- Uso de FOR ---");
        System.out.println(" ");

        String estacion = "PRIMAVERA";

        switch (estacion) {
            case "VERANO" -> System.out.println("ES VERANO");
            case "PRIMAVERA" -> System.out.println("ES PRIMAVERA");
            case "INVIERNO" -> System.out.println("ES INVIERNO");
            case "OTOÑO" -> System.out.println("ES OTOÑO");
            default -> System.out.println("NO ES UNA ESTACION VALIDA");
        }

    }

}