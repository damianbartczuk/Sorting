import java.util.Arrays;

class MergeSort {
    private static MergeSort instance = null;
    public static int numberOfMerges = 0;
    public static MergeSort getInstance(){
        if (instance == null){
            return new MergeSort();
        }else{
            return instance;
        }
    }
    private void merge(int tab[], int l, int m, int r) {
        numberOfMerges++;
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = tab[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = tab[m + 1 + j];
         int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                tab[k] = L[i];
                i++;
            } else {
                tab[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            tab[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            tab[k] = R[j];
            j++;
            k++;
        }
    }

    void sort(int tab[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(tab, l, m);
            sort(tab, m + 1, r);
            merge(tab, l, m, r);
        }
    }
}
