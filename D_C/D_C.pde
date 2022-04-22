float[] arr;
void setup() {
  size(700, 700);
  arr = new float[width];
  for (int i = 0; i < arr.length; i++) {
    arr[i] = random(height);
  }
}

void draw() {
  background(000, 000, 000);
  int n = arr.length;
  quickSort(arr, 0, n - 1);  
  for (int i = 0; i < arr.length; i++) {
    stroke(255);
    line(i, height, i, height - arr[i]);
  }
}
void swap(float[] arr, int i, int j)
{
    float temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
int partition(float[] arr, int low, int high)
{
    float pivot = arr[high];
    int i = (low - 1);
    for(int j = low; j <= high - 1; j++)
    {
        if (arr[j] < pivot)
        {
            i++;
            swap(arr, i, j);
        }
    }
    swap(arr, i + 1, high);
    return (i + 1);
}
void quickSort(float[] arr, int low, int high)
{
    if (low < high)
    {
        int pi = partition(arr, low, high);
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}
