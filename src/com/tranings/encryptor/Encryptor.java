package com.tranings.encryptor;

import java.io.File;
import java.io.IOException;

public class Encryptor {
	private static Encryptor enc = new Encryptor();
	private Encryptor(){}
	public static Encryptor getInstance(){
		if(enc==null)
			enc = new Encryptor();
		return enc;
	}
	
	
	
	public void writeMessage(String message, String filePath){
		EncryptFileWriter fw = null;
		char[] chars = message.toCharArray();
		File file = new File(filePath);
		try {
			fw = new EncryptFileWriter(file,true);
			for(char c:chars)
				fw.write(c);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(fw!=null){
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			}
	}




}

