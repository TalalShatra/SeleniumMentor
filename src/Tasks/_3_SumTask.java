package Tasks;

import java.util.Arrays;

public class _3_SumTask {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 10, 4, 5, 9, 5, 7, 6};
        int targetNumber = 16;

        int[] newArray = new int[2];

        for (int i=0; i<array.length; i++){
            for (int j=i+1; j<array.length; j++){
                if (array[i] + array[j] == targetNumber){
                    newArray[0]=array[i];
                    newArray[1]= array[j];
                    System.out.println(Arrays.toString(newArray));
                }}}}
}
