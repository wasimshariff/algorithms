package stringmanipulation;

import java.util.Arrays;

public class SubStringSort {

   public static void main(String a[]) {
       String test = "ooneefspd";
       int startIndex = 0;
       int endIndex = 8;

       int length = test.length();
        char chars[] = new char[endIndex-startIndex + 1];
       for ( int i = 0; i <= chars.length-1;i++) {
           chars[i] = test.charAt(startIndex);
           startIndex++;
       }
       System.out.println(new String(chars));
       char ch = 70;
       int n  = ch;
       System.out.println(ch);

       char k = 'b';
       char m = 'p';
       System.out.println(k < m);

       System.out.println(n);
      // int i = 1;

       int finalSorted = chars.length-1;

       while(finalSorted >= 0) {

          for( int i =0,j =1 ; i < j && j <= finalSorted ; i++,j++  ) {
               if( chars[i] < chars[j]) {
                   char temp = chars[i];
                   chars[i] = chars[j];
                   chars[j] = temp;
               }
           }
        finalSorted--;
       }

       System.out.println(new String(chars));

   }

}
