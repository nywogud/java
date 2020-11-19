package jhl2;

class Pointer2 extends Object{
	
	int x, y;
	
	Pointer2(){
		this(1,1);// 매개변수 값 업이 객체 생성했을 때 x, y 각각 1로 초기화 할 것으로 정해져 있다는 뜻
	}	//구현부에 값이 없으면 컴파일러가 자동으로 this(0,0)으로 초기화해 준다. 디폴트 생성자 없으면 컴파일러가 자동으로 0으로 세팅된 생성자를 만들어
		//준다. 단 하나의 생성자라도 있으면 안 만들어 준다.
	
	Pointer2(int x, int y){ //근데 매개변수 값을 주면, 니가 해달라는 데로 해줄게 라는 뜻
		this.x = x;
		this.y = y;
	}
	
	
	
	public String toString() {//overriding
		return "x : " + x + " y : "+ y;
	}
	
}


public class OverridingTest {

	public static void main(String[] args) {
		Pointer2 p = new Pointer2();
		System.out.println(p);
	}

}
