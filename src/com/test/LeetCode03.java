package com.test;

import java.util.HashMap;
import java.util.Map;

public class LeetCode03 {

    //没有思路 --


    //public sloution
    public static int lengthOfLongestSubstring(String s) {

        Map<Integer,String> map = new HashMap<>();
        for(int i =0;i<s.length();i++){
            map.put(i,String.valueOf(s.charAt(i)));
        }
        return 0;
    }
}
