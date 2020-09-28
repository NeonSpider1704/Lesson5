
package student;

import java.util.Scanner;


public class StudentInterface {

    
    public static void main(String[] args) {
       Student stu1 = new Student();
       Student stu2 = new Student();
       Scanner scan = new Scanner(System.in);
       
       String name;
       int score;
       
       while (true){
        System.out.print("Enter name for first student (min 1 letter): ");
        name = scan.nextLine();
        stu1.setName(name);
        for(int i = 1; i <= 3; i++){
            System.out.format("Enter test score %d for %s> ", i, stu1.getName());
            score = scan.nextInt();
            stu1.setScore(i, score);
        }
        String errormsg = stu1.validateData();
        if (errormsg == null){
            break;
        } else {
            System.out.println(errormsg);
        }
       }
        scan.nextLine();
        System.out.println("\n---------------------------\n");
        
        System.out.print("Enter name for second student: ");
        name = scan.nextLine();
        stu2.setName(name);
        for (int i = 1; i <= 3; i++) {
            System.out.format("Enter test score %d for %s> ",i,stu2.getName());
            score = scan.nextInt();
            stu2.setScore(1, score);
        }
        
        
            
        
        
        System.out.println("\n---------------------------\n");
        System.out.println("stu1");
        System.out.println("stu2");
    }
    
}
