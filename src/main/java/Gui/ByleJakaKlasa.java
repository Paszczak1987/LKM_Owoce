package Gui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ByleJakaKlasa {
	private static List<String> lista;
	static{
		lista = new ArrayList<String>();
	}
	
	public static void makeList() throws FileNotFoundException {
		
		File inputFile = new File("src/main/Java/Gui/input.txt");
		Scanner inputFileReader = new Scanner(inputFile);
		
		while (inputFileReader.hasNextLine()) {
			lista.add(inputFileReader.nextLine());
		}
		
		inputFileReader.close();
	}
	
	public static void printList() {
		for(String owoc: lista)
			System.out.println(owoc);
	}
	
}
