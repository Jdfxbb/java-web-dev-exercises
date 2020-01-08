package exercises;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Gradebook {
    public static void main(String[] args){
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;
        Integer newStudentId;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
//        do {
////
////            System.out.print("ID: ");
////            newStudentId = input.nextInt();
////            System.out.println(newStudentId.getClass());

//            if (!newStudentId.equals("")) {
//                System.out.print("Student: ");
//                newStudent = input.nextLine();
//                students.put(newStudentId, newStudent);
//
//                // Read in the newline before looping back
//                input.nextLine();
//            }

//        } while(!newStudentId.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");

        }


    }
}
