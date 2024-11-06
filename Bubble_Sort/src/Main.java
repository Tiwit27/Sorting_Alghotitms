import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] data = {-2,45,0,11,-9};
        bubbleSort(data);
        System.out.println(Arrays.toString(data));
    }
    static void bubbleSort(int[] array)
    {
        int size = array.length;
        //pętla przechodząca przez wszystkie elementy danej tablicy
        for(int i = 0; i < size - 1; i++)
        {
            //pętla przechodzi przez wszystkie elementy tablicy bez 'i' ostatnich
            for(int j = 0; j < size - i - 1; j++)
            {
                //sprawdzanie czy 'i'-ty element tablicy jest większy od 'i + 1', jeśli tak, zamienia je miejscami
                if(array[j] > array[j + 1])
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                System.out.println(Arrays.toString(array));
            }
            System.out.println("--------------------");
        }
    }
}