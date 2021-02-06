package top.meethigher.test;

import org.junit.Test;
import top.meethigher.danmu.Bili;
import top.meethigher.danmu.Data;
import top.meethigher.danmu.HttpUtil;
import top.meethigher.danmu.SendMail;

import java.util.Date;

/**
 * Test
 *
 * @author kit chen
 * @github https://github.com/meethigher
 * @blog https://meethigher.top
 * @time 2021/1/26
 */
public class UnitTest {
    /**
     * 测试提交
     */
//    @Test
//    public void testSubmit() { System.out.println(Bili.submit());}

    /**
     * 测试保持session
     */
    @Test
    public void testKeeping() { System.out.println(HttpUtil.sendGet(Data.keepingUrl, Data.getHeaders())); }

    /**
     * 测试随机弹幕
     */
    @Test
    public void testGetMsg() { System.out.println(Bili.getRandomMsg()); }
//    @Test
//    public void testMail(){
//        System.out.println(SendMail.send(new String[] { "弹幕发送成功通知", "时间：" + new Date().toLocaleString()
//                + "\n发送弹幕：" + Bili.msg}));
//    }
}
