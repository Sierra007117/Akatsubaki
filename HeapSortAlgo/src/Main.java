import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public void sort(int[] arrA) {
        int size = arrA.length;
        for (int i = size / 2 - 1; i >= 0; i--)
            heap(arrA, size, i);
        for (int i=size-1; i>=0; i--) {
            int x = arrA[0];
            arrA[0] = arrA[i];
            arrA[i] = x;
            heap(arrA, i, 0);
        }
    }
    void heap(int[] arrA, int heapSize, int i) {
        int largest = i;
        int leftChildIdx  = 2*i + 1;
        int rightChildIdx  = 2*i + 2;
        if (leftChildIdx  < heapSize && arrA[leftChildIdx ] > arrA[largest])
            largest = leftChildIdx ;
        if (rightChildIdx  < heapSize && arrA[rightChildIdx ] > arrA[largest])
            largest = rightChildIdx ;
        if (largest != i) {
            int swap = arrA[i];
            arrA[i] = arrA[largest];
            arrA[largest] = swap;
            heap(arrA, heapSize, largest);
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements in the array:");
        n=sc.nextInt();
        int[] arrA = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++)
        {
            arrA[i]=sc.nextInt();
        }
        System.out.println("Inserted Array:"+ Arrays.toString(arrA));
        Main heapSort = new Main();
        heapSort.sort(arrA);
        System.out.println("Heap Sorted Array:" + Arrays.toString(arrA));
    }
}