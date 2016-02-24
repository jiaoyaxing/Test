package test.socket;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class LowPortScanner {

	public static void main(String[] args) {
		String host = "localhost";
		for (int i = 0; i < 1024; i++) {
			try {
				Socket s = new Socket(host,i);
				System.out.println("there is a server on port " + i);
			} catch (UnknownHostException e) {
				//e.printStackTrace();
			} catch (IOException e) {
				//e.printStackTrace();
				System.err.println("on server on port " + i);
			}
		}
	}
}
