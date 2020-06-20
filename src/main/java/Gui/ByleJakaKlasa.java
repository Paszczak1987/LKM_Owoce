package Gui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JList;

public class ByleJakaKlasa {
	private static List<String> lista;
	private static JList jlista;
	
	static{
		lista = new ArrayList<String>();
	}
	
	public static void makeList() throws FileNotFoundException {
		
		File inputFile = new File("src/main/Java/Gui/input.txt");
		Scanner inputFileReader = new Scanner(inputFile);
		
		while (inputFileReader.hasNextLine()) {
			lista.add(inputFileReader.nextLine());
			
		}
		jlista = new JList(lista.toArray());
		jlista.setSelectedIndex(0);
		inputFileReader.close();
	}
	
	public static JList<String> getJList() {
		return jlista;
	}
	
	public static void printList() {
		for(String owoc: lista)
			System.out.println(owoc);
	}
	
}
