package cn.nice2cu.work;

/**
 * TODO
 *
 * @author zhaosq
 * @date 2022/5/6
 */
public class StringTest {

    public static void main(String[] args) {
        String key = "OSS:device:diagnosis:report:1009_6461027089874387023_E22CFG201801224";
        System.out.println(key.substring(28, key.indexOf("_")));
        System.out.println(key.substring(key.indexOf("_") + 1, key.lastIndexOf("_")));
        System.out.println(key.substring(key.lastIndexOf("_") + 1));
    }

}
