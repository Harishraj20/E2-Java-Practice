package threads;


public class RunnableInterface implements Runnable { 
   
    public void run() { 
        System.out.println("Cake design selected: " + Thread.currentThread().getName()); 
        
        System.out.println("Cake baked: " + Thread.currentThread().getName());
        
        System.out.println("Cake served: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) { 
        for (int i = 0; i < 4; i++) {
        
            CakeStore cakeTask = new CakeStore();
            Thread thread = new Thread(cakeTask);
            
            thread.start();
        }
    } 
}
