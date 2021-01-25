package top.meethigher.test;

import org.junit.Test;
import top.meethigher.danmu.Bili;
import top.meethigher.danmu.Data;
import top.meethigher.danmu.HttpUtil;

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
}
