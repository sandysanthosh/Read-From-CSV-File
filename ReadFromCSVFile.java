import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReadFromCSVFile {

	public static void main(String[] args) throws FileNotFoundException {

		 String csvFile = "D:/csv/country.csv";
	        String line = "";
	        String cvsSplitBy = ",";
	        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

	            while ((line = br.readLine()) != null) {

	                // use comma as separator
	                String[] country = line.split(cvsSplitBy);

	                System.out.println(country[1]);

	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	    }

	}