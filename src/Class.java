package Final.src;

import java.util.ArrayList;
import java.util.List;

public class Class {
    private String name;
    private String assignedClassroom;
    private List<Student> students = new ArrayList<>();
    private Teacher teacher;

    public Class() {
        this.name = "";
        this.assignedClassroom = "";
        this.students = new ArrayList<>();
        this.teacher = null;
    }

    public Class(String name, String assignedClassroom, List<Student> students, Teacher teacher) {
        this.name = name;
        this.assignedClassroom = assignedClassroom;
        this.students = students;
        this.teacher = teacher;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void classInfo(){
        System.out.println("Class name: " + name + ", Classroom: " + assignedClassroom + ", Teacher: " + teacher.getName());
        System.out.println("Students: ");
        for(Student student : students){
            System.out.println("- " + student.getName() + ", ID: " + student.getId() + ", Age: " + student.getAge());
        }

    }


}
