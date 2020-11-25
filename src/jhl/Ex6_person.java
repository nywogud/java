package jhl;

class person{

	//instance values
	String pull_name;
	int age;
	String gender;
	String address;
	int deposit;

	//생성자 함수
//	person(){}

	// local values를 instance values에 assign
	person(String pull_name, int age, String gender, 
			String address, int deposit){
		this.pull_name = pull_name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.deposit = deposit;
	}

}

public class Ex6_person {

	public static void main(String[] args) {
		
		person jason = new person("jason Bean", 20, "man", "seoul", 100000);
		
		System.out.println(jason.pull_name +" "+ jason.age +" "+ 
		jason.gender +" "+ jason.address +" "+ jason.deposit);
		
	}

}
