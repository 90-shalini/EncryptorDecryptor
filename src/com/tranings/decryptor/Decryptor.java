package com.tranings.decryptor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Decryptor {

		private static Decryptor decr = new Decryptor();
		private Decryptor(){			
		}
		public static Decryptor getInstance(){
			if(decr==null)
				decr = new Decryptor();
			
			return decr;
		}
		
		public void readMessage(String filePath) throws IOException{
			File file = new File(filePath);
			FileReader fr = null;
			DecryptorFileReader dfr = null;
			char[] c=new char[(int)file.length()];
			StringBuffer buffer = new StringBuffer();
				try {
				fr = new FileReader(file);
				dfr= new DecryptorFileReader(file);
				
				dfr.read(c);
				System.out.println("Decrypted Message:");
				System.out.println("==================");
				System.out.println(c);

				 
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}finally{
				fr.close();
				dfr.close();
				
			}
		
			
		}
}
