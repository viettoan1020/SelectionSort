// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      SelectionSort.selectionSort(SelectionSort.list);
        for (int i = 0; i < SelectionSort.list.length; i++) {
            System.out.print(SelectionSort.list[i] + " ");
        }
    }
}