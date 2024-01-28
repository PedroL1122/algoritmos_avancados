package org.example.exercicios;

// Declaração da classe FatorialPD
public class FatorialPD {
    public static void main(String[] args) {
        int numero1 = 3;
        int numero2 = 7;

        long resultado1 = calcularFatorialDinamicoRecursivo(numero1);
        long resultado2 = calcularFatorialDinamicoRecursivo(numero2);

        System.out.println("Fatorial de " + numero1 + " é: " + resultado1);
        System.out.println("Fatorial de " + numero2 + " é: " + resultado2);
    }

    public static long calcularFatorialDinamicoRecursivo(int n) {
        // Se n for menor que 0, aparece uma mensagem de erro
        if (n < 0) {
            throw new IllegalArgumentException("Número não pode ser negativo.");
        }

        long[] dp = new long[n + 1];
        dp[0] = 1;

        return calcularFatorialRecursivo(n, dp);
    }

    private static long calcularFatorialRecursivo(int n, long[] dp) {
        if (n == 0 || n == 1) {
            return dp[n];
        }

        if (dp[n] == 0) {
            dp[n] = n * calcularFatorialRecursivo(n - 1, dp);
        }

        return dp[n];
    }
}
