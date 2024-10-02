public class Factorial {
    public static void main(String[] args) {

        // Pedir un número entero y calcular su factorial
        System.out.println("Dime un número entero para calcular su factorial:");
        int N = Integer.parseInt(System.console().readLine());
        int f = 1;
        
        // Realizamos un bucle para calcular el factorial
        for (int i = 1; i <= N; i++) {
            f *= i;
        }

        System.out.println("El factorial de " + N + " es: " + f);
    }
}