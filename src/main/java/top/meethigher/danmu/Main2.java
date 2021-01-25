package top.meethigher.danmu;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Main2
 *
 * @author kit chen
 * @github https://github.com/meethigher
 * @blog https://meethigher.top
 * @time 2021/1/26
 */
public class Main2 {
    static {
        System.out.println("读取配置文件..");
        System.out.println("当前时间：" + new Date().toLocaleString());
        System.out.println("2021-01-26版本正在运行...");
    }

    public static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void submit() {
        String submit = Bili.submit();
        if ("success".equals(submit)) {
            System.out.println("弹幕已成功发送！弹幕：" + Bili.msg);
        } else {
            System.out.println("弹幕发送失败，失败报告->" + Bili.result);
        }
    }

    public static void main(String[] args) {
        // 开启保持会话线程
        new Thread(() -> {
            while (true) {
                HttpUtil.sendGet(Data.keepingUrl, Data.getHeaders());
                sleep(1000 * 60 * 10);
            }
        }).start();
        new Thread(() -> {
            while (true) {
                submit();
                sleep(1000*60);
            }
        }).start();
    }
}
