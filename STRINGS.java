package com.company.UPLOAD;

public class STRINGS {

     /*
    problem 2011;
    public static int finalValueAfterOperations(String[] operations)
    {
        int x=0;
        for (int i = 0; i <operations.length ; i++) {
            if(operations[i].equals("X++") || operations[i].equals("++X"))
                x++;
            else
                x--;
        }
        return x;
    }
     */
    /*
    problem- 2114
    public static int mostWordsFound(String [] sentences) {
        int max=0;
        for (int j = 0; j < sentences.length; j++) {
            max=Math.max(sentences[j].split(" ").length,max);
        }

        return max;
    }
     */

    /*
        problem 1528;
        public static String restoreString(String s, int[] indices) {
        char[] t = new char[s.length()];
        for(int i = 0;i<t.length;i++){
            t[indices[i]] = s.charAt(i);
        }
        return String.valueOf(t);
    }
     */
     
     
    /*
    problem - 1108

    public static String defangIPaddr(String address) {
        StringBuilder str = new StringBuilder("");
        for(int i = 0; i < address.length(); ++i)
        {
            if(address.charAt(i) == '.')
                str.append("[.]");
            else
                str.append(address.charAt(i));
        }

        return str.toString();
    }
     */

    /*
    // Problem 1678
     public static String interpret(String command) {
        int size = command.length() - 1, count = 0;
        StringBuilder str = new StringBuilder();
        while (count <= size) {
            char ch = command.charAt(count);
            if (ch == 'G') {
                str.append("G");
                count++;
            } else if (ch == '(') {
                if (command.charAt(count + 1) == ')') {
                    str.append("o");
                    count += 2;
                } else {
                    str.append("al");
                    count += 4;
                }
            }
        }
        return str.toString();
    }
     */
     
     
    /*
    problem 1662
public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    String a="";
    String b="";
        for (int i = 0; i < word1.length ; i++) {
            a=a+word1[i];
        }
        for (int i = 0; i < word2.length ; i++) {
            b=b+word2[i];
        }
        return b.equals(a);
    }

    or

       public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("",word1).equals(String.join("",word2));
    }

     */

    /*
    problem 709
     /*
     public static String toLowerCase(String s) {
        return s.toLowerCase();
    }
     */

    /*
    problem 1704
     public static boolean halvesAreAlike(String s) {
    int a=s.length();
    String s1 = s.substring(0,a/2);
    String s2 = s.substring(a/2,a);
    int c1=0,c2=0;
        for (int i = 0; i <s1.length() ; i++) {
            if("AEIOUaeiou".indexOf(s1.charAt(i))>=0)
                c1++;
            if("AEIOUaeiou".indexOf(s2.charAt(i))>=0)
                c2++;
        }
        return c1==c2;
    }
     */
     
     
    /*
    problem 1967
      public static int numOfStrings(String[] patterns, String word) {
        int c=0;
        for(String pattern: patterns)
            if(word.contains(pattern)) c++;
        return c;
    }
     */


      /*
    Problem 657
    public static boolean judgeCircle(String moves) {
        int x=0,y=0;
        for (int i = 0; i <moves.length() ; i++) {
            switch (moves.charAt(i)) {
                case 'R' -> x++;
                case 'L' -> x--;
                case 'U' -> y++;
                case 'D' -> y--;
            }
        }
       return (x==0 && y==0);
    }
     */
     
         /*
    Problem 557
      public static String reverseWords(String s) {
        int index = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' ) {
                result.insert(i, ' ');
                index = i + 1;

            } else
                result.insert(index, s.charAt(i));
        }
        return result.toString();
    }
     */

      
     
    /*
    Problem 28
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
     */

    /*
    Problem !25
      public static boolean isPalindrome(String s) {
        StringBuilder content = new StringBuilder();
        for(int i = 0; i < s.length(); i++)
            if(Character.isLetterOrDigit(s.charAt(i)))
                content.append(s.charAt(i));
        content = new StringBuilder(content.toString().replace(" ", "").toLowerCase());
        String value = content.toString();
        return value.equals(content.reverse().toString());
    }
     */
     
     
    /*
    Problem 14
public static String longestCommonPrefix(String[] strs) {
        String shortest = "";
        int shortestL = Integer.MAX_VALUE;
        int index = 0;
        for(int i = 0; i < strs.length; i++){
            if(strs[i].length() < shortestL){
                shortest = strs[i];
                shortestL = shortest.length();
                index = i;
            }
        }

        for(int i = 0; i < strs.length; i++){
            if(i == index){
                continue;
            }

            for(int j = 0; j < shortest.length(); j++){
                if(strs[i].charAt(j) != shortest.charAt(j)){
                    shortest = shortest.substring(0, j);
                }
            }
        }
        return shortest;
    }

     */


     
    /*
    Problem 58
     public static int lengthOfLastWord(String s) {
        String a=s.strip();
        int b= a.length()-1;
        int c=a.lastIndexOf(" ");
        int d=b-c;
        return d;
    }
     */

    /*
    Problem 1784
    public static boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }
     */

     
     
    /*
    Problem 771
      public static int numJewelsInStones(String jewels, String stones) {
        int c=0;
        for (int i = 0; i <stones.length() ; i++) {
            if(jewels.indexOf(stones.charAt(i))>=0)
                c++;
        }
        return c;
    }
     */
     
     
     
    /*
    Problem 1832
      public static boolean checkIfPangram(String sentence) {
        for(char i='a'; i<='z'; i++)
        {
            if(!sentence.contains(String.valueOf(i)))
                return false;
        }
        return true;
    }
     */

      
     
    /*
    Problem 1816
  public static String truncateSentence(String s, int k) {
    String [] s1= s.split(" ");
    String out="";
        for (int i = 0; i <k ; i++) {
            out += s1[i] + " ";
        }
        return out.trim();
    }
     */
     
     
    /*
    Problem 2108
      public static String firstPalindrome(String[] words) {
        StringBuilder check = new StringBuilder();
        for (String word : words) {
            check.append(word);
            if (String.valueOf(check).equals(String.valueOf(check.reverse()))) {
                return check.toString();
            }
            check.setLength(0);
        }
        return "";
    }
     */
     
      /*
    Problem 13
        public static int romanToInt(String s) {
        int res=0;
        for (int i = 0; i <s.length() ; ++i) {
            int preChar = (i > 0) ? valueOf(s.charAt(i - 1)) : 0;
            int curChar = valueOf(s.charAt(i));

            if (preChar < curChar) {
                res = res + curChar - 2 * preChar;
            } else {
                res += curChar;
            }
        }
        return res;
        }
    public static int valueOf(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        };
        return 0;
    }
     */
     
     
    /*
    Problem 1812
     public static boolean squareIsWhite(String coordinates) {
        int a = changeto(coordinates.charAt(0));
        int b = coordinates.charAt(1);
        return (a+b)%2!=0;
    }
    public static int changeto(char ch)
    {
        return switch (ch) {
            case 'a' -> 1;
            case 'b' -> 2;
            case 'c' -> 3;
            case 'd' -> 4;
            case 'e' -> 5;
            case 'f' -> 6;
            case 'g' -> 7;
            case 'h' -> 8;
            default -> 0;
        };
    }
     */

     
}
