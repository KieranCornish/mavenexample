package com.spartaglobal.collectionExamples;

import java.util.Deque;
import java.util.LinkedList;

public class ExampleDeQueues {
    private Deque<String> carPark = new LinkedList<>();

    public ExampleDeQueues(){
        carPark.add("car1");
        carPark.add("car2");
        carPark.add("car3");
    }

    public void workingWithOurDeques(){
        for (String car: carPark){
            System.out.println(car);


        }
        System.out.println(carPark.peekLast());
        System.out.println(carPark.remove());
        System.out.println(carPark.peekFirst());
        System.out.println(carPark.peekLast());
    }
}
