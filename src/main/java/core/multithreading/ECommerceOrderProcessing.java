package core.multithreading;

import java.util.concurrent.*;

public class ECommerceOrderProcessing {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        CompletableFuture<Void> orderProcessingFlow = CompletableFuture
                .runAsync(() -> {
                    simulateDelay(1000);
                    System.out.println("✅ Order validated");
                    // throw new RuntimeException("Order validation failed"); // Uncomment to simulate failure
                }, executor)
                .thenRunAsync(() -> {
                    simulateDelay(1500);
                    System.out.println("💰 Payment processed");
                    // throw new RuntimeException("Payment failed"); // Uncomment to simulate failure
                }, executor)
                .thenRunAsync(() -> {
                    simulateDelay(1200);
                    System.out.println("📦 Inventory updated");
                    // throw new RuntimeException("Inventory update failed"); // Uncomment to simulate failure
                }, executor)
                .thenRunAsync(() -> {
                    simulateDelay(500);
                    System.out.println("📧 Confirmation email sent");
                }, executor);

        try {
            orderProcessingFlow.join();
            System.out.println("🚀 Order successfully processed!");
        } catch (CompletionException e) {
            System.out.println("🛑 Order processing aborted due to error: " + e.getCause().getMessage());
        }

        executor.shutdown();
    }

    private static void simulateDelay(int millis) {
        try { Thread.sleep(millis); } catch (InterruptedException e) { e.printStackTrace(); }
    }
}
