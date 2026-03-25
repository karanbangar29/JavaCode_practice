package com.coffeeshop.java9;

import java.io.*;

public class TryWithResources {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));

        try (br) {
            System.out.println(br.readLine());
        }
    }
}