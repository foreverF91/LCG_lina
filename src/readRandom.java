import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;
import javax.sound.sampled.Line;
import javax.swing.text.AbstractDocument.BranchElement;

public class readRandom {
	public readRandom() {
		
	}
	
	public ArrayList<Integer> read() {
		ArrayList<Integer> result = new ArrayList<>();
		try {
			BufferedReader bReader = new BufferedReader(new FileReader("random_numbers.txt"));
			String number = bReader.readLine();
			while(number != null) {
				Scanner in = new Scanner(number);
				int a;
				a = in.nextInt();
				result.add(a);
				for (int i = 0; i < 4; i++) {
					a = in.nextInt();
					result.add(a);
				}
				number = bReader.readLine();
			}
			
			System.out.println(result);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
		
	}
}
