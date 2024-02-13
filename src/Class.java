package Final.src;

import java.util.ArrayList;
import java.util.List;

public class Class {
    private String name;
    private String assignedClassroom;
    private String id;
    private List<Student> students = new ArrayList<>();
    private Teacher teacher;

    public Class() {
        this.name = "";
        this.assignedClassroom = "";
        this.id = "";
        this.students = new ArrayList<>();
        this.teacher = null;
    }

    public Class(String name, String assignedClassroom,String id, List<Student> students, Teacher teacher) {
        this.name = name;
        this.assignedClassroom = assignedClassroom;
        this.id = id;
        this.students = students;
        this.teacher = teacher;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void classInfo(){
        System.out.println("Class name: " + name + ", Classroom: " + assignedClassroom + ", Class ID: " + id + ", Teacher: " + teacher.getName());
        System.out.println("Students: ");
        for(Student student : students){
            System.out.println("- " + student.getName() + ", Student ID: " + student.getId() + ", Age: " + student.getAge());
        }

    }

    public void addStudent(Student student){
        students.add(student);
    }


}
