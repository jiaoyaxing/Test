package test.file;
import java.io.File;
import java.io.IOException;

import org.junit.Test;
public class FileTest {

	
	public void test(){
		File file = new File("D:/temp/a.csv");
		File file1 = new File("D:/temp/logs");
		System.out.println(file1.getParent());
		try {
			System.out.println(file1.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(file1.getAbsolutePath());
	}
	
	//C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib
	//C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\activation-1.1.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\aliyun-sdk-oss-2.0.3.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\aopalliance-1.0.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\app-push-1.3-SNAPSHOT.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\asm-4.0.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\bson-3.0.1.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\cglib-3.0.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\chinapnr.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\commons-beanutils-1.9.2.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\commons-codec-1.9.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\commons-collections-3.2.1.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\commons-compiler-2.7.7.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\commons-dbcp-1.2.1.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\commons-fileupload-1.3.1.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\commons-io-2.2.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\commons-jexl-2.1.1.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\commons-lang-2.6.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\commons-lang3-3.3.2.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\commons-logging-1.2.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\commons-math3-3.5.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\commons-pool-1.2.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\commons-pool2-2.0.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\dom4j-1.6.1.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\fastjson-1.2.1.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\fluent-hc-4.4.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\frame.mail1.0.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\guava-18.0.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\httpclient-4.4.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\httpclient-cache-4.3.6.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\httpcore-4.4.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\huifu-api-1.0-SNAPSHOT.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\janino-2.7.7.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\javax.mail-1.5.2.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\jcl-over-slf4j-1.7.12.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\jdom-1.1.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\jedis-2.5.1.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\jxl-2.6.10.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\jxls-2.2.7.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\jxls-jexcel-1.0.2.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\log4j-1.2.14.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\logback-classic-1.1.3.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\logback-core-1.1.3.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\mind.frame2.3.7.src.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\mybatis-3.2.6.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\mybatis-paginator-1.2.15.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\mybatis-spring-1.2.2.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\mysql-connector-java-5.1.5.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\pigeon-sms-0.5-SNAPSHOT.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\protobuf-java-2.4.1.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\shiro-core-1.2.3.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\slf4j-api-1.7.12.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\spring-aop-3.2.13.RELEASE.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\spring-beans-3.2.13.RELEASE.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\spring-context-3.2.13.RELEASE.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\spring-context-support-3.2.13.RELEASE.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\spring-core-3.2.13.RELEASE.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\spring-data-redis-1.3.6.RELEASE.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\spring-expression-3.2.13.RELEASE.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\spring-jdbc-3.2.13.RELEASE.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\spring-tx-3.2.13.RELEASE.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\spring-web-3.2.13.RELEASE.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\spring-webmvc-3.2.13.RELEASE.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\xerces-2.0.2.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\xercesImpl-2.0.2.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\xml-apis-2.0.2.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\xmlpull-1.1.3.1.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\xpp3_min-1.1.4c.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\xstream-1.4.7.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\zebraking-busi-1.0-SNAPSHOT.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\zebraking-common-1.0-SNAPSHOT.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\zebraking-dao-1.0-SNAPSHOT.jar;C:\Users\JIAOYAXING.JIAO\Desktop\zebraking-task-1.0-SNAPSHOT\lib\zebraking-domain-1.0-SNAPSHOT.jar
	@Test
	public void test2(){
		File file = new File("C:/Users/JIAOYAXING.JIAO/Desktop/lib");
		File[] listFiles = file.listFiles();
		StringBuilder sb = new StringBuilder();
		for (File f : listFiles) {
			sb
			//.append(" lib/")
			.append(f.getAbsolutePath())
			.append(";");
			//.append("\n");
		}
		System.out.println(sb.toString());
	}
}
