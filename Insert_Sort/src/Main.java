import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        int[] tab = {8,2,1,9,5};
        Insert_Sort(tab);
        System.out.println(Arrays.toString(tab));
    }
    public static int[] Insert_Sort(int[] tab)
    {
        int size = tab.length;
        //pętla przechodząca od 1 elementu tablicy do ostatniego
        for(int i = 1; i < size; i++)
        {
            //key zawiera aktualnie przesuwany element tablicy
            int key = tab[i];
            int j = i - 1;
            //pętla while przechodzi od elementu j - 1 do elementu zerowego
            //do momentu gdy element key jest mniejszy od sprawdzanego elementu
            while(j >= 0 && key < tab[j])
            {
                //jeśli element key jest mniejszy niż poprzedni, to zamienia je miejscami
                tab[j + 1] = tab[j];
                j--;
            }
            //przypisanie przechowywanego elementu key do miejsca tab[j + 1]
            tab[j + 1] = key;
        }
        return tab;
    }
}