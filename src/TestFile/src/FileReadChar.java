package TestFile.src;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadChar {

	public static void countChar(String[] args) {
		int charChar = 0; //���Ͽ��� char ������ �д´�. �ڷ� Ÿ���� ��Ƽ��
		int charCnt = 0; //���Ͽ� �ִ� ���� ��
		int spaceCnt = 0; // ���Ͽ� ��� �ִ� �����̽� ���� ��

		try {
			FileReader fileReader = new FileReader("C:\\Users\\jhl\\Desktop\\test.txt");
			while((charChar=fileReader.read())!=-1) {
				if (charChar==32) {spaceCnt++;}
				if (charChar!=32) {charCnt++;}
			}
			fileReader.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("\r test.txt�� �ִ� ������ : " + spaceCnt);
		System.out.println("\r test.txt�� �ִ� ���ڼ��� : " + charCnt);
		System.out.println("\r test.txt�� �ִ� �� ���ڼ��� : " + (spaceCnt+charCnt));

	}

}
