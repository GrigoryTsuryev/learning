package Masa.Previous;

public class StudentWork {
    public static void main(String[] args) {
        Student[] allstudents=new Student[15];

        Student.fillarray(allstudents);
        Student.sort(allstudents);
        Student.printMore67(allstudents);
    }
}

