package com.myapps;

import java.util.Arrays;

public class CustomArrayList {

    private int[] items;
    private int count;

    public CustomArrayList() {
        items = new int[5];
    }

    public void add(int item){
        items[count++] = item;
    }

    public void print(){
        Arrays.stream(items).forEach(item->{
            System.out.printf("%s ",item);
        });
    }

    public static void main(String[] args) {
        CustomArrayList customArrayList = new CustomArrayList();
        customArrayList.add(1);
        customArrayList.add(2);
        customArrayList.print();
    }
}
