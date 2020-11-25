package jhl;

public class Exam040CalssObjectMethod {

	public static void main(String[] args) {
		String animal = "dog,cat,bear,tiger,elephant";
		int tmp = 1000;
		
		String justTest = "  지금 내 통장에  ";
		String justTest1 = "  만원 있습니다.  ";
		
		String[] aniArr = animal.split(",");
		for (int i =0; i<aniArr.length; i++) {
			System.out.println(aniArr[i]);
		}
		
		String str = String.join(",", aniArr);
		System.out.println(str);
		
		System.out.println(String.join("", justTest, tmp+"", justTest1));
		
		System.out.println(justTest1.trim());
		System.out.println(justTest1.strip());
		System.out.println(justTest1);
		
		
	}

}
