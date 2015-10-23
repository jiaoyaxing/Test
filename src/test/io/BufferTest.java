package test.io;

import java.nio.Buffer;
import java.nio.ByteBuffer;

import org.junit.Test;

public class BufferTest {

	@Test
	public void test(){
		ByteBuffer bb = ByteBuffer.allocate(1024);
		bb.asCharBuffer().put("hello").put(" world");
		char c;
		while((c = bb.getChar()) != 0){
			System.out.println(c);
			System.out.println(bb);
			bb.flip();
			
			bb.rewind();
			System.out.println(bb);
		}
		System.out.println(bb);
	}
	
	public void test2(){
		ByteBuffer bb = ByteBuffer.allocate(1024);
	}
}
