package cn.nice2cu.test;

import com.alibaba.fastjson.JSONObject;
import java.util.HashMap;
import java.util.Map;
import lombok.Data;

/**
 * <p>
 *
 * </p>
 *
 * @author sqzhao
 * @since 2022-04-15
 */
public class JsonTest {
    
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "123");
        map.put("2", "234");
        String json = JSONObject.toJSONString(map);
        json = "{\"StrMap\": {\"1\":\"123\",\"2\":\"234\"}}";
        Dto dto = JSONObject.parseObject(json, Dto.class);
        System.out.println(json);
        
    }
    
    @Data
    static class Dto {
        private Map<String, String> StrMap;
    }
}
