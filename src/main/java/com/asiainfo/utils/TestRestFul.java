package com.asiainfo.utils;

/**
 * Created by ZhangPei on 2018/5/15.
 */

import com.cmos.esbclient.bean.MessageInfo;
import com.cmos.esbclient.bean.RestMethodType;
import com.cmos.esbclient.remote.RestClientUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TestRestFul {
    private final static Log logger = LogFactory.getLog(TestRestFul.class);
    public static void main(String[] args) throws Throwable {
        try {
            //透明化短信查询
			/*String serverUri = "http://127.0.0.1:28076/ngwfcontrol/ws/basesr/sms/queryWrkfmSts/";
			String input = "{\"params\":{\"wrkfmShowSwftno\":\"20170708145959X199775653\",\"acptNum\":\"13800000000\"}}";
			String result = RestClientUtil.invoke(new MessageInfo(serverUri, "com.cmos.esb.user.test", input, RestMethodType.GET));
			System.out.println(result);*/

            //自动分单
//			String serverUri = "http://127.0.0.1:28076/ngwfcontrol/ws/task/assign/autoAssignForCommon/";
//			String input = "{\"params\":{\"provCode\":\"00030016\",\"tenantId\":\"100000\"}}";
//			String result = RestClientUtil.invoke(new MessageInfo(serverUri, "com.cmos.esb.user.test", input, RestMethodType.POST));
//			System.out.println(result);


            //疑难客户
//			String serverUri = "http://127.0.0.1:28076/ngwfcontrol/ws/basesr/task/xjj/diffilcultCustomerOutTask";
//			String result = RestClientUtil.invoke(new MessageInfo(serverUri, "com.cmos.esb.user.test", "{}", RestMethodType.POST));
//			System.out.println(result);

            //剔除不在线用户
//			String serverUri = "http://127.0.0.1:28076/ngwfcontrol/ws/basesr/task/net/removeOfflineStaff";
//			String result = RestClientUtil.invoke(new MessageInfo(serverUri, "com.cmos.esb.user.test", "{}", RestMethodType.POST));
//			System.out.println(result);

//			//补救工单
//			String serverUri = "http://127.0.0.1:28076/ngwfcontrol/ws/basesr/task/yn/remedyWrkfmTask";
//			String result = RestClientUtil.invoke(new MessageInfo(serverUri, "com.cmos.esb.user.test", "{}", RestMethodType.POST));
//			System.out.println(result);

            //自动热点task
//			String serverUri = "http://127.0.0.1:28076/ngwfcontrol/ws/basesr/task/yn/srHotServiceTask";
//			String result = RestClientUtil.invoke(new MessageInfo(serverUri, "com.cmos.esb.user.test", "{}", RestMethodType.POST));
//			System.out.println(result);
            //处理补救工单
//			String serverUri = "http://127.0.0.1:28076/ngwfcontrol/ws/basesr/task/yn/remedyAcceptTask";
//			String result = RestClientUtil.invoke(new MessageInfo(serverUri, "com.cmos.esb.user.test", "{}", RestMethodType.POST));
//			System.out.println(result);
//			//超时补救工单
//			String serverUri = "http://127.0.0.1:28076/ngwfcontrol/ws/basesr/task/yn/srRemedyWrkfmOverTimeTask";
//			String result = RestClientUtil.invoke(new MessageInfo(serverUri, "com.cmos.esb.user.test", "{}", RestMethodType.POST));
//			System.out.println(result);

//归档一级客服
//			String serverUri = "http://127.0.0.1:28076/ngwfcontrol/ws/basesr/task/yn/autoCSVCArchiveTask_YN";
//			String result = RestClientUtil.invoke(new MessageInfo(serverUri, "com.cmos.esb.user.test", "{}", RestMethodType.POST));
//			System.out.println(result);

//			String serverUri = "http://127.0.0.1:28076/ngwfcontrol/ws/outter/qrySrWorkitemInfo";
//			String input = "{\"params\":{\"tenantId\":\"100000\",\"provCode\":\"00030016\",\"wrkfmId\":\"1000043560\"" +
//					",\"acceptMonth\":\"2018-02-01\"}}";
//			String result = RestClientUtil.invoke(new MessageInfo(serverUri, "com.cmos.esb.user.test", input, RestMethodType.POST));
//			System.out.println(result);

//			String serverUri = "http://127.0.0.1:28076/ngwfcontrol/ws/outter/overseeDSLService";
//			//String input = "{\"params\":{\"parameter\":{\"tenantId\":\"100000\",\"provCode\":\"00030016\",\"overseeDeptId\":\"\",\"workGroupId\":\"\",\"srvReqstTypeId\":\"001003001004,007006006002002039\"},\"operationType\":\"04\",\"provCode\":\"00030016\",\"opStaffId\":\"YN0001\"}}";
//			String input = "{\"params\":{\"parameter\":\"{\\\"tenantId\\\":\\\"100000\\\",\\\"provCode\\\":\\\"00030016\\\",\\\"overseeDeptId\\\":\\\"0444\\\",\\\"workGroupId\\\":\\\"111\\\"}\",\"operationType\":\"04\",\"provCode\":\"00030016\",\"opStaffId\":\"YN0001\"}}";
//			//String input = "{\"params\":{\"wrkfmShowSwftno\":\"20170708145959X199775653\",\"acptNum\":\"13800000000\"}}";
//			String result = RestClientUtil.invoke(new MessageInfo(serverUri, "com.cmos.esb.user.test", input, RestMethodType.POST));
//			System.out.println(result);

//			//服务请求量预警Task测试  20180419155715X635815955
//			String serverUri = "http://127.0.0.1:28076/ngwfcontrol/ws/baser/task/smsBatchWrkfmTime";
//			String serverUri = "http://127.0.0.1:28076/ngwfcontrol/ws/baser/task/yn/autoToMidsSendTask_YN";
//            String serverUri = "http://127.0.0.1:28076/ngwfcontrol/ws/baser/task/autoToNsosSend";
//			String serverUri = "http://127.0.0.1:28076/ngwfcontrol/ws/basesr/task/autoDispachEOMSTask";



//            String input = "{\"params\":{\"tenantId\":\"100000\",\"provCode\":\"00030016\",\"sysCode\":\"NSOS\"}}";
            String input = "{\"params\":{\"tenantId\":\"100000\",\"provCode\":\"00030016\",\"wrkfmShowSwftno\":\"20180531091117X778057640\", \"staffId\":\"YN0001\", \"accountAdjustmentContent\":\"签批意见\", \"isNeedApprove\":\"0\", \"approveStatus\":\"1\"}}";
            String serverUri = "http://127.0.0.1:28076/ngwfcontrol/ws/outter/accountAdjustment";
            //督办部门超时工单查询接口测试、
//			String serverUri = "http://127.0.0.1:28076/ngwfcontrol/ws/outter/queryOverTimeProblemProcess";
//			String input = "{\"params\":{\"provCode\":\"00030016\",\"opStaffId\":\"YN0001\",\"operationType\":\"04\"," +
//					"\"parameter\":\"{\\\"provCode\\\":\\\"00030016\\\",\\\"tenantId\\\":\\\"100000\\\",\\\"overseeDeptId\\\":\\\"00030009,0003001600010001,-6,000300160001,000300500001,000300160002\\\"," +
//					"\\\"workGroupId\\\":\\\"2017072100107,2017072100118,2017072100119,2017071100003,2017072100541\\\",\\\"timeoutLevel\\\":\\\"01,02,03,04\\\"," +
//					"\\\"srvReqstTypeId\\\":\\\"\\\"}\"}}";

            String result = RestClientUtil.invoke(new MessageInfo(serverUri, "com.cmos.esb.user.test", input, RestMethodType.POST));
            System.out.println(result);

        } catch (Exception e) {
            logger.error(e.getMessage(),e);
            System.out.println(e.getMessage());
        }
    }

}

