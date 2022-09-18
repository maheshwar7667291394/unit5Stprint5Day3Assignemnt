package file3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class Fileriter {
	
	public static void main(String[] args) throws IOException {
		
	 File f=new File("abcd.text");  
	 
	  try {
		FileWriter fr=new FileWriter(f);
		PrintWriter pr=new PrintWriter(fr);
	
		pr.println("maehsh");
		int[] num1= {100,80,30,40,60};
		for(int i=0;i<num1.length;i++) {
			pr.println(num1[i]);
		}

		pr.println("ramkripal");
		int[] num2= {110,300,700,50,100};
		for(int i=0;i<num1.length;i++) {
			pr.println(num1[i]);
		}
		
	    
	    
	  
	    pr.flush();
	    pr.close();
		
	} catch (IOException e) {
	
		e.printStackTrace();
	}
	  
	  FileReader fred=new FileReader(f);
	  BufferedReader bred=new BufferedReader(fred);
	   int i=(int)f.length();
	   for(int k=0;k<2;k++) {
		   String name=bred.readLine();
		
		   int sum=0;
		   for(int j=0;j<5;j++) {
			   sum+=Integer.parseInt(bred.readLine());
		   }
		   System.out.println(name);
		   System.out.println(sum);
	   }
	 }
	
}
