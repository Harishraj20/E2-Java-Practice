package threads;

public class ThreadClass implements Runnable {
	  public static void main(String[] args) {
	    ThreadClass t = new ThreadClass();
	    Thread thread = new Thread(t);
	    thread.start();
	    System.out.println("Hello Bro!!");
	  }
	  public void run() {
	    System.out.println("Welcome");
	  }
	}