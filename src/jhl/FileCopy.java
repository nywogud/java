package jhl;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) throws IOException {
		String originalFileName = "D:\\lecture\\java\\src\\photo\\catAndDog.jpg";
		String targetFileName = "D:\\lecture\\java\\src\\photo\\catAndDogCopy.jpg";
		
		FileInputStream fis = new FileInputStream(originalFileName);// exe,jpg,mp 파일 가져올 때
		FileOutputStream fos = new FileOutputStream(targetFileName); 
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		while((readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes,0,readByteNo);
		}
		
		fos.flush();//반드시 실행해야 함.
		fis.close();
		fos.close();
		
		System.out.println("파일 복사 완료");
		
		
		
	}
}
