package test.inet;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

import org.junit.Test;

public class InetTest {

	
	public void test(){
		String host = "www.wezebra.com";
		try {
			InetAddress[] addresses = InetAddress.getAllByName(host);
			for (InetAddress a : addresses) {
				System.out.println(a.getClass());
				String hostAddress = a.getHostAddress();
				String hostName = a.getHostName();
				System.out.println("hostAddress:"+hostAddress);
				System.out.println("hostName:"+hostName);
				System.out.println(a.toString());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test1(){
		String host = "www.baidu.com";
		try {
			InetAddress[] addresses = Inet6Address.getAllByName(host);
			for (InetAddress a : addresses) {
				System.out.println(a.getClass());
				System.out.println(a);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
