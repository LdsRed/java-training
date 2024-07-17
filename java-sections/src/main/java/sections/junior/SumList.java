package sections.junior;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumList {

    /*
    * Please write a function that sums a list, but ignores any duplicated items in the list.
    * For instance, for the list [3, 4, 3, 6] the function should return 10,
    * and for the list [1, 10, 3, 10, 10] the function should return 4.
    * */

    public static void main(String[] args) {

        int[] arrayTest = {3,4,3,6};

        int result = sumNoDuplicates(arrayTest);
        System.out.println(result);

    }



    public static int sumNoDuplicates(int[] arr){

        int result = 0;

        for(int i = 0; i < arr.length; i++){

            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                
                if(arr[i] == arr[j]){
                    count++;
                }
            }

            if (count == 1){
                result += arr[i];
            }
        }

        return result;
    }
}
