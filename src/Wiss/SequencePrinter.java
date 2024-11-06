package Wiss;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SequencePrinter {
    private static final int NUM_THREADS = 3;
    private static final int TOTAL_NUMBERS = 10; // adjust this to change the sequence length

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);

        for (int i = 0; i < NUM_THREADS; i++) {
            int threadId = i;
            executor.submit(() -> {
                int start = threadId;
                for (int j = start; j < TOTAL_NUMBERS; j += NUM_THREADS) {
                    System.out.println("Thread-" + threadId + ": " + (j + 1));
                }
            });
        }

        executor.shutdown();
    }
}