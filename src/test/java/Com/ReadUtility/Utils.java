package Com.ReadUtility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Utils {

	public static JSONArray readJson(File file, String key) throws IOException, ParseException {
		FileReader reader = new FileReader(file);
		JSONParser jsonParser = new JSONParser();
		Object obj = jsonParser.parse(reader);
		JSONObject userLoginJsonObj = (JSONObject) obj;
		JSONArray userLoginArray = (JSONArray) userLoginJsonObj.get(key);
		return userLoginArray;

	}

	public static String readProperty(File FILENAME, String KEYNAME) throws IOException {
		Properties prop = new Properties();
		// File file = new File(System.getProperty("user,dir") + "/data/"+FILENAME);
		FileReader reader = new FileReader(FILENAME);
		prop.load(reader);
		String key = prop.getProperty(KEYNAME);
		return key;

	}

	public static String readProp(File FILENAME, String KEYNAME) {
		String key = "";
		Properties prop = new Properties();
		// File file = new File(System.getProperty("user,dir") + "/data/"+FILENAME);
		FileReader reader;
		try {
			reader = new FileReader(FILENAME);
			prop.load(reader);
			key = prop.getProperty(KEYNAME);
		} catch (FileNotFoundException e) {
			System.out.println("prop file not found");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("prop file not found");
		}

		return key;

	}

}
