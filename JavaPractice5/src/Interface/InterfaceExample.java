package Interface;

interface playable{
	void play();
}

class FootBall implements playable{

	@Override
	public void play() {
		System.out.println("Athelet playes Football");
	}
	
}
class VolleyBall implements playable{

	@Override
	public void play() {
		System.out.println("Athelet playes VolleyBall");
		
	}
	
}
class BasketBall implements playable{

	@Override
	public void play() {
		System.out.println("Athelet playes BasketBall");
	}
	
}

public class InterfaceExample {
	public static void main(String[] args) {
		BasketBall b1 = new BasketBall();
		VolleyBall b2 = new VolleyBall();
		FootBall b3 = new FootBall();
		b1.play();
		b2.play();
		b3.play();
	}

}
