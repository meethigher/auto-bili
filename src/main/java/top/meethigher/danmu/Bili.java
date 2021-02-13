package top.meethigher.danmu;

import net.sf.json.JSONObject;

import java.util.Random;

/**
 * Bili
 *
 * @author kit chen
 * @github https://github.com/meethigher
 * @blog https://meethigher.top
 * @time 2021/1/25
 */
public class Bili {
    public static String msg = null;
    public static String result = null;

    public static String generateBody() {
        return "color=16777215&fontsize=25&mode=1&msg="+getRandomMsg()+"&rnd=1611575756&roomid="+Data.roomId+"&bubble=0&csrf_token="+Data.csrf+"&csrf="+Data.csrf;
    }

    public static String getRandomMsg() {
        String[] msgs = Data.msg.split("&");
        Random r = new Random();
        int i = r.nextInt(msgs.length);
        msg = msgs[i];
        return msg;
    }

    public static String submit() {
        result = HttpUtil.sendPost(Data.sendApi, generateBody(), Data.getHeaders());
        System.out.println(result);
        if (result == null)
            return "fail";
        JSONObject json = JSONObject.fromObject(result);
        if ("0".equals(json.get("code").toString())) {
            return "success";
        }
        return "fail";
    }
}
