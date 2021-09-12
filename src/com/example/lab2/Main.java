package com.example.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Fruit> fl= new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		fl.add(new Fruit(101,"Apple",1000));
		fl.add(new Fruit(102,"Kiwi",1000));
		fl.add(new Fruit(103,"PineApple",8000));
		fl.add(new Fruit(104,"Peach",2000));
		fl.add(new Fruit(105,"Orange",1000));
		fl.add(new Fruit(106,"Grape",5000));
		fl.add(new Fruit(107,"Pair",3000));
		fl.add(new Fruit(108,"Banana",1500));
		fl.add(new Fruit(109,"Mango",8000));
		fl.add(new Fruit(110,"Watermelon",5000));
		
		Collections.sort(fl, new FruitComparator());
		
		for (Fruit s : fl) {
			System.out.println(s.toString());
		}

	}

}
