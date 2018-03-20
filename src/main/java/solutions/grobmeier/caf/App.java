package solutions.grobmeier.caf;

import java.io.BufferedReader;
import java.io.FileReader;

public class App {

	// TODO: should work as parameter
	private static final String FILENAME = "mattygroves.txt";

	public static void main(String[] args) throws Exception {
		System.out.println("Reading file");

		BufferedReader br = null;
		FileReader fr = null;

		fr = new FileReader(FILENAME);
		br = new BufferedReader(fr);

		String mattyGrovesLyricsLine;
		while ((mattyGrovesLyricsLine = br.readLine()) != null) {
			LyricsLine.line = mattyGrovesLyricsLine;
			LyricsLine.enableLineNumbers(); // TODO: does not work
			LyricsLine.printStuff();
		}
	
		try {
			if (br != null)
				br.close();
			if (fr != null)
				fr.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
