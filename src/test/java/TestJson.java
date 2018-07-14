import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.Map;

/**
 * Created by ZhangPei on 2018/5/21.
 */
public class TestJson {
    public static void main(String[] args) {
        String result = "{\n" +
                "    \"rtnCode\": \"0\",\n" +
                "    \"rtnMsg\": \"成功!\",\n" +
                "    \"bean\": {},\n" +
                "    \"beans\": [],\n" +
                "    \"object\": {\n" +
                "        \"respCode\": \"0\",\n" +
                "        \"respDesc\": \"success\",\n" +
                "        \"result\": {\n" +
                "            \"outData\": [\n" +
                "                {\n" +
                "                    \"userLevel\": \"06\",\n" +
                "                    \"termTypeInfo\": \"华为 p10\",\n" +
                "\"realNameFlag\": \"0\",\n" +
                "\"netAccessRegionName \": \"轮台县\",\n" +
                "                    \"againNet\": \"2G,3G,4G\",\n" +
                "                    \"prodStatusName\": \"开通\",\n" +
                "                    \"prodStatus\": \"0\",\n" +
                "                    \"is4Guser\": \"1\",\n" +
                "                    \"isEcmemberCust\": \"0\",\n" +
                "                    \"userRegionName\": \"郑州\",\n" +
                "                    \"accessNum\": \"18303718357\",\n" +
                "                    \"userRegionId\": \"0371\",\n" +
                "                    \"custName\": \"李高杰\"\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    }\n" +
                "}";
        Map<String, Object> parse = (Map<String, Object>) JSONObject.parse(result);
        System.err.println(parse);

        String s = "[{\"prodStatusName\":\"开通\",\"isWhiteCust\":\"Y\",\"accessNum\":\"18303718357\",\"prodStatus\":\"0\",\"againNet\":\"2G,3G,4G\",\"userLevel\":\"06\",\"netAccessRegionName \":\"轮台县\",\"userRegionId\":\"0371\",\"custName\":\"李高杰\",\"realNameFlag\":\"0\",\"is4Guser\":\"1\",\"termTypeInfo\":\"华为 p10\",\"isEcmemberCust\":\"0\",\"userRegionName\":\"郑州\"}]";
        Object parse1 = JSONArray.parse(s);
        System.err.println(parse1);

        String str = "{'username':'123'}";
        net.sf.json.JSONObject jsonObject = net.sf.json.JSONObject.fromObject(str);
        String password = jsonObject.optString("password");
        System.err.println("密码" + password);
        System.err.println(password == null);
        System.err.println(password == "");
        String s1 = null;
        System.err.println(s1);

    }
}
