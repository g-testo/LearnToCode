package com.gt;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Magma");
        arrayList.add("Granite");
        arrayList.add("Lava");
        arrayList.add("Ash");

        arrayList.set(0, "Obsidian");

        Collections.sort(arrayList);
//        System.out.println("Length: " + arrayList.size());
//        String removedEl = arrayList.remove(arrayList.size() - 1);

//        System.out.println("Length: " + arrayList.size());

//        System.out.println("Removed Element: " + removedEl);

        for(int i=0;i<arrayList.size();i++){
            System.out.println("Volcano Term: " + arrayList.get(i));
        }

        System.out.println(arrayList);

    }
}