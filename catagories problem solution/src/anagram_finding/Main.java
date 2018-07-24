package anagram_finding;
 
import java.util.Arrays;
 
public class Main {
 
    public static void main(String[] args) {
 
        System.out.println(isAnagram("goggle", "google"));
        System.out.println(isAnagram("goggle", "ggogle"));
        System.out.println(isAnagram("goggle", "goeglg"));
        System.out.println(isAnagram("body", "bdoy"));
        System.out.println(isAnagram("goggle", "goggle"));
 
        System.out.println();
 
        System.out.println(isAnagram2("goggle", "google"));
        System.out.println(isAnagram2("goggle", "ggogle"));
        System.out.println(isAnagram2("goggle", "goeglg"));
        System.out.println(isAnagram2("body", "bdoy"));
        System.out.println(isAnagram2("goggle", "goggle"));
 
    }
 
    /*
     * If two strings are anagram then after sorting they will be look same
     */
    public static boolean isAnagram2(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
 
        if (len1 != len2) {
            return false;
        }
 
        s1 = s1.replaceAll(" ", "");
        s2 = s2.replaceAll(" ", "");
 
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
 
        Arrays.sort(ch1);
        Arrays.sort(ch2);
 
        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] != ch2[i]) {
                return false;
            }
        }
 
        return true;
 
    }
 
    /*
     * if two string are anagram then , there will be exactly same number of
     * each character
     */
    public static boolean isAnagram(String s1, String s2) {
 
        int len1 = s1.length();
        int len2 = s2.length();
 
        if (len1 != len2) {
            return false;
        }
 
        int[] characterCount1 = new int[52];
        int[] characterCount2 = new int[52];
 
        for (int i = 0; i < len1; i++) {
            char ch = s1.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                characterCount1[ch - 'a']++;
            } else if ('A' <= ch && ch <= 'Z') {
                characterCount1[ch - 'A' + 26]++;
            }
        }
 
        for (int i = 0; i < len2; i++) {
            char ch = s2.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                characterCount2[ch - 'a']++;
            } else if ('A' <= ch && ch <= 'Z') {
                characterCount2[ch - 'A' + 26]++;
            }
        }
 
        for (int i = 0; i < characterCount1.length; i++) {
            if (characterCount1[i] != characterCount2[i]) {
                return false;
            }
        }
 
        return true;
 
    }
 
}