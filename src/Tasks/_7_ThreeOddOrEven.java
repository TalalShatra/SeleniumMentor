package Tasks;

/*
   Create a method whose name is threeEvenOrOdd
   It takes an int array as parameter
   It returns a boolean
   It returns true if the argument array contains EITHER three even OR three odd values.
        otherwise, returns false
   Sample:
   [2, 3, 10, 8] -> true
   [5, 11, 27] -> true
   [1, 2, 3, 4] -> false
   [5, 10] -> false
   [2, 4, 6, 8] -> false
   [1, 2, 3, 4, 5, 6] -> true
   [1, 2, 3, 4, 5, 6, 7] -> true
   [1, 2, 3, 4, 5, 6, 7, 8] -> false

 */
public class _7_ThreeOddOrEven {

    public static void main(String[] args) {

        int[] arr = {2, 3, 10, 8};
        System.out.println("the first array contains either 3 even or 3 odd values: " + threeEvenOrOdd(arr));
        int [] arr2 = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("array 2 contains either 3 even or 3 odd values: " + threeEvenOrOdd(arr2));

    }
    public static boolean threeEvenOrOdd(int[]arr) {

        int evenCount = 0;
        int oddCount = 0;

        for (int number : arr) {
            if (number % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }
        return evenCount == 3 || oddCount == 3;
    }
}
