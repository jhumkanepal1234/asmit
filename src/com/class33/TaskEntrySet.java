package com.class33;

import java.util.*;
public class TaskEntrySet {
    //Create a map of Best Buy store. Place
    //item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
    //Print all keys and values from a Best Buy map using EntrySet.
    
    
    public static void main(String[] args)
    {
        
        Map<String , Integer> BestBuy= new LinkedHashMap<>();
        BestBuy.put("Phone" , 999);
        BestBuy.put("Laptop" , 899);
        BestBuy.put("TV" , 1999);
        BestBuy.put("Drone" , 999);
        
        System.out.println(BestBuy);
        for(Map.Entry<String, Integer> entry : BestBuy.entrySet()) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
        
        System.out.println("///////////USING ITERATOR///////////");
        Iterator<Map.Entry<String, Integer>> it= BestBuy.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<String, Integer> ent= it.next();
            System.out.println(ent.getKey()+"="+ent.getValue());
        }
    }
}
