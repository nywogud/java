//실제 어플리케이션에서 이렇게까지 구현하지 않음

package jhl;

import java.util.ArrayList;

class Fruit2 {public String toString() {return "Fruit2";}}
class Apple2 extends Fruit2 {public String toString() {return "apple";}}
class Grape2 extends Fruit2 {public String toString() {return "grape";}}

class FruitBox2<T extends Fruit2 > extends Box2<T> {}

class Box2<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {list.add(item);}
	T get (int i) {return list.get(i);}
	int size() {return list.size();}
	public String toString() {return list.toString();}
}

class Juice {
	String name;
	
	Juice (String name){
		this.name = this.name + "Juice";
	}
}

class Juicer {
	static Juice makeJuice(FruitBox2<? extends Fruit2> box) {
		String tmp = "";
//		for (Fruit2 f : box.get)
	}
}

public class Exam74ClassGennelicType {
	public static void main(String[] args) {
		FruitBox2<Fruit> fruitBox = new FruitBox2<Fruit>(); 
		FruitBox2<Apple> appleBox = new FruitBox2<Apple>(); 
		FruitBox2<Grape> grapeBox = new FruitBox2<Grape>();
		
//		FruitBox<Grape> appleGrapeBox = new FruitBox<Apple>(); 
//		FruitBox<fruit> xxx = new FruitBox<Apple>();
		
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