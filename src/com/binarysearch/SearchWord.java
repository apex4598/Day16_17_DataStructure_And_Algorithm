package com.binarysearch;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SearchWord {

	public static String[] fileRead(File file) throws IOException {
		String word = "";
		ArrayList<String> s1 = new ArrayList<String>();
		FileReader fileReader = new FileReader(file);
		int c;
		while ((c = fileReader.read()) != -1) {
			if (c == 32) {
				s1.add(word);
				word = "";
			} else {
				word = word + String.valueOf((char) c);
			}
		}
		fileReader.close();
		String[] s = new String[s1.size()];
		s1.toArray(s);
		return s;
	}

	public static void main(String[] args) {
		try {
			File file = new File("C:/Users/Priya.S/OneDrive/Desktop/WildLife.txt");
			String str[] = fileRead(file);
			for (String s : str) {
				System.out.println(s);
			}
			System.out.println("Enter word to search");
			String s = Search.scan.nextLine();
			int n = Search.binary(str, s);
			if (n > 0) {
				System.out.println("found");
			} else {
				System.out.println("not found");
			}
			Search.scan.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}