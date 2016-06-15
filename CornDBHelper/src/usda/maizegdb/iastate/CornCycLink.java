package usda.maizegdb.iastate;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import edu.iastate.javacyco.JavacycConnection;

public class CornCycLink {
	private String host;
	private String organism;
	private int port;
	private JavacycConnection conn;
	private String parms = "CornCycHost_165";
	
	public CornCycLink() {
		BufferedReader reader = null;
		String line = null;
		try {
			reader = new BufferedReader(new FileReader(parms));
			reader.readLine();//Clear header line
			
			while ((line = reader.readLine()) != null) {
			}
		} catch (FileNotFoundException exception) {
			exception.printStackTrace();
		} catch (IOException exception) {
			exception.printStackTrace();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		finally {
			try {
			} catch (Exception exception) {
				exception.printStackTrace();
			}
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException exception) {
				exception.printStackTrace();
			}
		}
		
		conn = new JavacycConnection(host, port);
		conn.selectOrganism(organism);
	}
}
