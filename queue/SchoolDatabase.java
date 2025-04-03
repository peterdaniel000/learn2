package queue;

import java.util.*;

class Student {
    private String id;
    private String name;

    public Student (String id, String name){
        this.id = id;
        this.name = name;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}

public class SchoolDatabase {
    private Set<String> studentIds;

    public SchoolDatabase(){
        this.studentIds = new HashSet<>();
    }

    public void addStudent(Student student){
        String id = student.getId();
        if (studentIds.contains(id)){
            System.out.println("Error: student ID "+ id + " already exits!");
            return;
        }
        studentIds.add(id);
        System.out.println("Student "+ student.getName()+ " added to the database");
    }
    public static void main(String[] args){
        SchoolDatabase db = new SchoolDatabase();

        Student student1 = new Student("10001", "Alice");
        db.addStudent(student1);

        Student student2 = new Student("10002", "Bod");
        db.addStudent(student2);

        Student student3 = new Student("10001", "David");
        db.addStudent(student3);

    }
    
}
