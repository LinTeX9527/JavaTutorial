package ch18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 在 Eclipse 启动这个程序，工作目录是当前项目主目录，在 bin/, src/ 同级目录。
 * 例如本程序中的 input.txt 需要放在 bin/, src/ 同级目录。
 * 
 * */
public class CopyFileDemo {

	public static void main(String[] args) throws IOException{
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("input.txt");
			out = new FileOutputStream("output.txt");
			
			int c;
			while( (c = in.read()) != -1 ){
				out.write(c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null){
				in.close();
			}
			
			if (out != null){
				out.close();
			}
		}
	}
}
