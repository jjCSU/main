package sortingArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void selectionSort(List<Student> students, Comparator<Student> comparator) {
        int n = students.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(students.get(j), students.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            Collections.swap(students, i, minIndex);
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // Add 10 student objects to the ArrayList
        students.add(new Student(319, "Alan", "9412 Justice St"));
        students.add(new Student(313, "Bob", "1883 Ilja Ave"));
        students.add(new Student(317, "Claire", "731 Heron Way"));
        students.add(new Student(313, "Dana", "917 Geoff Rd"));
        students.add(new Student(312, "Eva", "827 Frederickson St"));
        students.add(new Student(316, "Fiona", "769 Evergreen St"));
        students.add(new Student(311, "Gavin", "555 Daniel Rd"));
        students.add(new Student(314, "Henry", "642 Cologne Ave"));
        students.add(new Student(315, "Imogen", "2823 Beach St"));
        students.add(new Student(318, "Jolene", "4543 Allpine Rd"));

        // Sort by name using the NameComparator
        selectionSort(students, new NameComparator());
        System.out.println("Sorted by Name:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort by roll number using the RollnoComparator
        selectionSort(students, new RollnoComparator());
        System.out.println("\nSorted by Roll Number:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
