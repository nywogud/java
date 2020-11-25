package jhl;

class  Product {
	static int count = 0;
	int serialNo;
	
	{ //인스턴스 생성자 블록 : 모든 생성자에서 공통적으로 수행
		++count;
		serialNo=count;
	}
	
	public Product() {} // 디폴트 생성자
	
	
}

public class Ex012_class_count_instance_number {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1의 제품번호 : " + p1.serialNo);
		System.out.println("p2의 제품번호 : " + p2.serialNo);
		System.out.println("p3의 제품번호 : " + p3.serialNo);
		System.out.println("생성된 인스턴스의 개수는  : " + Product.count);//static 변수는 '클래스이름.변수'로 접근
				
	}

}
