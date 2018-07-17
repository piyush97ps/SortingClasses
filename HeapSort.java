package Sorting;

import java.util.ArrayList;
import java.util.List;
/*
 *
 *
 * Author Piyush Sharma Git - piyush97ps
 *
 */

public class HeapSort {
    static Integer sortedNumber [] = null;
    static Character sortedChar [] = null;
    static String sortedString []  = null;
    List list;

    public HeapSort(List list) {
        this.list = list;
        sort();
    }

    private  void sort(){
        if(list.get(0).getClass().equals(Integer.class)){
            sortedNumber = (Integer[]) list.toArray(new Integer[list.size()]);
            heapSort(sortedNumber);
        }else if(list.get(0).getClass().equals(Character.class)){
            sortedChar = (Character[]) list.toArray(new Character[list.size()]);
            heapSort(sortedChar);
        }else if(list.get(0).getClass().equals(String.class)){
            sortedString =(String[]) list.toArray(new String[list.size()]);
            heapSort(sortedString);
        }
    }

    // sorting number by heapSort
    private void heapSort(Integer[] arr) {
        int size  = arr.length;

        for(int i = size/2-1; i >= 0; i--)
            heapify(arr,size,i);

        for(int i = size-1;i>=0;i--){

            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            // creating max heap tree
            heapify(arr,i,0);
        }
    }

    // to create a max heap tree
    private void heapify(Integer[] arr, int size, int i){
        // max or root
        int max = i;
        // left node
        int left = 2*i+1;
        // right node
        int right = 2*i+2;

        // if left is greater then max = left
        if(left<size && arr[left] > arr[max]){
            max = left;
        }

        // if right is greater then max = right
        if(right<size && arr[right] > arr[max]){
            max = right;
        }

        // if the max is not the same or max is affected by upper cases then
        if(max != i ){
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;

            // heapifying the further nodes
            heapify(arr,size,max);
        }

    }

    // sorting Character by heapSort
    private void heapSort(Character[] arr) {
        int size  = arr.length;


        for(int i = size/2-1; i >= 0; i--)
            heapify(arr,size,i);
        for(int i = size-1;i<=0;i--){
            Character temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            // creating max heap tree
            heapify(arr,i,0);
        }
    }

    // to create a max heap tree
    private void heapify(Character[] arr, int size, int i){
        // max or root
        int max = i;
        // left node
        int left = 2*i+1;
        // right node
        int right = 2*i+2;

        // if left is greater then max = left
        if(left<size && arr[left] > arr[max]){
            max = left;
        }

        // if right is greater then max = right
        if(right<size && arr[right] > arr[max]){
            max = right;
        }

        // if the max is not the same or max is affected by upper cases then
        if(max != i ){
            Character temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;

            // heapifying the further nodes
            heapify(arr,size,max);
        }

    }

    // sorting String by heapSort
    private void heapSort(String[] arr) {
        int size  = arr.length;

        for(int i = size/2-1; i >= 0; i--)
            heapify(arr,size,i);

        for(int i = size-1;i<=0;i--){
            String  temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            // creating max heap tree
            heapify(arr,i,0);
        }
    }

    // to create a max heap tree
    private void heapify(String[] arr, int size, int i){
        // max or root
        int max = i;
        // left node
        int left = 2*i+1;
        // right node
        int right = 2*i+2;

        // if left is greater then max = left
        if(left<size && arr[left].compareTo(arr[max])<0){
            max = left;
        }

        // if right is greater then max = right
        if(right<size && arr[right].compareTo(arr[max])<0){
            max = right;
        }

        // if the max is not the same or max is affected by upper cases then
        if(max != i ){
            String temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;

            // heapifying the further nodes
            heapify(arr,size,max);
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
