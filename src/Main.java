import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] tab = new int[]{10, 5, 32, 7, 1, 54, 76, 23};
        QuickSort quickSort = QuickSort.getInstance();
        quickSort.sort(tab, 0, tab.length-1);
        Arrays.stream(tab).forEach(value -> System.out.print(value + " "));
    }
}
