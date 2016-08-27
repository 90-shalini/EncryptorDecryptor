package com.tranings.decryptor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DecryptorFileReader extends FileReader {

	public DecryptorFileReader(File file) throws FileNotFoundException {
		super(file);
	}

	@Override
	public int read(char[] cbuf) throws IOException {
		int x = super.read(cbuf);
		decryptMessage(cbuf);
		return x;
	}


	//decryption logic, reverse of encryption
	public void decryptMessage(char[] cbuf){
		for(int i=0; i<cbuf.length; i++){
			if((int)(cbuf[i]) == 32){
				cbuf[i] = ' ';
			}
			else
				cbuf[i] = (char)(cbuf[i]-3);
		}

	}

	

}
