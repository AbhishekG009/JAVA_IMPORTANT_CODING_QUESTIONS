package org.example.NORMAL_CODING;

import java.util.Iterator;
import java.util.Map;

public class Iterrate_hASHMAP_using_while_and_advanced_for_loop {

    public void iterateHashMap(Map<String, String> map)
    {
        //using advanced for loop
        for(Map.Entry<String, String> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " -> "+ entry.getValue());
        }


        //using while-loop with iterator
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext())
        {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + "-> " + entry.getValue());
        }
    }
}
