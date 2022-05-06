import java.util.Random;

class SelectionSort
{
    void sort(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    
    void printArray(int[] arr)
    {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }

    public static void main(String[] args)
    {
        SelectionSort ss = new SelectionSort();
        System.out.print("Random array: ");
        Random random = new Random();
        int[] arr = random.ints(20, 10,99).toArray();
        ss.printArray(arr);
        ss.sort(arr);
        System.out.print("Sorted array: ");
        ss.printArray(arr);
    }
}