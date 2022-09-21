package Tasks;

// From an int array, return the two number which is equal to target number (example {3,1,6,9,2} target is 15)

import java.util.Arrays;

public class _4_SumTask {

    public static void main(String[] args) {

        int targetNumber = 15;

        int[] arr = {3,1,6,9,2};

        int[] newArr = new int[2];

        for(int i=0; i< arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i] + arr[j] == targetNumber){
                    newArr[0]=arr[i];
                    newArr[1]= arr[j];
                    System.out.println(Arrays.toString(newArr));
        }}}}}
