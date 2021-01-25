package top.meethigher.danmu;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * Config 读取配置文件工具类
 *
 * @author kit chen
 * @github https://github.com/meethigher
 * @blog https://meethigher.top
 * @time 2021年1月25日
 */
public class Config {
	private static String cookie;
	private static String roomId;
	private static String msg;
	private static String tomail;
	private static String fromail;
	private static String fromailPw;
	public static Properties pro;
	static {
		ClassLoader cl = Config.class.getClassLoader();
		InputStream is = cl.getResourceAsStream("bilibili.properties");
		try {
			pro = new Properties()
			;
			pro.load(is);
			cookie = pro.getProperty("cookie");
			roomId=pro.getProperty("roomId");
			msg=pro.getProperty("msg");
			tomail = pro.getProperty("tomail");
			fromail = pro.getProperty("fromail");
			fromailPw = pro.getProperty("fromailPw");
		} catch (IOException e) {
			System.out.println("读取配置文件出现错误");
			e.printStackTrace();
		}
	}

	public static String getCookie() {
		return cookie;
	}

	public static String getRoomId() {
		return roomId;
	}

	public static String getMsg() {
		return msg;
	}

	public static String getTomail() {
		return tomail;
	}

	public static String getFromail() {
		return fromail;
	}

	public static String getFromailPw() {
		return fromailPw;
	}

	public static Properties getPro() {
		return pro;
	}
}
