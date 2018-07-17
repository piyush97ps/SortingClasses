package Sorting;

import java.util.ArrayList;
import java.util.List;
/*
 *
 *
 * Author Piyush Sharma Git - piyush97ps
 *
 */

public class MergeSort {
    static Integer sortedNumber [] = null;
    static Character sortedChar [] = null;
    static String sortedString []  = null;
    List list;

    public MergeSort(List list) {
        this.list = list;
        sort();
    }

    private  void sort(){
        if(list.get(0).getClass().equals(Integer.class)){
            sortedNumber = (Integer[]) list.toArray(new Integer[list.size()]);
            divide(sortedNumber,0,sortedNumber.length-1);
        }else if(list.get(0).getClass().equals(Character.class)){
            sortedChar = (Character[]) list.toArray(new Character[list.size()]);
            divide(sortedChar,0,sortedChar.length-1);
        }else if(list.get(0).getClass().equals(String.class)){
            sortedString =(String[]) list.toArray(new String[list.size()]);
            divide(sortedString,0,sortedString.length-1);
        }
    }
    // Sorting Numbers
    private void merge(Integer arr[], int left, int mid, int right) {
        int leftLen = mid - left + 1; // length of left Array
        int rightLen = right - mid;   // length of right Array
        Integer leftArr[] = new Integer[leftLen];  // left Array
        Integer rightArr[] = new Integer[rightLen];// right Array
        for (int i = 0; i < leftLen; i++)  leftArr[i] = arr[left + i];   // coping Left Array
        for (int j = 0; j < rightLen; j++) rightArr[j] = arr[mid + 1 + j]; // coping right Array
        int i = 0, j = 0;  // merging index
        int k = left;
        // merging array
        while (i < leftLen && j < rightLen) {
            if (leftArr[i] <= rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            }
            else{
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        // merging the remaining array
        while (i < leftLen){
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < rightLen){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    private void divide(Integer  arr[], int left, int right){
        if (left < right){
            int mid = (left+right)/2;
            divide(arr, left, mid);
            divide(arr , mid+1, right);
            merge(arr, left, mid, right);
        }
    }

    // Sorting Characters
    private void merge(Character arr[], int left, int mid, int right) {
        int leftLen = mid - left + 1; // length of left Array
        int rightLen = right - mid;   // length of right Array
        char leftArr[] = new char[leftLen];  // left Array
        char rightArr[] = new char[rightLen];// right Array
        for (int i = 0; i < leftLen; i++)  leftArr[i] = arr[left + i];   // coping Left Array
        for (int j = 0; j < rightLen; j++) rightArr[j] = arr[mid + 1 + j]; // coping right Array
        int i = 0, j = 0;  // merging index
        int k = left;
        // merging array
        while (i < leftLen && j < rightLen) {
            if (leftArr[i] <= rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            }
            else{
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        // merging the remaining array
        while (i < leftLen){
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < rightLen){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    private void divide(Character  arr[], int left, int right){
        if (left < right){
            int mid = (left+right)/2;
            divide(arr, left, mid);
            divide(arr , mid+1, right);
            merge(arr, left, mid, right);
        }
    }

    // Sorting String
    private static void merge(String arr[], int left, int mid, int right) {
        int leftLen = mid - left + 1; // length of left Array
        int rightLen = right - mid;   // length of right Array
        String leftArr[] = new String[leftLen];  // left Array
        String rightArr[] = new String[rightLen];// right Array
        for (int i = 0; i < leftLen; i++)  leftArr[i] = arr[left + i];   // coping Left Array
        for (int j = 0; j < rightLen; j++) rightArr[j] = arr[mid + 1 + j]; // coping right Array
        int i = 0, j = 0;  // merging index
        int k = left;
        // merging array
        while (i < leftLen && j < rightLen) {
            if (leftArr[i].compareTo(rightArr[j])<0){
                arr[k] = leftArr[i];
                i++;
            }
            else{
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        // merging the remaining array
        while (i < leftLen){
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < rightLen){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    private static void divide(String  arr[], int left, int right){
        if (left < right){
            int mid = (left+right)/2;
            divide(arr, left, mid);
            divide(arr , mid+1, right);
            merge(arr, left, mid, right);
        }
    }

    // Printing SortedList
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