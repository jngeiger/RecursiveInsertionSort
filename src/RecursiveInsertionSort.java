import java.sql.SQLOutput;
import java.util.Arrays;

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int[] array = {27,83,11,5,13,55,66};
        RecursiveInsertionSort ris = new RecursiveInsertionSort();
        ris.insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
    public void insertionSort(int[] array)
    {
        _insertGoingUp(array,1,array.length-1);
    }
    public void _insertGoingUp(int[] array, int currentIdx, int end)
    {
        if (currentIdx == array.length)
            return;
        else {
        _insertGoingDown(array,currentIdx);
        _insertGoingUp(array,++currentIdx,array.length-1);
        }
    }
    public void _insertGoingDown(int[] array, int currentIdx)
    {
        if (currentIdx == 0 || array[currentIdx - 1] <= array[currentIdx]) {
            return;
        }
        else {
            swapAtIndex(array, currentIdx, currentIdx - 1);
            _insertGoingDown(array, --currentIdx);
        }
    }
    public void swapAtIndex(int[] array, int one, int two)
    {
        int temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }
}
