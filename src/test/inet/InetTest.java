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
		String host = "www.microsoft.com";
		try {
			InetAddress[] addresses = Inet6Address.getAllByName(host);
			for (InetAddress a : addresses) {
				System.out.println(a.getClass());
				System.out.println(a);
				System.out.println(a.isReachable(100));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void test2(){
		try {
			InetAddress a = InetAddress.getByName("208.201.239.37");
			System.out.println(a);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test3(){
		try {
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println(localHost);
			System.out.println(localHost.isAnyLocalAddress());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test4(){
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
