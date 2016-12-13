package com.sapient.fruitbasket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FruitList 
{
   private List<String> list = new ArrayList<String>();
   
   public void addFruit(String fruiteName)
   {
	   list.add(fruiteName);
   }
   
   public boolean searchFruite(String fruiteName)
   {
	   return list.contains(fruiteName);
   }
   
   public List<String> sortFruitList()
   {
	   Collections.sort(list);
	   return list;
   }
   
   public List<String> getFuitList()
   {
	   return list;
   }
}