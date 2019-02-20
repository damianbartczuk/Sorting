public class Main {

    public static void main(String[] args) {
        SelectionSort selectionSort = SelectionSort.getInstance();
        int[] tab = new int[]{10,9,8,7,6,5,4,3,2,1};
        selectionSort.sort(tab);
        System.out.println("insert");
        InsertionSort insertionSort = InsertionSort.getInstance();
        int[] tab1 = new int[]{10,9,8,7,6,5,4,3,2,1};
        insertionSort.sort(tab1);
        System.out.println();
        CountingSort countingSort = CountingSort.getInstance();
        int[] tab2 = new int[]{1,2,1,1,3,3,3,5,1,6,8};
        countingSort.sort(tab2);
        System.out.println();
        System.out.println();
        System.out.println("quicksort");
        QuickSort quickSort = new QuickSort();
        int[] tab3 = new int[]{10,9,8,7,6,5,4,3,2,1};
        quickSort.sort(tab3, 0 ,tab3.length-1);
        for ( int i:tab3) {
            System.out.print(i + " ");
        }
    }
}
