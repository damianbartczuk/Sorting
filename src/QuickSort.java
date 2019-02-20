class QuickSort {
    private static QuickSort quickSort;

    public static QuickSort getInstance(){
        if (quickSort == null){
            return new QuickSort();
        }else{
            return quickSort;
        }
    }

    public void sort(int[] tab, int l, int r){
        int v = tab[(l+r)/2];
        int i, j, x;
        i = l;
        j = r;
        do{
            while(tab[i] < v) i++;
            while(tab[j] > v) j--;
            if(i <=j){
                x = tab[i];
                tab[i] = tab[j];
                tab[j] = x;
                i++;
                j--;
            }

        }while (i<=j);

        if(j> l)sort(tab, l, j);
        if(i<r)sort(tab, i, r);
    }
/*    int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    void sort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }

    }*/
}
