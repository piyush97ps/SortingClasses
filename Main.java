package Sorting;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 *
 *
 * Author Piyush Sharma Git - piyush97ps
 *
 */


public class Main {
    static MergeSort mergeSort;
    static List unSorted;
    static Scanner s;
    List list  = new ArrayList();
    public static void main(String arg [] ){
        s = new Scanner(System.in);
        int num =0;
        while(true) {
            System.out.println("Select the type of sorting element \n" +
                    "1. Numbers \n" +
                    "2. Char \n" +
                    "3. String\n" +
                    "0. Exit");
            try{
            num = s.nextInt();// num is use to identify the Input type
            int a = 0;
            switch (num) {
                case 1:
                    System.out.println("Enter the length of Array to be sorted");
                    a = s.nextInt();
                    inputList(a, num);
                    Sort();
                    break;
                case 2:
                    System.out.println("Enter the length of Array to be sorted");
                    a = s.nextInt();
                    inputList(a, num);
                    Sort();
                    break;
                case 3:
                    System.out.println("Enter the length of Array to be sorted");
                    a = s.nextInt();
                    inputList(a, num);
                    Sort();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Enter the valid Option");

            }
            }
            catch (Exception e){
                System.out.println("You Entered in invalid value please enter the value according to the instruction");
                return;
            }
        }
    }
    public static void Sort(){

        System.out.println("Unsorted List");
        for(Object i : unSorted) System.out.print(i.toString()+" ");
        System.out.println();

        // MergeSort
        MergeSort mergeSort = new MergeSort(unSorted);
        System.out.println("Sorted List ()By MergeSort");
        for(String ob : mergeSort.printSortedList()) System.out.print(ob+" ");
        System.out.println();

        // QuickSort
        QuickSort quickSort = new QuickSort(unSorted);
        System.out.println("Sorted List ()By QuickSort");
        for(String ob : quickSort.printSortedList()) System.out.print(ob+" ");
        System.out.println();

        // HeapSort
        HeapSort heapSort = new HeapSort(unSorted);
        System.out.println("Sorted List ()By HeapSort");
        for(String ob : heapSort.printSortedList()) System.out.print(ob+" ");
        System.out.println();
        return;
    }
    public static void inputList(int len,int num) throws Exception {
        String input = null;
        if (num == 1) {
            unSorted = new ArrayList<Integer>();
            for (int i = 0; i < len; i++) {
                System.out.println("Enter the " + (i+1) + "th element");
                Integer element = s.nextInt();
                unSorted.add(i, element);
            }
        } else if (num == 2) {
            unSorted = new ArrayList<Character>();
            for (int i = 0; i < len; i++) {
                System.out.println("Enter the " + (i+1) + "th element");
                char element =s.next().charAt(0);
                unSorted.add(i, element);
            }
        } else {
            unSorted = new ArrayList<String>();
            for (int i = 0; i < len; i++) {
                System.out.println("Enter the " + (i+1) + "th element");
                String element = s.next();
                unSorted.add(i, element);
            }
        }
    }

}
