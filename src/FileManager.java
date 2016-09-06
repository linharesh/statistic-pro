import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileManager {
	
	private String fileName;
	private String filePath;
	
	public String readFile() throws IOException{
		String everything = null;
		BufferedReader br = new BufferedReader(new FileReader("file.txt"));
		try {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    everything = sb.toString();
		} finally {
		    br.close();
		}
		return everything;
	}

}
