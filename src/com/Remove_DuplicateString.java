package com;

public class Remove_DuplicateString {
   public static String duplicateS(String str)
   {
       String newString = "";
       for(int i=0;i<str.length(); i++)
       {
           char ch = str.charAt(i);
           if(newString.indexOf(ch) == -1)
           {
               newString += ch;
           }
       }
       return newString;
   }
    public static void main(String[] args) {
        String str = "abacbbccadbcd";
        System.out.println(duplicateS(str));
    }
}
