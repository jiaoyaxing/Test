package test.date;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateTest {

	@Test
	public void test(){
		Date now = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		c.add(Calendar.MINUTE, 10);
		long timeInMillis = c.getTimeInMillis();
		System.out.println(timeInMillis);
		System.out.println(System.currentTimeMillis());
		Date time = c.getTime();
		
		System.out.println(now.after(time));
	}
}
