package jhl;

import java.util.ArrayList;

class Fruit implements Eatable{
	public String tostring() {return "Fruit";}
}

class Apple extends Fruit {public String toString() {return "apple";}}
class Grape extends Fruit {public String toString() {return "grape";}}
class Toy extends Fruit {public String toString() {return "toy";}}


interface Eatable {}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {list.add(item);}
	T get (int i) {return list.get(i);}
	int size() {return list.size();}
	public String toString() {return list.toString();}
}

public class Exam72ClassGennelicType2 {
	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>(); 
		FruitBox<Apple> appleBox = new FruitBox<Apple>(); 
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
		
//		FruitBox<Grape> appleGrapeBox = new FruitBox<Apple>(); 
//		FruitBox<fruit> xxx = new FruitBox<Apple>();
		FruitBox<Toy> toyBox = new FruitBox<Toy>();
		fruitBox.add(new Apple());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		grapeBox.add(new Grape());
		
		System.out.println("fuitBox : " + fruitBox);
		System.out.println("appleBox : " + appleBox);
		System.out.println("grapeBox : " + grapeBox);
		
		
	}
}