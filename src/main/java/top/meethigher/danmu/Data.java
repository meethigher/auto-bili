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
     * 校验csrf
     */
    public static String csrf=Config.getCsrf();

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
     * 模拟点击
     */
    public static String clickUrl="https://data.bilibili.com/log/web?0005271611754639268https%3A%2F%2Flive.bilibili.com%2F13995830%3Ffrom%3Dsearch%26seid%3D14885531558742427207|444.8.selfDef.liveroom_dminput_click||1611754639266|||1536x824|1|{%22event%22:%22liveroom_dminput_click%22,%22value%22:{%22launch_id%22:%22-99998%22,%22session_id%22:%22-99998%22,%22source%22:%22-99998%22,%22query_id%22:%22-99998%22,%22room_id%22:13995830,%22up_id%22:3240555,%22area_id%22:11,%22subarea_id%22:373,%22online%22:1,%22pk_id%22:%22-99998%22,%22screen_status%22:1,%22live_status%22:%22round%22}}|a9d4yuiixeo0|7";

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
        map.put("HOST","api.live.bilibili.com");
        map.put("Connection", "Keep-Alive");
        map.put("Content-Length","161");
        map.put("Accept","application/json, text/javascript, */*; q=0.01");
        map.put("User-Agent",
                "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.125 Safari/537.36");
        map.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        map.put("Origin","https://live.bilibili.com");
        map.put("Sec-Fetch-Site","same-site");
        map.put("Sec-Fetch-Mode","cors");
        map.put("Sec-Fetch-Dest","empty");
        map.put("Accept-Encoding", "gzip, deflate, br");
        map.put("Accept-Language","zh-CN,zh;q=0.9");
        map.put("Cookie", cookie);
        return map;
    }

}
