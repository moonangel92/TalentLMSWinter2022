package com.digital;

public class Practice1 {
    public static String doubleChar(String str) {
        String result = "";
        for(int i = 0; i <str.length(); i++){
            result = result + str.charAt(i) + str.charAt(i);

        }
        return result;
    }
}
