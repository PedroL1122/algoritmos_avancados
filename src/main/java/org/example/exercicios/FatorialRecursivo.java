package org.example.exercicios;

// Declaração da classe FatorialRecursivo
public class FatorialRecursivo {
    public static void main(String[] args) {
        int numero1 = 3;
        int numero2 = 7;

        long resultado1 = calcularFatorial(numero1);
        long resultado2 = calcularFatorial(numero2);

        System.out.println("Fatorial de " + numero1 + " é: " + resultado1);

        System.out.println("Fatorial de " + numero2 + " é: " + resultado2);
    }

    public static long calcularFatorial(int n) {
        // Condição de parada da recursão: se n for menor que 0, retorna uma mensagem de erro
        if (n < 0) {
            throw new IllegalArgumentException("Número não pode ser negativo.");
        }

        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Chamada recursiva para calcular o fatorial de (n - 1) e multiplicar pelo valor de n
            return n * calcularFatorial(n - 1);
        }
    }
}
