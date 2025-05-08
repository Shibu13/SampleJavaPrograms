package com.example.demo.pwcsample;


import java.util.*;
import java.util.stream.Collectors;

/*
 * 
Each Student has a List<String> of subjects.
The method getStudentsBySubject():
Filters students who have the given subject in their list.
Uses anyMatch with case-insensitive comparison.
Collects their names into a list.
 */

class Student {
    private int studentId;
    private String studentName;
    private List<String> subjectList;

    public Student(int studentId, String studentName, List<String> subjectList) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.subjectList = subjectList;
    }

    public String getStudentName() {
        return studentName;
    }

    public List<String> getSubjectList() {
        return subjectList;
    }
}

public class SubjectFilter {

//    public static List<String> getStudentsBySubject(List<Student> students, String subjectName) {
//        return students.stream()
//                .filter(student -> student.getSubjectList().stream()
//                        .anyMatch(subject -> subject.equalsIgnoreCase(subjectName)))
//                .map(Student::getStudentName)
//                .collect(Collectors.toList());
//    }
	
	  public static List<String> getStudentsBySubject(List<Student> students, String subjectName) {
	        List<String> result = new ArrayList<>();
	        for (Student student : students) {
	            List<String> subjects = student.getSubjectList();
	            for (String subject : subjects) {
	                if (subject.equalsIgnoreCase(subjectName)) {
	                    result.add(student.getStudentName());
	                    break; // No need to check other subjects once matched
	                }
	            }
	        }
	        return result;
	    }

    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student(1, "Alice", Arrays.asList("Math", "Science")),
                new Student(2, "Bob", Arrays.asList("English", "Math")),
                new Student(3, "Charlie", Arrays.asList("History", "Science")),
                new Student(4, "David", Arrays.asList("Geography", "Math"))
        );

        String subject = "Math";
        List<String> studentsOptedMath = getStudentsBySubject(studentList, subject);

        System.out.println("Students who opted for " + subject + ": " + studentsOptedMath);
    }
}
