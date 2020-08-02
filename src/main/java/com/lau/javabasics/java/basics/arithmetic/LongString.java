package com.lau.javabasics.java.basics.arithmetic;

import java.util.HashSet;
import java.util.Set;

public class LongString {
    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        Set<Character> set = new HashSet<>();
        int size = 0;
        int rk = -1;
        for (int i = 0; i < s.length(); ++i) {
            if (i != 0) {
                set.remove(s.charAt(i - 1));
            }
            while (rk + 1 < s.length() && !set.contains(s.charAt(rk+ 1))) {
                set.add(s.charAt(rk + 1));
                rk++;
            }
            // 第 i 到 rk 个字符是一个极长的无重复字符子串
            size = Math.max(size, rk - i + 1);
        }
        return size;

    }

    public static void main(String[] args) {
        int i = lengthOfLongestSubstring("");
        System.out.println(i    );


    }
}
