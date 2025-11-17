public class Main{
public static void main(String[] args) {
    Counter counter = new Counter();

    // Create multiple threads to increment the counter
    Thread t1 = new Thread(() -> counter.increment());
    Thread t2 = new Thread(() -> counter.increment());
    SynchronizedBlockExample example = new SynchronizedBlockExample();

    // Create multiple threads to increment the counter
    Thread t3 = new Thread(() -> example.increment());
    Thread t4 = new Thread(() -> example.increment());

    t1.start();
    t2.start();

    try {
        t1.join();
        t2.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    System.out.println("Final count: " + counter.getCount());
        
    }
}