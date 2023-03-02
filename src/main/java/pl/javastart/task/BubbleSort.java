package pl.javastart.task;

public class BubbleSort {

    // ta metoda powinna sortować inputArray oraz zwracać informację o liczbie porównań, które były do tego potrzebne
    public int sort(int[] inputArray) {
        int numbersToSort = inputArray.length;
        int comparisons = 0;
        while (numbersToSort > 1) {
            int swapsInIteration = 0;
            for (int i = 0; i < numbersToSort - 1; i++) {
                if (inputArray[i] > inputArray[i + 1]) {
                    swap(inputArray, i);
                    swapsInIteration++;
                }
                comparisons++;
            }
            if (swapsInIteration == 0) {
                break;
            }
            numbersToSort--;
        }

        return comparisons;
    }

    private void swap(int[] array, int index) {
        int temp = array[index];
        array[index] = array[index + 1];
        array[index + 1] = temp;
    }

}
