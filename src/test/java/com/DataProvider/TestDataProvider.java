package com.DataProvider;

import java.io.File;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;
import Com.ReadUtility.Utils;
import com.Loactors.iFilePath;

public class TestDataProvider implements iFilePath {

	Utils utils;

	@DataProvider(name = "dp")
	public String[] userLoginData() throws IOException, ParseException {
		File file = new File(System.getProperty("user.dir") + "/data/userdetail.json");

		JSONArray userLoginArray = Utils.readJson(file, "userlogins");
		String arr[] = new String[userLoginArray.size()];
		for (int i = 0; i < userLoginArray.size(); i++) {
			JSONObject users = (JSONObject) userLoginArray.get(i);
			String user = (String) users.get("username");
			String psw = (String) users.get("password");
			arr[i] = user + "," + psw;

		}
		return arr;

	}

	@DataProvider(name = "propFile")
	public Object[][] userLogin() throws IOException {

		// File file = new File(System.getProperty("user.dir") +
		// "/data/config.properties");
		Object[][] creds = new Object[1][2];
		creds[0][0] = Utils.readProperty(file, "user_email");
		creds[0][1] = Utils.readProperty(file, "password");

		return creds;

	}

	@DataProvider(name = "discussionPage")
	public String[] discussionData() throws IOException, ParseException {
		// File file = new File(System.getProperty("user.dir") +
		// "/data/userdetail.json");
		JSONArray userLoginArray = Utils.readJson(json, "discussion");

		String arr[] = new String[userLoginArray.size()];
		for (int i = 0; i < userLoginArray.size(); i++) {
			JSONObject users = (JSONObject) userLoginArray.get(i);
			String user = (String) users.get("groupName");
			String psw = (String) users.get("about");
			String mem = (String) users.get("member");
			String own = (String) users.get("owner");
			arr[i] = user + "," + psw + "," + mem + "," + own;

			// System.out.println("++++++++++++" + userLoginArray.get(i));

		}
		// for (String i : arr) {
		// System.out.println("=============" + i);

		// }

		return arr;
	}

}
