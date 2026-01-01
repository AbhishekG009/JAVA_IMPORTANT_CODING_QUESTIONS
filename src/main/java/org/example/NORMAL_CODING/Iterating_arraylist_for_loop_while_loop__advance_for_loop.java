package org.example.NORMAL_CODING;
import java.util.*;

public class Iterating_arraylist_for_loop_while_loop__advance_for_loop {
    public static void IterateList(List<Integer>list)
    {
        //using for loop
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

        //using while loop
        int j=0;
        while(j< list.size())
        {
            System.out.println(list.get(j));
            j++;
        }

        //Using advanced for loop
        for(int item : list)
        {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(43);
        list.add(67);
        IterateList(list);
    }
}
