
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
        
        while(true){
        System.out.print("Enter name for second student: ");
        name = scan.nextLine();
        stu2.setName(name);
        for (int i = 1; i <= 3; i++) {
            System.out.format("Enter test score %d for %s> ",i,stu2.getName());
            score = scan.nextInt();
            stu2.setScore(1, score);
        }
        String errormsg = stu2.validateData();
        if (errormsg == null){
            break;
        } else {
            System.out.println(errormsg);
        }
        }
        
        
        if(stu1.getAverage()>stu2.getAverage()){
            System.out.format("%s has the highest average with %.2f",stu1.getName(),stu1.getAverage());
        }
        else{
            System.out.format("%s has the highest average with %.2f",stu2.getName(),stu2.getAverage());
        }
        
        if(stu1.getHighScore()>stu2.getHighScore()){
            System.out.format("%s has the highest score with %d",stu1.getName(),stu1.getHighScore());
        }
        else{
            System.out.format("%s has the highest score with %d",stu2.getName(),stu2.getHighScore());
        }
        
        
            
        
        
        System.out.println("\n---------------------------\n");
        System.out.println(stu1);
        System.out.println(stu2);
    }
    
}
