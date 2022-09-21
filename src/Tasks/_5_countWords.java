package Tasks;

public class _5_countWords {
    //    Return the number of times that the string "java" appears anywhere in the given string,
    //    except we'll accept any letter for the 'v', so "jaba" and "jaxa" count.
//
//    countCode("aaajavabbb") → 1
//    countCode("javaxxjaxa") → 2
//    countCode("jazaxxjapa") → 2

    public static void main(String[] args) {
        String str = "aaajavabbbjaxa";
        System.out.println(countJaxa(str));
    }

    public static int countJaxa(String string) {

        int count = 0;
        for(int i=0; i<string.length()-3; i++){
            String check = string.substring(i, i+4);
            if(check.startsWith("ja")&&check.endsWith("a")){
                count++;
            }

        }return count;


    }
}
