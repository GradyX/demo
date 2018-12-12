package redisclient;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parser {

	public static void readFile() throws IOException {
		File file = new File("backup.txt");
		FileInputStream fin = new FileInputStream(file);
		InputStreamReader rin = new InputStreamReader(fin);
		BufferedReader bin = new BufferedReader(rin);
		String line;
		StringBuffer rows = new StringBuffer("insert into t_fund_channel_group values ");
		String row = "";
		int i = 0;
		int j = 1;
		while((line = bin.readLine()) != null) {
			i++;
			if(line.charAt(0) == ' ') {
				if(i == 1) {
					row += "(" + line.split("=")[1];
				}
				else {
					row += "," + line.split("=")[1];
				}
				if(i == 6) {
					row += "),\n";
					//(j++) 
					rows.append(row);
					//System.out.println(row);
				}
			}
			else {
				i = 0;
				row = "";
			}
		}
		System.out.println(rows.substring(0, rows.length()-2));
		
	}
	
	public static void main(String []args) {
		try {
			readFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
