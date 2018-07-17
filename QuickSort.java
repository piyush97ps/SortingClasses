package Sorting;

import java.util.ArrayList;
import java.util.List;
/*
 *
 *
 * Author Piyush Sharma Git - piyush97ps
 *
 */

public class QuickSort {
    static Integer sortedNumber [] = null;
    static Character sortedChar [] = null;
    static String sortedString []  = null;
    List list;

    public QuickSort(List list) {
        this.list = list;
        sort();
    }

    private  void sort(){
        if(list.get(0).getClass().equals(Integer.class)){
            sortedNumber = (Integer[]) list.toArray(new Integer[list.size()]);
            quickSort(sortedNumber,0,sortedNumber.length-1);
        }else if(list.get(0).getClass().equals(Character.class)){
            sortedChar = (Character[]) list.toArray(new Character[list.size()]);
            quickSort(sortedChar,0,sortedChar.length-1);
        }else if(list.get(0).getClass().equals(String.class)){
            sortedString =(String[]) list.toArray(new String[list.size()]);
            quickSort(sortedString,0,sortedString.length-1);
        }
    }
    // Sorting Numbers
    private void quickSort(Integer arr[],int low,int high){
        if (low < high)
        {
            //pi is partitioning index, arr[p]
            int pi = partition(arr, low, high);

            // left
            quickSort(arr, low, pi - 1);
            // right
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(Integer[] arr, int low, int high) {
        // pivot
        int pivot = arr[high];
        // smaller Index
        int i = (low - 1);

        for (int j = low; j <= high- 1; j++)
        {
            // swat if small
            if (arr[j] <= pivot) {
                i++;    // increment index of smaller element
                // Swapping
                Integer temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //Swapping
        Integer temp = arr[high];
        arr[high] = arr[i+1];
        arr[i+1] = temp;
        return (i + 1);
    }

    // Sorting Characters
    private void quickSort(Character arr[],int low,int high){
        if (low < high)
        {
            //pi is partitioning index, arr[p]
            int pi = partition(arr, low, high);

            // left
            quickSort(arr, low, pi - 1);
            // right
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(Character[] arr, int low, int high) {
        // pivot
        int pivot = arr[high];
        // smaller Index
        int i = (low - 1);

        for (int j = low; j <= high- 1; j++)
        {
            // swat if small
            if (arr[j] <= pivot)
            {
                i++;    // increment index of smaller element
                // Swapping
                Character temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //Swapping
        Character temp = arr[high];
        arr[high] = arr[i+1];
        arr[i+1] = temp;
        return (i + 1);
    }

    // Sorting Strings
    private void quickSort(String arr[],int low,int high) {
        if (low < high) {
            //pi is partitioning index, arr[p]
            int pi = partition(arr, low, high);
            // left
            quickSort(arr, low, pi - 1);
            // right
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(String [] arr, int low, int high) {
        // pivot
        String pivot = arr[high];
        // smaller Index
        int i = (low - 1);

        for (int j = low; j <= high- 1; j++)
        {
            // swat if small
            if (arr[j].compareTo(pivot)<=0)
            {
                i++;    // increment index of smaller element
                //Swapping
                String temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // Swapping
        String temp = arr[high];
        arr[high] = arr[i+1];
        arr[i+1] = temp;
        return (i + 1);
    }

    // Printing Sordted List
    public List<String> printSortedList() {
        List<String> msg = new ArrayList<>();
        if(!(sortedNumber==null)){
            for(Integer ob : sortedNumber) msg.add(ob.toString());
        }else if(!(sortedChar==null)){
            for(Character ob : sortedChar) msg.add(ob.toString());
        }else if(!(sortedString==null)){
            for(String ob : sortedString) msg.add(ob);
        }
        return msg;
    }

}
