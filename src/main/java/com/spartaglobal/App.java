package com.spartaglobal;

import com.spartaglobal.collectionExamples.ExampleDeQueues;
import com.spartaglobal.collectionExamples.ExampleLists;
import com.spartaglobal.collectionExamples.ExampleQueues;
import com.spartaglobal.collectionExamples.ExampleSets;
import com.spartaglobal.maps.ExampleMaps;
import com.spartaglobal.mavenexample.JavaAPIExamples;

import java.util.Queue;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        ExampleSets exampleSets = new ExampleSets();
//        exampleSets.workingWithOurSet();
//        exampleSets.printSet();

//        ExampleLists exampleLists = new ExampleLists();
//        exampleLists.printList();

//        ExampleQueues exampleQueues = new ExampleQueues();
//        exampleQueues.queueRunner();

//        ExampleDeQueues exampleDeQueues = new ExampleDeQueues();
//        exampleDeQueues.workingWithOurDeques();

        ExampleMaps exampleMaps = new ExampleMaps();
        System.out.println(exampleMaps.returnValue(2));
        exampleMaps.loopThroughMap();

//        System.out.println( "Hello World!" );
    }
//    JavaAPIExamples APIExample = new JavaAPIExamples();
//    APIExample.dateTimer();
}
