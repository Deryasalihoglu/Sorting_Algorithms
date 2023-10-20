import java.util.Arrays;

public class MergeSort{
    public static void main(String[] args){
       // int[] testArr = new int[12];
       // for(int i = 0; i < testArr.length; i++){
       //     testArr[i] = (int)(Math.random() * 101 - 50);
       // }
        int[] arr = {16,21,11,8,12,22};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    public static int[] mergeSort(int[] array){
        if(array.length > 1){

            int middle = array.length/2; // orta nokta
            int [] leftArray = Arrays.copyOfRange(array,0,middle); // ortadan bölüp soldakileri bir array yapıyor
            int [] rightArray = Arrays.copyOfRange(array,middle,array.length); // ortadan bölüp sağdakileri bir array yapıyor

            //Aynı işlemleri oluşan küçük arrayler için de yapıyorum.En sonunda birleştiriyorum.
            mergeSort(leftArray);
            mergeSort(rightArray);
            merge(array,leftArray,rightArray);
        }
        return array;
    }

    public static void merge(int[] array, int[] leftArray, int[] rightArray){
        int i = 0; //left array's index
        int j = 0; //right array's index
        int k = 0; // yerleştirceğim index

        // Karşılaştırma yapıp küçük olanı arraye geri yerleştiriyorum.
        while(i < leftArray.length && j < rightArray.length){
            if(leftArray[i] <= rightArray[j]){
                array[k] = leftArray[i];
                i++;
                k++;
            }
            else{
                array[k] = rightArray[j];
                j++;
                k++;
            }
        }
        // Soldaki arrayde eleman kalmış mı diye kontrol ediyorum. Varsa yerleştiriyorum.
        while(i < leftArray.length){
            array[k] = leftArray[i];
            k++;
            i++;
        }
        // Sağdaki için de bakıyorum...
        while(j < rightArray.length){
            array[k] = rightArray[j];
            k++;
            j++;
        }
    }
}