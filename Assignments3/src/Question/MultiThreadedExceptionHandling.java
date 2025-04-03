package Question;
public class MultiThreadedExceptionHandling {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Thread is running...");
            throw new RuntimeException("Intentional Exception");
        });

        
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("Exception caught from thread: " + t.getName());
                System.out.println("Exception message: " + e.getMessage());
                
            }
        });

        
        thread.start();
    }
}
