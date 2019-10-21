package com.spartaglobal.collectionExamples;

import java.util.HashSet;
import java.util.Set;

public class ExampleSets {

    private Set<String> newSet = new HashSet<String>();
    public void workingWithOurSet(){
        newSet.add("Cheese");
        newSet.add("Beer");
        newSet.add("Bread");

    }
    public void printSet(){
        System.out.println(newSet.contains("Bread"));

        for (String shoppingItem: newSet){
            System.out.println(shoppingItem);
        }
    }
}
