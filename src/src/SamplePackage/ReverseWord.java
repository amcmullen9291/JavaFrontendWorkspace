package src.SamplePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWord {

    public static int WIDTH = 300;
    public static int HEIGHT = 300;
    public static void main(String[] args) {
        reverseString("Hello");
        reverseWords("LaCrosse, Wisconsin");
    }

    private static  void reverseString(String word) {
        char[] s = word.toCharArray();
        final int n = s.length;
        final int halfLength = n / 2;
        for (int i=0; i<halfLength; i++)
        {
            char temp = s[i];
            s[i] = s[n-1-i];
            s[n-1-i] = temp;
        }
        System.out.println(new String(s));
    }

    public static void reverseWords(String word){
        String reverseWord = new StringBuffer(word).reverse().toString();
        System.out.println(reverseWord);
    }

}

