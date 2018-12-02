package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		InputStreamReader isr =	null;
		try {
			FileInputStream fis = new FileInputStream("ms949.txt");
			isr = new InputStreamReader(fis, "MS949");
		} catch (IOException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				if(isr != null) {
					isr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
