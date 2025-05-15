package core;

import java.awt.*;

public class SubStrings {
    public static void main(String args[]){
        String str = "Chandra";
        for(int i = 0; i < str.length(); i++){
            StringBuilder subStr = new StringBuilder();
            for(int j = i; j < str.length(); j++){
                subStr.append(str.charAt(j));
                System.out.println(subStr.toString());
            }
        }
    }
}
