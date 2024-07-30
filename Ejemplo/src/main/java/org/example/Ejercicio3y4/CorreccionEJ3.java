package org.example.Ejercicio3y4;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CorreccionEJ3 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        SimulacionTarea simulador = new SimulacionTarea();


        CompletableFuture<Integer> tarea1 = CompletableFuture.supplyAsync(() -> simulador.simularTarea());
        CompletableFuture<Integer> tarea2 = CompletableFuture.supplyAsync(() -> simulador.simularTarea());
        CompletableFuture<Integer> tarea3 = CompletableFuture.supplyAsync(() -> simulador.simularTarea());
        CompletableFuture<Integer> tarea4 = CompletableFuture.supplyAsync(() -> simulador.simularTarea());

        // Espera a que terminen las cuatro tareas
        CompletableFuture<Void> tareas = CompletableFuture.allOf(tarea1, tarea2, tarea3, tarea4);

        // Uso un callback para obtener el resultado de las tareas
        CompletableFuture<Integer> result = tareas.thenApply(v -> {
            int result1 = tarea1.join();
            int result2 = tarea2.join();
            int result3 = tarea3.join();
            int result4 = tarea4.join();

            int suma = result1 + result2 + result3 + result4;

            System.out.println("Suma de los valores generados por las tareas: " + suma);
            return suma;
        });

        // Se asegura de que todas las tareas hayan terminado
        result.get();
    }
}