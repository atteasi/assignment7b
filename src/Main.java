import task1.ArrayIns;
import task1.Recursion;
import task3.Josephus;
import task4.Anagrams;
import task4.Merging;


public class Main {
    public static void main(String[] args){
        System.out.println("Task 1:");
        System.out.println("Recursion:");
        Recursion r = new Recursion();
        System.out.println("The multiplication of 5 and 10 result in :" + r.mult(5,10)
        +"\n\nQuickSort2:");
        ArrayIns arr = ArrayIns.createTable();
        arr.showTable();
        System.out.println("\nHashTable: changes can be seen on the file HashTable");

        System.out.println("\nTask 2: Answers are in task2/Answers.\n");
        System.out.println("Task 3: Robot Grid\nSolution can be found on the file task3/problem1" +
                "\n\nProblem 2: Josephus problem");
        System.out.println("Last remaining person alive in a circle of 10 people where every second person is killed is person number " + Josephus.josephus(10, 2));
        System.out.println("\nTask 4: \nProblem 1: Merging two sorted arrays\n");
        Merging.test();
        System.out.println("\nProblem 2: Grouping anagrams together\n");
        Anagrams.test();
    }
}