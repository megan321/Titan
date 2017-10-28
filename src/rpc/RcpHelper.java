package rpc;

import java.io.BufferedReader;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;

public class RcpHelper {
	// Parses a JSONObject from http request.
	public static JSONObject readJsonObject(HttpServletRequest request) {
		StringBuffer jb = new StringBuffer();
		String line = null;
		try {
			BufferedReader reader = request.getReader();
			while ((line = reader.readLine()) != null) {
				jb.append(line);
			}
			reader.close();
			return new JSONObject(jb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

}
