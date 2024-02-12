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
        this.students = null;
        this.teacher = null;
    }

    public Class(String name, String assignedClassroom, List<Student> students, Teacher teacher) {
        this.name = name;
        this.assignedClassroom = assignedClassroom;
        this.students = students;
        this.teacher = teacher;
    }
}
