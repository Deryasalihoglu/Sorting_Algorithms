import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {22,27,16,2,18,6};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    static int[] selectionSort(int[] arr){
        //i sabit index
        //j gezen index

        for(int i = 0; i < arr.length-1; i++){
            int iMin = i; // minimun sayının indexi
            for(int j = i +1; j < arr.length ; j++){
                if(arr[iMin] > arr[j]){
                    iMin = j;
                }
            }
            if(i != iMin)
                swap(i,iMin,arr );
        }
        return arr;
    }

    /* Another way:
    public static int[] selectionSort(){
      int[] arr = {8,2,9,13,0,-2};

      for(int k = 0; k< arr.length-1; k++){
          int indexMin = k;
          for(int i = k+1; i < arr.length; i++){
              if(arr[indexMin] > arr[i])
                  indexMin = i;
              System.out.println(indexMin);
          }
          if(indexMin != k)
              swap(k, indexMin, arr );
          System.out.println(Arrays.toString(arr));
      }
      return arr;
  }*/

    public static void swap(int k, int indexMin, int [] arr){
        int term = arr[k];
        arr [k]= arr[indexMin];
        arr[indexMin] = term;
    }
}
