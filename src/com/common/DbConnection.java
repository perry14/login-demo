package com.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DbConnection {

	private static String dirver;
	private static String url;
	private static String username;
	private static String pwd;

	private static void setInitParam() throws IOException {
		Properties prop = new Properties();
		InputStream in = new FileInputStream("E:\\tools\\eclipse-jee-indigo-SR1-win32\\workSpace\\MyTest\\src\\com\\common\\jdbc.properties");
		prop.load(in);
		dirver = prop.getProperty("driver");
		url = prop.getProperty("url");
		username = prop.getProperty("username");
		pwd = prop.getProperty("pwd");

	}

	public static Connection getConnection() {
		Connection conn = null;
		try {
			setInitParam();
			Class.forName(dirver);
			conn = DriverManager.getConnection(url, username, pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
