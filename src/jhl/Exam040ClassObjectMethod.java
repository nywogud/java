package jhl;

import java.util.Objects;

class Value extends Object{
	int value;
	
	Value(int value){
		this.value = value;
	}
	
//	public int Hashcode() {
//		return Objects.hash(value);
//	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Value other = (Value) obj;
		if (value != other.value)
			return false;
		return true;
	}
}

public class Exam040ClassObjectMethod {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		
		System.out.println("str1 : " + str1);
		System.out.println("str3 : " + str3);
		
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		
		
		if (v1.equals(v2)) {
			System.out.println("같음.");
		}else {
			System.out.println("다름");
		}

		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
	}

}
