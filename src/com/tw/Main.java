package com.tw;

import java.io.FileInputStream;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws  Exception {
        System.out.println("Hello World");
        HeapSort heapSort = new HeapSort();
        Properties prop=new Properties();
        FileInputStream fs=new FileInputStream("./src/resource/sorting.properties");
        prop.load(fs);
        int[] array = new int[] {1,3,11,14,100, 100, -2, 0};
        heapSort.sort(array);
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println("Done with sorting");
        System.out.println("String from properties file "+ prop.getProperty("name") );
    }
}