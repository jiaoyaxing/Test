package test.string;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5Utils {

	public static String md5(String src) {
		String charset = "UTF-8";
		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			md5.update(src.getBytes(charset));
			String result = "";
			byte[] temp;
			temp = md5.digest();
			for (int i = 0; i < temp.length; i++) {
				result += Integer.toHexString(
						(0x000000ff & temp[i]) | 0xffffff00).substring(6);
			}
			return result;

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args){
		String s = "renzhenshiyizhongtaidu";
		String md5 = md5(s);
		System.out.println(md5);
	}

}
