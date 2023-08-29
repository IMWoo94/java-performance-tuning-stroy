package com.perf.nio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class BasicIOReadUtil {
	public static ArrayList readCharStream(String fileName) throws Exception{
		ArrayList<StringBuffer> list = new ArrayList<>();
		try(FileReader fr = new FileReader(fileName)) {
			int data = 0;
			// 한줄 씩 데이터를 담을 StringBuffer 생성
			StringBuffer sb = new StringBuffer();
			while((data=fr.read()) != -1){
				if(data == '\n' || data == '\r'){
					list.add(sb);
					sb=new StringBuffer();
				}else{
					sb.append((char)data);
				}
			}
		}catch (IOException e){
			System.err.println(e.getMessage());
			throw e;
		}catch (Exception e){
			System.err.println(e.getMessage());
			throw e;
		}
		return list;
	}

	public static String readCharStreamWithBuffer(String fileName) throws Exception{
		StringBuffer sb = new StringBuffer();
		try(FileReader fr = new FileReader(fileName)){
			int bufferSize = 1024*1024;
			char readBuffer[] = new char[bufferSize];
			int resultSize = 0;

			while((resultSize = fr.read(readBuffer)) != -1){
				if(resultSize == bufferSize){
					sb.append(readBuffer);
				}else{
					for(int i =0; i<resultSize; i++){
						sb.append(readBuffer[i]);
					}
				}
			}

		}catch (IOException e){
			System.err.println(e.getMessage());
			throw e;
		}catch (Exception e){
			System.err.println(e.getMessage());
			throw e;
		}

		return sb.toString();
	}

	public static ArrayList<String> readBufferedReader(String fileName) throws Exception{
		ArrayList<String> list = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
			String data;
			while((data= br.readLine())!=null){
				list.add(data);
			}
		}catch (IOException e){
			System.err.println(e.getMessage());
			throw e;
		}catch (Exception e){
			System.err.println(e.getMessage());
			throw e;
		}

		return list;
	}

	public static void main(String[] args) throws Exception {
		String fileName = "C:\\10MBFile";
		// StopWatch sw = new StopWatch();
		// sw.start();
		ArrayList list1 = BasicIOReadUtil.readCharStream(fileName);
		// System.out.println(sw);
		System.out.println(list1.size());
	}
}
