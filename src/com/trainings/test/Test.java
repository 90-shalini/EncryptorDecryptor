package com.trainings.test;

import java.io.IOException;

import com.tranings.decryptor.Decryptor;
import com.tranings.encryptor.Encryptor;

public class Test {


	public static void main(String[] args) {
	
		Encryptor enc = Encryptor.getInstance();
		enc.writeMessage("Hello world, this is basic encryption", ".//data//sample.txt");
		//Read from file
		Decryptor dcr = Decryptor.getInstance();
		try {
			dcr.readMessage(".//data//sample.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
