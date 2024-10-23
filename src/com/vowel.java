package com;

public class vowel {
    public static void main(String[] args) {
        int index = 0;
        char newStr[] = new char[10];
        int s = 0;
        String str = "mayasir";
        for(int i=0; i<str.length(); i++ ){
            if(str.charAt(i) == 'a'  || str.charAt(i) == 'e') {
                index = i;
                for(int j=0; j<i; j++){

                    newStr[s++] = str.charAt(j);
                }
            }
        }

        for(int i=0; i<newStr.length; i++){
            System.out.println(newStr[i]);
        }


    }
}

