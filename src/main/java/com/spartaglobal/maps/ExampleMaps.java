package com.spartaglobal.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ExampleMaps {
    private Map<Integer, String> studentInClass = new HashMap<>();
    public ExampleMaps(){
        studentInClass.put(1, "ed");
        studentInClass.put(2, "nik");
        studentInClass.put(3, "fabio");
    }

    public String returnValue(int keyNum){
        return studentInClass.get(keyNum);
    }

    public void loopThroughMap(){
        Collection<String> values = studentInClass.values();
            for (String data: values) {
                System.out.println(data);
            }
    }
}
