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
    

     /*
     Problem 709
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

     
     
    /*
    Problem 1768
    public static String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0;
        StringBuilder answer = new StringBuilder();
        boolean turn = true;
        while(i < word1.length() || j < word2.length()) {
            if(turn) {
                if(i < word1.length()) {
                    answer.append(word1.charAt(i++));
                    turn = false;
                } else {
                    while(j < word2.length()) {
                        answer.append(word2.charAt(j++));
                    }
                }
            } else {
                if(j < word2.length()) {
                    answer.append(word2.charAt(j++));
                    turn = true;
                } else {
                    while(i < word1.length()) {
                        answer.append(word1.charAt(i++));
                    }
                }
            }
        }
        return answer.toString();
    }
     */

     
    /*
    Problem 1974
    public static int minTimeToType(String word) {
        int n = word.length();
        char prev = 'a';
        int time = 0;
        for(int i=0 ; i<n ; i++){
            int x = (int)prev;
            int y = (int)word.charAt(i);
            int cost1 = Math.abs(x-y);
            int cost2 = 26-Math.abs(x-y);
            time += Math.min(cost1 , cost2) +1;
            prev = word.charAt(i);
        }
        return time;
    }
     */

     
    /*
    Problem 168
     public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            sb.append((char) ((columnNumber - 1) % 26 + 'A'));
            columnNumber = (columnNumber - 1) / 26;
        }
        return sb.reverse().toString();
    }
     */

      /*
    Problem 1668
        public static int maxRepeating(String sequence, String word) {
        int count = -1;
        String s = "";
        do
        {
            count++;
            s += word;
        }while(sequence.contains(s));
        return count;
    }
     */
   
      /*
    Problem 1374
        public static String generateTheString(int n) {
        String s = "";
        if(n%2==0)
        {for (int i = 1; i <=n ; i++) {
                if(i<=n-1)
                    s+="a";
                else
                    s+="b";}}
        else
        {for (int i = 1; i <=n ; i++) {
                s+="a";
            }}return s;
        // Second Approach
            /*
       char [] arr = new char [n];
        Arrays.fill(arr, 'a');
        if(n%2==0)
            arr[0]='b';
        return new String(arr);
        }
     */
     
      /*
     Problem 1221
         public static int balancedStringSplit(String s) {
        int count=0,ans=0;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='L')
                count++;
            else
                count--;
            if(count==0)
                ans++;
        }
        return ans;
    }
      */
    
   /*
    Problem 1684
        public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String s : words) {
            for (int i = 0; i < s.length(); i++) {
                if (!allowed.contains(String.valueOf(s.charAt(i)))) {
                    count++;
                    break;
                }
            }
        }
        return words.length-count;
    }
     */
     
      /*
    Problem 1880
     public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int c1=0,c2=0,c3=0;
        for (int i = 0; i <firstWord.length() ; i++) {
            c1=c1*10+assign(firstWord.charAt(i));
        }
        for (int i = 0; i <secondWord.length() ; i++) {
            c2=c2*10+assign(secondWord.charAt(i));
        }
        for (int i = 0; i <targetWord.length() ; i++) {
            c3=c3*10+assign(targetWord.charAt(i));
        }
        return (c1+c2)==c3;
    }
    public static int assign(char ab)
    {
        return switch (ab) {
            case 'a' -> 0;
            case 'b' -> 1;
            case 'c' -> 2;
            case 'd' -> 3;
            case 'e' -> 4;
            case 'f' -> 5;
            case 'g' -> 6;
            case 'h' -> 7;
            case 'i' -> 8;
            case 'j' -> 9;
            default -> -1;
        };
     */

     
    /*
    Problem 344
    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        solve(s, i, j);
    }
    public static void solve(char[] s, int i, int j){
        if(i >= j) return;
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        solve(s, ++i, --j);
    }
     */

     
    /*
    Problem 1859
    public static String sortSentence(String s) {
        String [] temp = s.split(" ");
        String [] st = new String[temp.length];
        String res=" ";

        for (String x: temp) {
        int index=x.charAt(x.length()-1)-'0'-1;
        st[index]=x.substring(0,x.length()-1);
        }
        return String.join(" ",st);
    }
     */
     
     
     /*
    problem 1773
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int result = 0;
        int index = ruleKey.equals("type") ? 0 : ruleKey.equals("color") ? 1 : 2;

        int length = items.size();
        for(int i = 0; i < length; i++){
            if(items.get(i).get(index).equals(ruleValue)) result++;
        }
        return result;  }
*/

     /*
    Problem 1941
    public static boolean areOccurrencesEqual(String s) {
        int arr []= new int[26];
        for (char ch:s.toCharArray()) {
            arr[ch-97]++;
        }
        int a=arr[s.charAt(0)-'a'];
        for (int i:arr) {
        if(i!=0 && a!=i)
            return false;
        }
        return true;}
     */

              /*
    Problem 1935
    public static int canBeTypedWords(String text, String brokenLetters) {
        boolean flag=true;
        int count =0;
        for(int i=0; i<text.length();i++){
            if(brokenLetters.contains(text.charAt(i)+"")){
                flag=false;
            }
            if(text.charAt(i) == ' ' || i==text.length()-1){
                if(flag){count++; }
                flag=true;
            }}
        return count;}
     */
     
     
    /*
    Problem 1844
    public static String replaceDigits(String s) {
    StringBuilder sb = new StringBuilder();
        for (int i = 0; i <s.length() ; i++) {
            if(i%2!=0){
                int digit = Character.getNumericValue(s.charAt(i));
                char need=(char)(s.charAt(i-1)+digit);
                sb.append(need);
            }
            else
            sb.append(s.charAt(i));
        }
        return sb.toString();}
    */

     
     
    /*
    387. First Unique Character in a String
    public int firstUniqChar(String s) {
        int freq[] = new int[26];
        for(int i = 0; i < s.length(); i ++)
            freq[s.charAt(i) - 'a'] ++;

        for(int i = 0; i < s.length(); i ++)
            if(freq[s.charAt(i) - 'a'] == 1)
                return i;

        return - 1;
    }
     */
     
         /*
     383. Ransom Note
     public static boolean canConstruct(String ransomNote, String magazine) {
          int [] count= new int[26];
          for (char cha: magazine.toCharArray()){
               count[cha-'a']++;
          }
          for (char cha: ransomNote.toCharArray()){
               int val=cha-'a';
               if(count[val]<=0) return false;
               count[val]--;
          }
          return true;
     }
      */

      /*
    Lexicographically smallest string // GeeksForGeeks
    static String lexicographicallySmallest(String S, int k) {
        int K=0;
        int n=S.length();
        int i=0;
        for(i=0;i<32;i++){
            if((int)Math.pow(2,i)==n){ break; }
        }
        if(i<32){ K=k/2; }
        else{K=k*2;}
        if(k>=n) return "-1";
        StringBuilder sb=new StringBuilder(S);
        for(i=0;i<K;i++){
            int j=0;
            int length=sb.length();
            if(length==0) break;
            for(j=0;j<length-1;j++){
                if(sb.charAt(j)>sb.charAt(j+1)){break;}
            }
            sb.deleteCharAt(j);
        }
        if(sb.length()!=0)return sb.toString();
        return "-1";
    }
    */
     
      /*
    Largest Number formed from an Array

    String printLargest(String[] arr) {
        Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));
        String str="";
        for(int i=0;i<arr.length;i++){
            str+=arr[i];
        }
        return str;
    }
     */
     
     /*
    43. Multiply Strings
    import java.math.BigInteger;
    public String multiply(String num1, String num2) {
        BigInteger str1 = new BigInteger(num1);
        BigInteger str2 = new BigInteger(num2);

        BigInteger ans = str1.multiply(str2);
        return ans.toString();
    }
     */

}
