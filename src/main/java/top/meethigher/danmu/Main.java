package top.meethigher.danmu;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * Main
 *
 * @author kit chen
 * @github https://github.com/meethigher
 * @blog https://meethigher.top
 * @time 2021年1月6日
 */
public class Main {
	private static int h;
	private static int m;
	static {
		System.out.println("读取配置文件..");
		System.out.println("当前时间：" + new Date().toLocaleString());
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入开始发弹幕的小时：");
		h= scanner.nextInt();
		System.out.print("请输入开始发弹幕的分钟：");
		m= scanner.nextInt();
		scanner.close();
		System.out.println("2021-02-14版本正在运行...");
	}

	public static void submit() {
        String submit = Bili.submit();
        if("success".equals(submit)){
            System.out.println("今日首条弹幕已成功发送！弹幕："+Bili.msg);
            System.out.println(SendMail.send(new String[] { "弹幕发送成功通知", "时间：" + new Date().toLocaleString()
                    + "\n发送弹幕：" + Bili.msg}));
        }else {
            System.out.println("今日首条弹幕发送失败！失败报告->" + Bili.result);
            System.out.println(SendMail.send(new String[] { "弹幕发送失败通知", "时间：" + new Date().toLocaleString()
                    + "\n" + "失败：" + Bili.result }));
        }
    }
    public static void sleep(long ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
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
		new Thread(()->{
		    Calendar c=null;
		    int ch,cm;
		    while(true){
		        c=Calendar.getInstance();
		        ch= c.get(Calendar.HOUR_OF_DAY);
		        cm=c.get(Calendar.MINUTE);
		        if(h==ch&&m==cm){
		            submit();
		            //休眠23小时59分钟30秒，暂时没想到更好的解决办法，有更好的思路可以给我发邮件meethigher@qq.com，谢谢
		            sleep(82800000+3540000+30000);
                }
		        sleep(1000);
            }
        }).start();
	}
}
