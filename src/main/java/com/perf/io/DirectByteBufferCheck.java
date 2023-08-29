package com.perf.io;

import java.nio.ByteBuffer;

public class DirectByteBufferCheck {
	public static void main(String[] args) {
		DirectByteBufferCheck check = new DirectByteBufferCheck();
		for(int i = 0; i < 1024000; i++){
			check.getDirectByteBuffer();
			if(i % 100 == 0){
				System.out.println(i);
			}
		}
	}
	public ByteBuffer getDirectByteBuffer(){
		ByteBuffer buffer;
		buffer = ByteBuffer.allocateDirect(65536);
		return buffer;
	}
}
