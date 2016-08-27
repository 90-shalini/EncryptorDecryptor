package com.tranings.encryptor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EncryptFileWriter extends FileWriter {


	public EncryptFileWriter(File file) throws IOException {
		super(file);
		// TODO Auto-generated constructor stub
	}

	public EncryptFileWriter(File file, boolean b) throws IOException {
		// TODO Auto-generated constructor stub
		super(file,b);
	}

	@Override
	public void write(int c) throws IOException {
		// TODO Auto-generated method stub
		c= encryptMessage(c);
		super.write(c);
	}


	public int encryptMessage(int c){
		if(c==32)
			return c;
		else			
			return c+3;
	}

}
