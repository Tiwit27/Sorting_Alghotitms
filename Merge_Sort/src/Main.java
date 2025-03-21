import java.util.Arrays;

class Main {
    //łączy dwie części tablicy: L oraz M w jedną
    static void merge(int array[], int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int L[] = new int[n1];
        int M[] = new int[n2];
        //wypełnia lewą część tablicy
        for (int i = 0; i < n1; i++)
        {
            L[i] = array[p + i];
        }
        //wypełnia prawą część tablicy
        for (int j = 0; j < n2; j++)
        {
            M[j] = array[q + 1 + j];
        }
        //Zachowuje aktualny index głównej tablicy oraz podtablic
        int i, j, k;
        i = 0;
        j = 0;
        k = p;
        //Dopóki nie ziterujemy całej tablicy L albo M, wybiera większy element z pośród nich i dodaje go do głównej tablicy
        while (i < n1 && j < n2)
        {
            if (L[i] <= M[j])
            {
                array[k] = L[i];
                i++;
            } else
            {
                array[k] = M[j];
                j++;
            }
            k++;
        }
        //Kiedy elementy jednej z tablic się wykończą, dopisujemy pozostałe elementy drugiej tablicy do głównej tablicy
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = M[j];
            j++;
            k++;
        }
    }
    //Dzieli tablicę na dwie podtablice, sortuje je i łączy spowrotem w jedną
    static void mergeSort(int array[], int left, int right) {
        if (left < right) {
            // mid wybiera miejsce podziału tablicy głównej
            int mid = (left + right) / 2;
            //rekurencja wywołuje metody dla podtablic
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            //merge łączy dwie tablice w jedną
            merge(array, left, mid, right);
        }
    }
    public static void main(String args[]) {
        int[] array = { 6, 5, 12, 10, 9, 1 };
        mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}