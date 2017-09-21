/**
 * 
 */
package map;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;


/**
 * @author ellsc
 *
 */
public class Seatmap {
	
	
	/**
	 * @param args
	 */
	public Seatmap(String filename) {
		readFile(filename);
	}
	
	public void readFile(String filename) {
	    File dataFile = new File(filename);
	    File dataFile2 = new File(filename); 
		try {
			Scanner input = new Scanner(dataFile);
			int row = 0,collum = 0,totalnum = 0;
			while(input.hasNextLine()) {
				input.nextLine();
				totalnum++;
			}
			if(totalnum %2 == 0) {
				row = 5;
				collum = totalnum/row;
			}
			else {
				row = 5;
				collum = totalnum/row + totalnum%row;
			}
			String[][] seatNames= new String[row][collum];
			System.out.println(seatNames.length);
			input.close();
			input = new Scanner(dataFile2);
			System.out.println(input.hasNextLine());
			
				for(int Arow = 0 ; Arow < seatNames.length;row++) {
					for (int Acollum = 0; Acollum < seatNames.length; Acollum++) {
						String name = "kkkk";
						seatNames[Arow][Acollum] = name;
					}
				}
			
			for(int Arow = 0 ; Arow < seatNames.length;row++) {
				for (int Acollum = 0; Acollum < seatNames.length; Acollum++) {
					System.out.printf("|%s|",seatNames[Arow][Acollum]);
				}
				System.out.println();
			}
			System.out.println("exit loop");
			input.close(); 
				    
			
		} catch (FileNotFoundException e) {
			System.out.println("File Not found");
			e.printStackTrace();}
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Seatmap stuMap = new Seatmap("names.dat");
	}

}
