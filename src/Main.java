package Final.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[]args){

        FullTimeTeacher ftTeacher1 = new FullTimeTeacher("Juan Andrés Gonzalez",300,4);
        FullTimeTeacher ftTeacher2 = new FullTimeTeacher("Luisa Castro",3200,10);
        PartTimeTeacher ptTeacher1 = new PartTimeTeacher("WestCol",140,20);
        PartTimeTeacher ptTeacher2 = new PartTimeTeacher("La Liendra",180,15);
        Student student1 = new Student("Tomás","ID001",20);
        Student student2 = new Student("Miguel","ID002",21);
        Student student3 = new Student("Fernado","ID003",22);
        Student student4 = new Student("Suly","ID004",23);
        Student student5 = new Student("Romeo","ID005",24);
        Student student6 = new Student("Paul","ID006",25);
        List<Student> students1 = new ArrayList<>();
        List<Student> students2 = new ArrayList<>();
        List<Student> students3 = new ArrayList<>();
        List<Student> students4 = new ArrayList<>();
        students1.add(student1);
        students1.add(student2);
        students2.add(student3);
        students2.add(student4);
        students3.add(student5);
        students3.add(student6);
        students4.add(student2);
        students4.add(student4);
        Class class1 = new Class("Math","32-101",students1,ftTeacher1);
        Class class2 = new Class("English","33-101",students2,ftTeacher2);
        Class class3 = new Class("Cience","35-101",students3,ptTeacher1);
        Class class4 = new Class("Religion","32-201",students4,ptTeacher2);


        System.out.println("Welcome to the university menu!");
        System.out.println("1.) Teachers data \n2.) Classes data \n3.) Create a new student \n4.) Create new Class \n5.) Search classes by ID \n6.) Exit");
        Scanner scan = new Scanner(System.in);
        int option = 0;

        do{
            option = scan.nextInt();
            scan.nextLine();

            switch(option){
                case 1:
                    
            }


        }while(option != 6);





    }
}
