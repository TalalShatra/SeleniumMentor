package Tasks;

import java.util.Scanner;

/*
            Get two Strings by using scanner class
            add the second string after the first one
            If the first word ends with the same letter as the second word starts with, then remove it.
            Example: "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"
        */

public class _8_twoString {


    public static void main(String[] args) {
        System.out.println("please enter two words: ");
        Scanner scanner = new Scanner(System.in);
        String userString = scanner.nextLine();
        String[] words = userString.split(" ");
        String word1 = words[0];
        String word2 = words[1];

        if(word1.charAt(word1.length()-1) == word2.charAt(0)){
            System.out.println(word1.concat(word2.substring(1)));
        }else{
            System.out.println(word1.concat(word2));
    }
}}
