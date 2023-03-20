package com.vidyaviewer.it4045cgroup9.dao;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Component;

@Component
public class NetworkDAO {

	public String request(String endpoint) throws Exception {
		StringBuilder sb = new StringBuilder();
		URL url = new URL(endpoint);

		HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

		try {
			// read in the bytes
			InputStream inputStream = urlConnection.getInputStream();
			BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

			// read the bytes as characters
			InputStreamReader inputStreamReader = new InputStreamReader(bufferedInputStream);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

			// read one line at a time
			String inputline = bufferedReader.readLine();
			while (inputline != null) {
				sb.append(inputline);
				inputline = bufferedReader.readLine();
			}

		} finally {
			urlConnection.disconnect();
		}

		return sb.toString();
	}
}
