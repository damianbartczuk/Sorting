import java.util.Arrays;

public class SelectionSort {
    private static SelectionSort selectionSort;
    int comparsion = 0;
    int exchange = 0;
    private SelectionSort() {
    }

    public static SelectionSort getInstance(){
        if (selectionSort == null)
            return new SelectionSort();
        else
            return selectionSort;
    }

   public static void sort(int[] tab) {
        int miniidx;
        int tmp;
        for (int i = 0; i <tab.length-1 ; i++) {
            miniidx = i;
            for (int j = i+1; j <tab.length ; j++) {
                if (tab[j] < tab[miniidx])
                    miniidx = j;
            }
            tmp = tab[i];
            tab[i] = tab[miniidx];
            tab[miniidx] = tmp;
        }

        Arrays.stream(tab).forEach(value -> System.out.print(value + " "));
    }




}
