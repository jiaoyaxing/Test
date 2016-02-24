package test.socket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class LowPortScanner2 {

	public static void main(String[] args) {
		String host = "localhost";
		for (int i = 0; i < 1024; i++) {
			try {
				InetAddress add = InetAddress.getByName(host);
				Socket s = new Socket(add,i);
				System.out.println("-- there is a server on port " + i);
			} catch (UnknownHostException e) {
				//e.printStackTrace();
			} catch (IOException e) {
				//e.printStackTrace();
				System.err.println("-- no server on port " + i);
			}
		}
	}
}
