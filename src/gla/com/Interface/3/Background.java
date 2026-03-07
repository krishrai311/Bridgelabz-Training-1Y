public class BackgroundJob {

    public static void main(String[] args) {

        Runnable task = () -> {
            System.out.println("Background task is running...");
        };
        Thread t = new Thread(task);
        t.start();
    }
}