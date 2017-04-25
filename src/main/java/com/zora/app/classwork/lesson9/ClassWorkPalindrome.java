package com.zora.app.classwork.lesson9;

/**
 * Created by Kateryna Zora  on 04.04.2017.
 */
public class ClassWorkPalindrome {
    public static void main(String[] args) {
        String palindrome = "moom";
        boolean isPalindrome = true;

        for (int i = 0; i < palindrome.length()/2; i++) {
            isPalindrome = isPalindrome && //
                    (palindrome.charAt(i) == palindrome.charAt(palindrome.length()-i -1));
        }
         if (isPalindrome){
             System.out.println("Palindrome");
         } else {
             System.out.println("Not palindrome");
         }
        }
}
