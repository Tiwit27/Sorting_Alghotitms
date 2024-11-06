import java.util.Arrays;

public class Main {
    //partition znajduje pozycję podziału tablicy
    static int partition(int array[], int low, int high) {
        //pivot przyjmuje wartość elementu znajdującego się najbardziej na prawo
        int pivot = array[high];
        //wskaźnik na największy element
        int i = (low - 1);
        //for przechodzi przez wszystkie elementy i porównuje je z pivotem
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                // jeśli element tablicy jest mniejszy niż pivot, zamieniamy go z największym elementem, wskazanym przez i
                i++;
                //zamiana elementu 'i' w tablicy z elementem 'j'
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        //zamiana pivotu z największym elementem wskazanym przez i
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        //zwraca pozycję w której tablica została podzielona
        return (i + 1);
    }

    static void quickSort(int array[], int low, int high) {
        if (low < high) {
            //znajduje element taki liczby że mniejsze niż pivot są po lewej a większe po prawej
            int pi = partition(array, low, high);
            //rekurencja wywołuje dla lewej strony od pivota
            quickSort(array, low, pi - 1);
            //rekurencja wywołuje dla prawej strony od pivota
            quickSort(array, pi + 1, high);
        }
    }

    public static void main(String args[]) {
        int[] data = { 8, 7, 2, 1, 0, 9, 6 };
        System.out.println(Arrays.toString(data));
        int size = data.length;
        quickSort(data, 0, size - 1);
        System.out.println(Arrays.toString(data));
    }
}