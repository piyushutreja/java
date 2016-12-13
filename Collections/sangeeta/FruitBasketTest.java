package com.sapient.fruitbasket;

public class FruitBasketTest 
{
   public static void main(String args[])
   {
	   FruitList fruitList = new FruitList();
	   fruitList.addFruit("Apple");
	   fruitList.addFruit("Banana");
	   fruitList.addFruit("Plum");
	   fruitList.addFruit("Grapes");
	   fruitList.addFruit("Lichi");
	   
	   System.out.println(fruitList.getFuitList());
	   
	   System.out.println(fruitList.searchFruite("Grapes"));
	   
	   System.out.println(fruitList.sortFruitList());
   }
}
