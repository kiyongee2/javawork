package datainputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class StringReadTest2 {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:/File/out.txt");
			byte[] bytes = new byte[1024];  //1KB
			int readByteCount = is.read(bytes); //읽은 바이트 수
			String message = new String(bytes, 0, readByteCount, "utf-8"); //디코딩 문자셋*/
			System.out.println(message);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
