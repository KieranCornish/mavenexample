package com.spartaglobal.collectionExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleLists {
    private List<String> hobbies = new ArrayList<String>();

    public ExampleLists() {
        workingWithOurList();
    }

    private void workingWithOurList(){
        hobbies.add("Football");
        hobbies.add("Basketball");
        hobbies.add("Playing video games");
    }
    public void printList(){
        System.out.println("we're using the iterator ... ");
        for (Iterator<String> iterator = hobbies.iterator(); iterator.hasNext();){
    String element = iterator.next();
            System.out.println(element);
        }
    }
}
