public class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        System.out.println("Stampa");
        return count;

    }
}