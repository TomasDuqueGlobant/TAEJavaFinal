package Final.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Final.src.University.*;

public class Main {


    public static void main(String[]args){

        FullTimeTeacher ftTeacher1 = new FullTimeTeacher("Juan Andrés Gonzalez",3000,4);
        FullTimeTeacher ftTeacher2 = new FullTimeTeacher("Luisa Castro",3200,10);
        PartTimeTeacher ptTeacher1 = new PartTimeTeacher("WestCol",1400,20);
        PartTimeTeacher ptTeacher2 = new PartTimeTeacher("La Liendra",1800,15);
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(ftTeacher1);
        teachers.add(ftTeacher2);
        teachers.add(ptTeacher1);
        teachers.add(ptTeacher2);
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
        List<Student> allStudents = new ArrayList<>();
        allStudents.add(student1);
        allStudents.add(student2);
        allStudents.add(student3);
        allStudents.add(student4);
        allStudents.add(student5);
        allStudents.add(student6);
        students1.add(student1);
        students1.add(student2);
        students2.add(student3);
        students2.add(student4);
        students3.add(student5);
        students3.add(student6);
        students4.add(student2);
        students4.add(student4);
        Class class1 = new Class("Math","32-101","ID1001",students1,ftTeacher1);
        Class class2 = new Class("English","33-101","ID1002",students2,ftTeacher2);
        Class class3 = new Class("Cience","35-101","ID1003",students3,ptTeacher1);
        Class class4 = new Class("Religion","32-201","ID1004",students4,ptTeacher2);
        List<Class> classes = new ArrayList<>();
        classes.add(class1);
        classes.add(class2);
        classes.add(class3);
        classes.add(class4);



        Scanner scan = new Scanner(System.in);
        int option = 0;

        do{
            System.out.println("Welcome to the university menu!");
            System.out.println("1.) Teachers data \n2.) Classes data \n3.) Create a new student \n4.) Create new Class \n5.) Search classes by ID \n6.) Exit");
            option = scan.nextInt();
            scan.nextLine();

            switch(option){
                case 1:
                    for(Teacher teacher : teachers){
                        System.out.println("- " + teacher.getName());
                        //String.format para que el resultado solo tenga 2 decimales
                        System.out.println("    Salary: " + String.format("%.2f",teacher.calculateSalary()));
                        //instanceof me permite verificar si el teacher es parte de FullTime o PartTime
                        if(teacher instanceof FullTimeTeacher){
                            FullTimeTeacher fullTime = (FullTimeTeacher) teacher;
                            System.out.println("    Years of Experience: " + fullTime.getExperienceYears());
                        } else if(teacher instanceof PartTimeTeacher) {
                            PartTimeTeacher partTime = (PartTimeTeacher) teacher;
                            System.out.println("    Active Hours per Week: " + partTime.getActiveHoursPerWeek());
                        }
                    }
                    break;
                case 2:
                    for(Class classn : classes){
                        classn.classInfo();
                }
                    break;
                case 3:
                    System.out.println("Enter the new student name: ");
                    String name = scan.nextLine();
                    System.out.println("Enter the new student ID(IDXXX): ");
                    String id = scan.nextLine();
                    System.out.println("Enter the new student age: ");
                    int age = scan.nextInt();
                    scan.nextLine();
                    Student student = new Student(name, id,age);
                    System.out.println("In which class will the new student be enrolled: ");
                    String className = scan.nextLine();
                    Class myClass = searchClassByName(className,classes);
                    if(myClass == null){
                        System.out.println("The class you are searching for doesn´t exist");
                    }else{
                        myClass.addStudent(student);
                        myClass.classInfo();
                        System.out.println("The student was added succsefully!");
                    }
                    break;
                case 4:
                    System.out.println("Enter the new class name: ");
                    String newClassName = scan.nextLine();
                    System.out.println("Enter the Classroom assigned to the new class: ");
                    String classRoom = scan.nextLine();
                    System.out.println("Enter the new class ID(ID1XXX): ");
                    String classId = scan.nextLine();
                    List<Student> students = new ArrayList<>();
                    int option1 = 0;
                    do{
                        System.out.println("Do you want to add a student?: \n1.)Yes \n2.) No ");
                        option1 = scan.nextInt();
                        scan.nextLine();
                        if (option1 == 1){
                            System.out.println("Enter the student ID");
                            String studentId = scan.nextLine();
                            Student studentn = searchStudentById(studentId,allStudents);
                            if(studentn == null){
                                System.out.println("The student ID was not found");
                            }else {
                                students.add(studentn);
                                allStudents.add(studentn);
                                System.out.println("The student was added succesfully!");
                            }
                        }
                    }while(option1 != 2);

                    System.out.println("Enter the teachers name: ");
                    String teacherName = scan.nextLine();
                    Teacher teacher1 = searchTeacherByName(teacherName,teachers);
                    if(teacher1 == null){
                        System.out.println("The teacher was not found");
                    }else {
                        Class classn = new Class(newClassName,classRoom,classId,students,teacher1);
                        classes.add(classn);
                    }


                    break;

                case 5:
                    System.out.println("Enter the class ID");
                    String classIdSearched = scan.nextLine();
                    Class myIdClass = searchClassById(classIdSearched,classes);
                    if(myIdClass == null){
                        System.out.println("The class you are searching for doesn´t exist");
                    }else{
                        myIdClass.classInfo();
                    }
                    break;
                case 6:
                    System.out.println("Leaving...");
                    break;

                default:
                    System.out.println("Please select one of the options in the menu!");

            }


        }while(option != 6);





    }
}
