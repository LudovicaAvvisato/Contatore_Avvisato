public class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        System.out.println("Blocco non sincronizzato");
        return count;

    }

    public int run(){
        int i = 0;
        while ( i<5000){
        i++;
        //System.out.println(i);
        return i;
     }
    }
}