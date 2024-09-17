package TypeCasting;

public class ExplicitConversion {

    public static void main(String[] args) {
        float floatValue = 300.99f; 
        byte byteValue = (byte) floatValue; 
// Conversion from float to int then from int to byte
        System.out.println("Original float value: " + floatValue); 
        System.out.println("Casted byte value: " + byteValue); 
    }
}
