package top.meethigher.danmu;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Data
 *
 * @author kit chen
 * @github https://github.com/meethigher
 * @blog https://meethigher.top
 * @time 2021年1月25日
 */
public class Data {
    /**
     * cookie
     */
    public static String cookie = Config.getCookie();

    /**
     * 弹幕
     */
    public static String msg = Config.getMsg();

    /**
     * 房间号
     */
    public static String roomId = Config.getRoomId();

    /**
     * 弹幕api
     */
    public static String sendApi = "https://api.live.bilibili.com/msg/send";

    /**
     * 保持session
     */
    public static String keepingUrl = "https://api.live.bilibili.com/relation/v1/Feed/heartBeat";

    /**
     * 发件方邮箱，经过多次测试，腾讯企业邮箱是最稳定的
     */
    public static final String fromMail = Config.getFromail();

    /**
     * 腾讯企业邮箱密码
     */
    public static final String fromMailPw = Config.getFromailPw();

    /**
     * 接收方邮箱
     */
    public static final String toMail = Config.getTomail();


    /**
     * 请求头
     *
     * @return
     */
    public static Map<String, String> getHeaders() {
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("User-Agent",
                "Mozilla/5.0 (Linux; Android 11; OnePlus 8 Pro Build/QKQ1.190825.002; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/33.0.0.0 Mobile Safari/537.36 okhttp/3.8.1");
        map.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        map.put("Connection", "Keep-Alive");
        map.put("Accept-Encoding", "gzip");
        map.put("Cookie", cookie);
        return map;
    }

}
