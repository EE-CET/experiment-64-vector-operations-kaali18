import java.util.Scanner;
import java.util.Vector;

public class VectorOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<String> students = new Vector<>();
        
        while (scanner.hasNextInt()) {
            int choice = scanner.nextInt();
            
            if (choice == 5) {
                break;
            }
            
            switch (choice) {
                case 1:
                    if (scanner.hasNext()) {
                        String name = scanner.next();
                        students.add(name);
                        System.out.println("Added");
                    }
                    break;
                    
                case 2:
                    if (scanner.hasNext()) {
                        String name2 = scanner.next();
                        int index = scanner.nextInt();
                        if (index >= 1 && index <= students.size() + 1) {
                            students.add(index - 1, name2);
                            System.out.println("Inserted");
                        }
                    }
                    break;
                    
                case 3:
                    if (scanner.hasNext()) {
                        String name3 = scanner.next();
                        if (students.remove(name3)) {
                            System.out.println("Removed");
                        }
                    }
                    break;
                    
                case 4:
                    System.out.println(students.toString());
                    break;
                    
                default:
                    System.out.println("Invalid choice");
            }
        }
        
        scanner.close();
    }
}
