public class Main{
public static void main(String[] args) {
    Counter counter = new Counter();


    Thread t1 = new Thread(() -> counter.increment());

    SynchronizedBlockExample sincro = new SynchronizedBlockExample();


    Thread t2 = new Thread(() -> sincro.increment());


    t1.start();
    t2.start();

    try {
        t1.join();
        t2.join();

    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    System.out.println(counter.getCount());
    System.out.println(sincro.getCount());
    }
}
