
public class SwitchCases {
	
	public static void main(String[] args) {  
		
		char grade = 'B';

    switch (grade) {
        case 'A':
            System.out.println("Excellent!");
            break;
        case 'B':
            System.out.println("Good!");
            break;
        case 'C':
            System.out.println("Fair!");
            break;
        case 'D':
            System.out.println("Needs Improvement!");
            break;
        case 'F':
            System.out.println("Failed!");
            break;
        default:
            System.out.println("Invalid Grade!");
    }
		
	}
	
}
