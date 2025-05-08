package com.example.demo.pwcsample;

import java.util.*;
import java.util.stream.Collectors;

class Student1 {
    private int studentId;
    private String studentName;
    private String subjectName;
    private int marks;

    public Student1(int studentId, String studentName, String subjectName, int marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.subjectName = subjectName;
        this.marks = marks;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return studentId + " - " + studentName + " - " + subjectName + " - " + marks;
    }
}

public class StudentMarksAggregator {

//    public static Map<Integer, Integer> getTotalMarksByStudent(List<Student1> students) {
//        return students.stream()
//                .collect(Collectors.groupingBy(
//                        Student1::getStudentId,
//                        Collectors.summingInt(Student1::getMarks)
//                ));
//    }
	
	public static Map<Integer, Integer> getTotalMarksByStudent(List<Student1> students) {
        Map<Integer, Integer> result = new HashMap<>();

        for (Student1 student : students) {
            int id = student.getStudentId();
            int currentMarks = student.getMarks();

            if (result.containsKey(id)) {
                result.put(id, result.get(id) + currentMarks);
            } else {
                result.put(id, currentMarks);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Student1> studentList = Arrays.asList(
                new Student1(1, "Alice", "Math", 85),
                new Student1(1, "Alice", "Science", 90),
                new Student1(2, "Bob", "Math", 75),
                new Student1(2, "Bob", "Science", 70),
                new Student1(3, "Charlie", "Math", 65)
        );

        Map<Integer, Integer> totalMarksMap = getTotalMarksByStudent(studentList);

        totalMarksMap.forEach((id, total) ->
                System.out.println("Student ID: " + id + " -> Total Marks: " + total));
    }
}