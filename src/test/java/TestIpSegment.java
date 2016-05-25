import com.alibaba.fastjson.JSONObject;

import java.util.TreeMap;

/**
 * @author zhangwenbin
 * @since 2016/5/25.
 */
public class TestIpSegment {

    public static void main(String[] args) {
        TreeMap<IPSegment, String> ipsegmentTree = new TreeMap<>();

        //add something
        ipsegmentTree.put(new IPSegment(18424899, 18424899), "bj");
        ipsegmentTree.put(new IPSegment(18424900, 18424945), "sh");
        System.out.println(ipsegmentTree);
        System.out.println(ipsegmentTree.get(new IPSegment(18424922, 18424922)));
        System.out.println(ipsegmentTree.get(new IPSegment(18424899, 18424899)));
    }
}
