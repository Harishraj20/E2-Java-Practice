public class IfElseIf {

    public void categorizeEmployee(int experience, String domain) {
        String category;
        String projectName;

        if (experience < 3) {
        	
            if (domain == "Tester") {
            	
                category = "Junior Tester";
                projectName = "Project A";
                
            } else if (domain == "Developer") {
            	
                category = "Junior Developer";
                projectName = "Project B";
                
            } else {
            	
                category = "Junior Level";
                projectName = "Project Unknown";
                
            }
        } else if (experience >= 3 && experience < 5) {
            if (domain == "Tester") {
            	
                category = "Mid Level Tester";
                projectName = "Project C";
                
            } else if (domain == "Developer") {
            	
                category = "Mid Level Developer";
                projectName = "Project D";
                
            } else {
            	
                category = "Mid Level";
                projectName = "Project Unknown";
            }
        } else if (experience >= 5 && experience < 10) {
            if (domain == "Tester") {
            	
                category = "Senior Tester";
                projectName = "Project E";
                
            } else if (domain == "Developer") {
            	
                category = "Senior Developer";
                projectName = "Project F";
                
            } else {
            	
                category = "Senior Level";
                projectName = "Project G";
                
            }
        } else {
            if (domain == "Tester") {
            	
                category = "project - Tester - Lead";
                projectName = "Project G";
                
            } else if (domain == "Developer") {
            	
                category = "Project - Development - Lead";
                projectName = "Project H";
            } else {
                category = "Lead Level";
                projectName = "Internal Project";
            }
        }

        System.out.println(domain+" with " + experience + " years of experience is categorized as " + category);
        System.out.println("He is assigned to project: " + projectName);
    }

    public static void main(String[] args) {
        IfElseIf categorizer = new IfElseIf();

        categorizer.categorizeEmployee(2, "Tester");
        categorizer.categorizeEmployee(4, "Developer");
        categorizer.categorizeEmployee(6, "Tester");
        categorizer.categorizeEmployee(10, "Developer");
        categorizer.categorizeEmployee(7, "Manager"); 
    }
}
