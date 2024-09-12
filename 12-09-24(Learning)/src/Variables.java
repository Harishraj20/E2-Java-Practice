public class Variables {

    String name = "John";  
    final int number = 100;
    
   
    public void displayLocalVariable() { 

        int myNum = 15;
        myNum = 20;
        System.out.println("Local Variable myNum: " + myNum);
    }
    
    public void ageSegregation(int age) {
     String text;
     if(age <= 10) {
    	 text = " a child";
     }else {
    	 text = "an Adult";
    	 }
     	System.out.println("Person with the age " + age + " is " + text);
     }
     

    public static void main(String[] args) {
    	
        Variables obj = new Variables();
        System.out.println("Instance Variable name: " + obj.name);

        System.out.println("Final Variable number : " + obj.number);

        obj.displayLocalVariable();

        String email = "abc@gmail.com";  // Local Variable
        email = "harish@gmail.com";  // Overwriting local variable
        System.out.println("Overwritten Local Variable email: " + email);
        
        
        
        
        
        obj.ageSegregation(10);
        obj.ageSegregation(45);
        
        
    }
}
