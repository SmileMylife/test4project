import com.cmos.core.bean.OutputObject;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ZhangPei on 2018/5/22.
 */
public class TestString {
    public static void main(String[] args) {
        boolean blank = StringUtils.isBlank(null);
        System.err.println(blank);
        boolean blank1 = StringUtils.isBlank("");
        boolean blank2 = StringUtils.isBlank("   ");

        System.err.println(blank1 + "" + blank2);

        OutputObject outputObject = new OutputObject();
        Map<String, Object> bean = outputObject.getBean();
        bean.put("username", "zhangpei");
        System.err.println(outputObject.getBean());


        String s = (String) null;
        System.err.println(s);
    }
}
