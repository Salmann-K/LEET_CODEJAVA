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


}
