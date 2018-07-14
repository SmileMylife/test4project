import org.apache.commons.lang3.StringUtils;

/**
 * Created by ZhangPei on 2018/7/11.
 */
public class TestPro {
    public static void main(String[] args) {
        checkAcceptStaff("000300190101000100030002", "互联网运营支撑组", 20);
    }

    public static String checkAcceptStaff(String id, String name, int lenth) {
        String nameNew = name;
        if (StringUtils.isNotBlank(nameNew) && nameNew.contains("|")) {
            nameNew = nameNew.substring(0, nameNew.indexOf('|'));
        }
        String str = id + "-" + nameNew;

        int length = lenth;
        int len1 = str.getBytes().length;
        if (str.getBytes().length > ++length) {
            int i = id.getBytes().length;
            int len = (lenth - id.getBytes().length) / 3;
            nameNew = str.substring(id.length(), len + id.length());
            str = id + nameNew;
        }
        return str;

    }
}
