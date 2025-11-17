
public class SynchronizedBlockExample {
    private final Object lock = new Object();
    private int count = 0;

    public void increment() {
        synchronized (lock) {
            count++;
        }
    }
    public int getCount() {
        System.out.println("Blocco sincronizzato");
        return count;
    }
    public void run(){
        int i = 0;
        while ( i<5000){
            i++;
            System.out.println(i);
        }
    }
}