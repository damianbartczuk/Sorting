import java.util.Arrays;

class CountingSort {

    private static CountingSort countingSort;

    public static CountingSort getInstance() {
        if (countingSort == null)
            return new CountingSort();
        else
            return countingSort;
    }

    private int maxItem(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }


    void sort(int arr[]) {
        int size = arr.length;
        int max = maxItem(arr);
        System.out.println("size = " + size + " max = " + max);
        int output[] = new int[size];
        int count[] = new int[max+1];
        Arrays.fill(count, 0);
        Arrays.fill(output, 0);

        for (int i = 0; i < size; ++i)
            count[arr[i]]++;

        for (int i = 1; i <=  max ; ++i)
            count[i] += count[i - 1];


        System.out.println("Tablica countin: ");
        for (int i = 0; i <count.length ; i++) {
            System.out.print(count[i] + " ");
        }
        System.out.println();
        for (int i = size - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        arr = output.clone();
        System.out.println("Wypisanie");
        for ( int i: arr) {
            System.out.print(i + " ");
        }
    }
}
