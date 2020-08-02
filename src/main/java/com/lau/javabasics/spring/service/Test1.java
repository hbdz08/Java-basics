package com.lau.javabasics.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.security.provider.MD2;

import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

@Service
public class Test1 {
    @Autowired
    Test test;

    public void s() {
        System.out.println(test);

    }

    public static void main(String[] args) {
        String a = "73.25";
        for (int i = 0; i < 100000000; i++) {
            a = MD2(a);
            System.out.println(i);
        }


    }
    public static String MD2(String src) {
        try {
// 獲取MD2加密工具
            MessageDigest md = MessageDigest.getInstance("MD2");
// 加密
            byte[] digest = md.digest(src.getBytes(StandardCharsets.UTF_8));
// 獲取二進位制十六進位制互轉工具
            HexBinaryAdapter hexBinaryAdapter = new HexBinaryAdapter();
// 將二進位制陣列轉換為十六進位制字串
            String marshal = hexBinaryAdapter.marshal(digest);
// 輸出結果
            System.out.println(marshal);
            return marshal;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public final static String MD5(String s) {
        try {
            byte[] btInput = s.getBytes(StandardCharsets.UTF_8);
            MessageDigest mdInst = MessageDigest.getInstance("MD4");
            mdInst.update(btInput);
            byte[] md = mdInst.digest();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < md.length; i++) {
                int val = ((int) md[i]) & 0xff;
                if (val < 16)
                    sb.append("0");
                sb.append(Integer.toHexString(val));

            }
            return sb.toString();
        } catch (Exception e) {
            return null;
        }
    }
}
