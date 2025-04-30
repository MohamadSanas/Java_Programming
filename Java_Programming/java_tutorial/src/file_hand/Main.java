package file_hand;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;


public class Main {
	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("output.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("i am sanas\n");
			bw.write("file writing\n");
			
			bw.close();

			
			System.out.println("finished");
			}
			
			catch(Exception e) {
				System.out.println(e);
			}
		
		try {
			FileWriter fw1=new FileWriter("output.txt",true);
			BufferedWriter bw1=new BufferedWriter(fw1);
			bw1.write("2nd writing\n");
			
			bw1.close();

			
			System.out.println("finished 2nd");
			}
			
			catch(Exception e) {
				System.out.println(e);
			}
		
		
		try {
			FileReader fr=new FileReader("output.txt");
			BufferedReader br=new BufferedReader(fr);
			
			int ch=br.read();
			while(ch!=-1) {
				System.out.print((char)ch);
				ch=br.read();	
			}
			
			br.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		
	}

}
