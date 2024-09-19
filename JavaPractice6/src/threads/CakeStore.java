package threads;

public class CakeStore extends Thread { 
	public  void run() 
	{ 
		System.out.println( 
			"cake design selected: "
			+ Thread.currentThread().getName()); 
		
		
			System.out.println( 
				"cake baked: "
				+ Thread.currentThread().getName());
			
				System.out.println( 
					"cake served: "
					+ Thread.currentThread().getName());
			
		
	
	
	}

	public static void main(String[] args) { 
	 for (int i = 0; i<4;i++) {
		 CakeStore t1 = new CakeStore(); 
			t1.start();
	 }
	} 
}
