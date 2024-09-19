package threads;

class Counter {
    private int count = 0;


    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class CounterThread extends Thread {
    private Counter counter;


    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("The counter counts " + i);
            counter.increment();
            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SquareThread extends Thread {
    private Counter counter;

    public SquareThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("The square of the number " + i + " is " + (i * i));
            counter.increment();
            try {
                Thread.sleep(10); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class ThreadsEx2 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter(); 
        
        CounterThread counterThread = new CounterThread();
        SquareThread squareThread = new SquareThread(counter);

        counterThread.start();
        squareThread.start();

        counterThread.join();
        squareThread.join();
        

        System.out.println("The execution completed");
        System.out.println("Final count: " + counter.getCount());
    }
}
