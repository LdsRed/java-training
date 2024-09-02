package sections.semisenior;

public class QuickSortImplementation {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        quickSort(intArray, 0, intArray.length );

        for (int i = 0; i < intArray.length; i++ ){
            System.out.println(intArray[i]);
        }


    }



    public static void quickSort(int[] inputArray, int start, int end) {
        //significa que el arreglo solo cuenta con un elemento
        if(end - start < 2){
            return;
        }
        int pivotIndex = partition(inputArray, start, end);

        quickSort(inputArray, start, pivotIndex);
        quickSort(inputArray, pivotIndex+1, end);

    }


    public static int partition(int[] inputArray, int start, int end) {
        int j = end;
        int i = start;
        int pivot = inputArray[start];



        while (i < j ){

            //Note: Empty loop body
            while (i < j && inputArray[--j] >= pivot);


            if (i < j){
                inputArray[i] = inputArray[j];
            }



            while (i < j && inputArray[++i] <= pivot);

            if (i < j){
                inputArray[j] = inputArray[i];
            }
        }

        inputArray[j] = pivot;
        return j;
    }
}
