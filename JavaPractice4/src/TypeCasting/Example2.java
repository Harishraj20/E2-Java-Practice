package TypeCasting;

class Dress {
    protected void look() {
        System.out.println("Dress looks more elegant");    
    }
}

class Shirt extends Dress {
    @Override
    protected void look() {
        System.out.println("Shirt looks fit and elegant for men");    
    }
}

class Saree extends Dress {
    @Override
    protected void look() {
        System.out.println("Saree looks fit and elegant for women");    
    }
}

public class Example2 {
    public static void main(String[] args) {
        Dress d1 = new Shirt();
        d1.look(); 
        }
 
}

