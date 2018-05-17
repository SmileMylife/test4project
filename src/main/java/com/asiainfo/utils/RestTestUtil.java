package com.asiainfo.utils;

/**
 * Created by ZhangPei on 2018/5/15.
 */
import com.cmos.core.logger.Logger;
import com.cmos.core.logger.LoggerFactory;
import com.cmos.esbclient.bean.MessageInfo;
import com.cmos.esbclient.bean.RestMethodType;
import com.cmos.esbclient.remote.RestClientUtil;

public class RestTestUtil {

    private static final Logger logger = LoggerFactory.getActionLog(RestTestUtil.class);
    public static void main(String[] args)throws Exception {
        mainTest() ;
    }


    public static void mainTest() throws Exception{
        //String url = "http://192.168.100.35:9950/";
        String url = "http://localhost:28076/";



        //String serverUri = url + "ngwfcontrol/ws/interaction/eoms/reply";
    	
    	/*String serverUri = url + "ngwfcontrol_gx/ws/ws/autoConfig/autoReply";
 		String input = "{\"params\":{\"subsCity\":\"220\",\"subsNumber\":\"13988778898\",\"subsName\":"
 				+ "\"周杰伦\",\"callTime\":\"2016-09-14 00:00:00\",\"isCommitform\":\"1\",\"waitNum\""
 				+ ":\"3\",\"sysNo\":\"185k\"}}";
 		
 		String type = "POST";
 		doTest(serverUri,input,type);*/

//    	String serverUri = url + "ngwfcontrol_gx/ws/csvc/comeFromInterboss";
//    	String input = "{\"params\":{\"aaa\":\"220\"}}";
//
//    	String serverUri = url + "ngwfcontrol/ws/cache/common/refreshOtherCache"; //编码缓存
//    	String serverUri = url + "ngwfcontrol/ws/cache/yn/srServiceTypeTask"; //服务请求缓存
//    	String serverUri = url + "ngwfcontrol/ws/basesr/task/homeNetDataUploadTask";
//    	String serverUri = url + "ngwfcontrol/ws/outter/homeNetDataUpload";
//    	String serverUri = url + "ngwfcontrol/ws/outter/directReplyServiceRequest";
//    	String serverUri = url + "ngwfcontrol/ws/nsos/oldSysToNewSysSnd";
//
//    	String input = "{\"params\":{\"provCode\":\"00030016\", \"tenantId\":\"100000\"}}";
//
    	/*String input = "{\"params\":{\"acceptStaffId\":\"YNT0003\",\"acceptDeptId\":\"00030009\","
    			+ "\"serviceRequestType\":\"007002009009002002002\",\"serviceNum\":\"13788255047\","
    			+ "\"callNo\":\"\",\"callPhone\":\"13788255047\",\"calledPhone\":\"10086\",\"provCode\":\"00030016\","
    			+ "\"tenantId\":\"100000\"}}";*/

//    	String input = "{\"params\":{\"acptNum\":\"13788255047\",\"srvReqstTypeIdMatched\":\"007004006002001003003\","
//    			+ "\"provCode\":\"00030016\",\"tenantId\":\"100000\"}}";

//    	String headXml = HttpServletUtils.getContent("一级客服向省下派.xml");
//    	input = XmlToJsonUtils.xml2json(headXml);

        //测试直接答复
//    	String serverUri = url + "ngwfcontrol/ws/outter/directReplyServiceRequest";
//    	String input = "{\"params\":{\"acceptDeptId\":\"0\", \"provCode\":\"00030016\", \"callPhone\":\"\", "
//    			+ "\"calledPhone\":\"\",\"serviceRequestType\":\"007002004005002006\",\"acceptStaffId\":\"YN0001\",\"fullName\":\"客户投诉→基础服务类→基础业务→跨区服务→基础业务问题→业务规则问题\",\"bizCntt\":\"扣费提醒退订\","
//    			+ "\"callNo\":\"\",\"serviceNum\":\"13920615937\",\"tenantId\":\"100000\"}}";
    	
    	/*//测试批量获取集团全网客户服务统一编码进程
    	String serverUri = url + "ngwfcontrol/ws/basesr/task/common/batchGetGroupUnifyCodeTask";
    	String input = "{\"params\":{\"provCode\":\"00030016\", \"tenantId\":\"100000\"}}";*/

        //测试批量归档
//    	String serverUri = url + "ngwfcontrol/ws/outter/csslToSrBatchArchive";
////    	String input = "{\"params\":{\"wrkfmShowSwftno\":\"20180312161518X518221775\", \"provCode\":\"00030016\", "
////    			+ "\"tenantId\":\"100000\", \"mainBizTypeId\":\"GROUPLINE\"}}";
//		 Map<String,String> map = new HashMap<String,String>();
//		 String input = "{\"params\":{\"wrkfmShowSwftno\":\"20180420113608X368786243,20180420112853X933476532,20180420104020X200531010,20180420100632X992558795,20180420020954X394014355,20180419212324X204214460,20180419193054X454036363,20180419162909X549965374,20180419161245X565682626,20180419160150X910564924\", \"staffId\":\"YN0001\", \"provCode\":\"00030016\", \"wrkfmId\":\"1000045376,1000045375,1000045371,1000045370,1000045369,1000045367,1000045365,1000045362,1000045361,1000045360\"" +
//			 ",\"dspsOpinCutt\":\"批量归档\",\"dspsOpinCutt\":\"批量归档\"," +
//			 "\"fctNo\":\"respRsnLvlCd,respRsnDesc,respDeptId,rslvExtentId,srSatisfy,userSatisfy,NoSatisfyReason,customerRecognition,preWorkitemEval,isValidComp,feedBackWay,feedBackReason,mobilePhone\"," +
//			 "\"fctNm\":\"责任原因级别,责任原因,责任部门,解决程度,工单满意度,客户满意度,不满意原因,客户认可度,上环节评价,是否有效投诉,反馈方式,反馈不成功原因,处理人手机号码\"\"," +
//			 "\"fctVal\":\"01#,#0203#,#01#,#1#,#01#,#01#,#1#,#0#,#300#,#0#,#01#,#1#,#13888888888\"\"," +
//			 "\"currWorkItemOwner\":\"YN0001,-69,null,YN0001,null,null,-9,null,null,null,\",\"currWorkItemGroup\":\"2017072100118,-69,2017072100118,2017072100118,2017072100118,2017072100118,-9,2017072100118,2017072100118,2017072100118\"}}";
////			map.put("tenantId","100000");
//		 map.put("workGrpId","2017072100118,-69,2017072100118,2017072100118,2017072100118,2017072100118,-9,2017072100118,2017072100118,2017072100118");
//			map.put("srvReqstTypeId","");
//		 map.put("fctVal","01#,#0203#,#01#,#1#,#01#,#01#,#1#,#0#,#300#,#0#,#01#,#1#,#13888888888");
//		 map.put("acptStaffNum","YN0001,YN0001,YN0001,YN0001,YN0001,YN0001,YN0001,YN0001,YN0001,YN0001");
//		 map.put("unsatisfyReason","");
//		 map.put("revstType","");
//		 map.put("rslvExtentId","1");
//		 map.put("orgId","00030009");
//		 map.put("feedBackWay","01");
//		 map.put("fctNo","respRsnLvlCd,respRsnDesc,respDeptId,rslvExtentId,srSatisfy,userSatisfy,NoSatisfyReason,customerRecognition,preWorkitemEval,isValidComp,feedBackWay,feedBackReason,mobilePhone");
//		 map.put("fctNm","责任原因级别,责任原因,责任部门,解决程度,工单满意度,客户满意度,不满意原因,客户认可度,上环节评价,是否有效投诉,反馈方式,反馈不成功原因,处理人手机号码");
//		 map.put("dplctAformFlag","0,0,0,0,0,0,0,0,0,0");
//		 map.put("respRsnLvlCd","01");
//		 map.put("noRecognitionReason","");
//		 map.put("srSatisfy","01");
//		 map.put("userSatisfy","01");
//		 map.put("isValidComp","0");
//		 map.put("acptChnlId","");
//		 map.put("respRsnDesc","0203");
//		 map.put("custStargrdCd", "");
//		 map.put("tsudSatisSmsFlag", "");
//		 map.put("feedBackReason", "1");
//		 map.put("currWorkItemGroup", "2017072100118,-69,2017072100118,2017072100118,2017072100118,2017072100118,-9,2017072100118,2017072100118,2017072100118");
//		 map.put("provCode", "00030016");
//		 map.put("customerRecognition", "0");
//		 map.put("elementDisplayName","总部级#,#业务办理差错#,#企业责任#,#已解决#,#满意#,#满意#,#不能第一时间解决我的问题#,#认可#,#合格#,#否#,#外呼反馈#,#客户不出声#,#");
//		 map.put("seqprcTmpltId","ngwf_yn,ngwf_yn,ngwf_yn,ngwf_yn,ngwf_yn,ngwf_yn,ngwf_yn,ngwf_yn,ngwf_yn,ngwf_yn,");
//		 map.put("respDeptId", "01");
//		 map.put("currWorkItemOwner","YN0001,-69,null,YN0001,null,null,-9,,,");
//		 map.put("preWorkitemEval", "300");
//		 String input =map.toString();

    	/*//测试工单查询接口
    	String serverUri = url + "ngwfcontrol/ws/ws/workSheet";
    	String input = "{\"params\":{\"provCode\":\"00030016\", \"tenantId\":\"100000\", \"srTypeId\":\"007002007004002002002\", \"srvReqstCustSrvUnfyCode\":\"21521512\", "
    			+ "\"arcTimeStart\":\"2018-04-11 11:00:00\", \"arcTimeEnd\":\"2018-04-15 13:00:00\"}}";*/

        //测试工单路由查询接口
    	/*String serverUri = url + "ngwfcontrol/ws/ws/workSheetRouteLg";
    	String input = "{\"params\":{\"provCode\":\"00030016\", \"tenantId\":\"100000\", \"staffId\":\"YN0001\", \"wrkfmId\":\"1000044183\"}}";*/

//    	String serverUri = url + "ngwfcontrol/ws/ws/workSheetRouteLg";
//    	String input = "{\"params\":{\"provCode\":\"00030016\", \"tenantId\":\"100000\", \"staffId\":\"YN0001\", \"wrkfmId\":\"1110003538\"}}";

        //工单接口-宽带类工单详情查询接口
//		 String serverUri = url + "ngwfcontrol/ws/outter/qryDetailByWrkfmNo";
//		 String input = "{\n" +
//				 "    \"params\": {\n" +
//				 "        \"wrkfmShowSwftno\": \"20180505150315X795508334\",\n" +
//				 "        \"provCode\": \"00030016\",\n" +
//				 "        \"tenantId\": \"100000\"\n" +
//				 "    },\n" +
//				 "    \"beans\": [],\n" +
//				 "    \"object\": {}\n" +
//				 "}\n";

//		String serverUri = url + "ngwfcontrol/ws/outter/qryDetailByWrkfmNo";
//    	String input = "{\"params\":{\"provCode\":\"00030016\", \"tenantId\":\"100000\", \"wrkfmShowSwftno\":\"20171108105951X991199628\"}}";

        //测试工单查询接口
//    	String serverUri = url + "ngwfcontrol/ws/ws/workSheet";
//    	String input = "{\"params\":{\"provCode\":\"00030016\", \"tenantId\":\"100000\", \"srTypeId\":\"007002007004002002002\", \"srvReqstCustSrvUnfyCode\":\"21521512\", "
//    			+ "\"arcTimeStart\":\"2018-04-11 11:00:00\", \"arcTimeEnd\":\"2018-04-15 13:00:00\"}}";
//

    	/*//测试0028文件接口
    	String serverUri = url + "ngwfcontrol/ws/outter/0028DataCollectionResult";
    	String input = "{\"params\":{\"provCode\":\"00030016\", \"tenantId\":\"100000\", "
    			+ "\"acptTimeStart\":\"2018-04-25 10:39:20\", \"acptTimeEnd\":\"2018-04-25 10:39:50\"}}";*/
    	
    	/*//测试中途意见 20180411114416X256406868
    	String serverUri = url + "ngwfcontrol/ws/ws/appendWorkSheetInfo";
    	String input = "{\"params\":{\"provCode\":\"00030016\", \"tenantId\":\"100000\", "
    			+ "\"remContent\":\"中途意见\", \"dspsStaffId\":\"YN0003\", \"dspsDeptId\":\"00030009\"}}";*/
    	
    	/*//测试催办
    	String serverUri = url + "ngwfcontrol/ws/ws/urgeWorkSheet";
    	String input = "{\"params\":{\"provCode\":\"00030016\", \"tenantId\":\"100000\", \"wrkfmShowSwftno\":\"20180416165201X721629169\", "
    			+ "\"remContent\":\"催单意见\", \"dspsStaffId\":\"YN0003\", \"dspsDeptId\":\"00030009\"}}";*/

        //测试中途意见 20180411114416X256406868
//    	String serverUri = url + "ngwfcontrol/ws/ws/appendWorkSheetInfo";
//    	String input = "{\"params\":{\"provCode\":\"00030016\", \"tenantId\":\"100000\", \"wrkfmShowSwftno\":\"20180411114416X256406868\", "
//    			+ "\"remContent\":\"中途意见\"}}";
//
    	/*//测试派发一级、二线回复点反馈后自动归档
    	String serverUri = url + "ngwfcontrol/ws/basesr/task/yn/autoCSVCArchiveTask_YN";
    	String input = "{\"params\":{}}";*/
    	
    	
    	/*//测试首次回复
    	String serverUri = url + "ngwfcontrol/ws/basesr/task/common/autoReplyFirstlyTask";
    	String input = "{\"params\":{\"provCode\":\"00030016\", \"tenantId\":\"100000\"}}";*/
    	
    	/*//测试发短信
    	String serverUri = url + "ngwfcontrol/ws/basesr/task/srSmsAsynSendTask";
    	String input = "{\"params\":{\"provCode\":\"00030016\", \"tenantId\":\"100000\"}}";*/
    	
    	/*//测试eoms查询
    	String serverUri = url + "ngwfcontrol/ws/outter/eomsToSrQry";
    	String input = "{\"params\":{\"workItemId\":\"20170915151331X611431321\", \"provCode\":\"00030016\", \"tenantId\":\"100000\"}}";*/
    	
    	/*//测试eoms确认受理
    	String serverUri = url + "ngwfcontrol/ws/outter/eomsToSrAcpt";
    	String input = "{\"params\":{\"confirmReason\":\"确认受理意见\", \"provCode\":\"00030016\", \"tenantId\":\"100000\"}, "
    			+ "\"object\":{\"serialNo\":\"20180507150834X914370193\", \"sheetType\":\"056\"}}";*/
    	
    	/*//测试eoms确认受理 带附件
    	String serverUri = url + "ngwfcontrol/ws/outter/eomsToSrAcpt";
    	String input = "{\"params\":{\"confirmReason\":\"确认受理意见\", \"provCode\":\"00030016\", \"tenantId\":\"100000\"}, "
    			+ "\"object\":{\"serialNo\":\"20180503163058X258655449\", \"sheetType\":\"056\", \"attachRef\":[{\"attachName\":\"12ws.txt\",\"attachSize\":\"1024\",\"attachPath\":\"afe66340-f1fe-439b-9f78-d3c7a5df55d8\"},{\"attachName\":\"云南ff.txt\","
    			+ "\"attachSize\":\"4520\",\"attachPath\":\"69cadda3-98e3-4113-b643-527e95f100f4\"}]}}";*/
    	
    	/*//测试eoms回复
    	String serverUri = url + "ngwfcontrol/ws/outter/eomsToSrRpy";
    	String input = "{\"params\":{\"compProp\":\"无性质\", \"isReplied\":\"是\", \"issueEliminatTime\":\"2017-09-20 16:00:00\", \"issueEliminatReason\":\"问题原因\", "
    			+ "\"dealDesc\":\"[故障消除时间]：2017-10-02 03:53:33[故障原因]：接入网线路及分光器问题[故障原因]：网络原因[其他原因]： [用户核实情况]：75[核实故障情况]：75[处理过程及措施]：75\", \"dealResult\":\"已解决\", \"isSolved\":\"1\", \"provCode\":\"00030016\", \"tenantId\":\"100000\"}, "
    			+ "\"object\":{\"serialNo\":\"20180507150834X914370193\", \"sheetType\":\"056\"}}";*/
    	
    	/*//测试eoms驳回
    	String serverUri = url + "ngwfcontrol/ws/outter/eomsToSrRjt";
    	String input = "{\"params\":{\"withdrawReason\":\"驳回意见111\", \"provCode\":\"00030016\", \"tenantId\":\"100000\"}, "
    			+ "\"object\":{\"serialNo\":\"20180315170010X410994835\", \"sheetType\":\"056\"}}";*/
    	
    	/*//测试eoms阶段回复
    	String serverUri = url + "ngwfcontrol/ws/outter/eomsToSrStageRpy";
    	String input = "{\"params\":{\"stepResult\":\"阶段回复啦啦啦啦啦啦\", \"provCode\":\"00030016\", \"tenantId\":\"100000\"}, "
    			+ "\"object\":{\"serialNo\":\"20171030190838X718916829\", \"sheetType\":\"056\"}}";*/
    	
    	/*//测试eoms归档
    	String serverUri = url + "ngwfcontrol/ws/outter/eomsToSrArch";
    	String input = "{\"params\":{\"withdrawReason\":\"驳回意见111\", \"provCode\":\"00030016\", \"tenantId\":\"100000\"}, "
    			+ "\"object\":{\"serialNo\":\"20171225203518X318249396\", \"sheetType\":\"056\"}}";*/
    	
    	/*//测试bomc查询
    	String serverUri = url + "ngwfcontrol/ws/outter/bomcToSrQry";
    	String input = "{\"params\":{\"workItemId\":\"20170915151331X611431321\", \"provCode\":\"00030016\", \"tenantId\":\"100000\"}}";*/
    	
    	/*//测试bomc确认受理
    	String serverUri = url + "ngwfcontrol/ws/outter/bomcToSrAcpt";
    	String input = "{\"params\":{\"confirmReason\":\"确认受理意见\", \"provCode\":\"00030016\", \"tenantId\":\"100000\"}, "
    			+ "\"object\":{\"serialNo\":\"20180315172605X965111897\", \"sheetType\":\"056\"}}";*/

    	/*//测试bomc回复
    	String serverUri = url + "ngwfcontrol/ws/outter/bomcToSrRpy";
    	String input = "{\"params\":{\"compProp\":\"无性质\", \"isReplied\":\"是\", \"issueEliminatTime\":\"2017-09-20 16:00:00\", \"issueEliminatReason\":\"问题原因\", "
    			+ "\"dealDesc\":\"解决措施：客户原因,客户不理解/误解)决措施决措施决措施决措施\", \"dealResult\":\"已解决\", \"provCode\":\"00030016\", \"tenantId\":\"100000\"}, "
    			+ "\"object\":{\"serialNo\":\"20180503163058X258655449\", \"sheetType\":\"056\"}}";*/

        //测试bomc回复
//    	String serverUri = url + "ngwfcontrol/ws/outter/bomcToSrRpy";
//    	String input = "{\"params\":{\"compProp\":\"无性质\", \"isReplied\":\"是\", \"issueEliminatTime\":\"2017-09-20 16:00:00\", \"issueEliminatReason\":\"问题原因\", "
//    			+ "\"dealDesc\":\"解决措施：客户原因,客户不理解/误解)决措施决措施决措施决措施\", \"dealResult\":\"已解决\", \"provCode\":\"00030016\", \"tenantId\":\"100000\"}, "
//    			+ "\"object\":{\"serialNo\":\"20180503163058X258655449\", \"sheetType\":\"056\"}}";
    	
    	/*//测试bomc驳回
    	String serverUri = url + "ngwfcontrol/ws/outter/bomcToSrRjt";
    	String input = "{\"params\":{\"withdrawReason\":\"驳回意见111\", \"provCode\":\"00030016\", \"tenantId\":\"100000\"}, "
    			+ "\"object\":{\"serialNo\":\"20171031162713X433859247\", \"sheetType\":\"056\"}}";*/
    	
    	/*//测试bomc阶段回复
    	String serverUri = url + "ngwfcontrol/ws/outter/bomcToSrStageRpy";
    	String input = "{\"params\":{\"StepResult\":\"阶段回复啦啦啦啦啦啦\", \"provCode\":\"00030016\", \"tenantId\":\"100000\"}, "
    			+ "\"object\":{\"serialNo\":\"20180327175121X281335996\", \"sheetType\":\"056\"}}";*/

        //测试综调归档客服系统
		 /*String serverUri = url + "ngwfcontrol/ws/outter/midsToSrArchiveSR";
		 String input = "{\"params\":{\"serialNumber\":\"20171123173401X641919196\", \"provCode\":\"00030016\", \"tenantId\":\"100000\", \"faultFinishDate\":\"2017-11-17 09:13:52\"," +
				 " \"dealDesc\":\"综调回单描述\", \"dealPerson\":\"ZD0001\", \"dealDept\":\"000010003\", \"dealContact\":\"18755606455\", \"dspsOpinCutt\":\"处理意见\", \"respRsn\":\"0107\"," +
				 " \"respDeptId\":\"04\", \"respRsnLvlCd\":\"01\", \"srSatisfy\":\"01\", \"userSatisfy\":\"01\", \"unsatisfyReason\":\"8\"," +
				 " \"isValidComp\":\"0\", \"feedBackWay\":\"01\", \"feedBackReason\":\"1\", \"rslvExtentId\":\"2\"}, "
				 + "\"object\":{\"serialNo\":\"20171123173401X641919196\", \"sheetType\":\"056\"}}";*/

		 /*//测试立单
		 String serverUri = url + "ngwfcontrol/ws/outter/processInfo";
		 String input = "{\"params\":{\"rtlId\":\"201711231552594501495837\",\"acptChnlId\":\"1\", " +
			 "\"provCode\":\"00030016\", \"tenantId\":\"100000\", \"acptNum\":\"13899859344\"," +
				 " \"bizCntt\":\"新家宽测试派单功能，请直接归档;预处理内容：(1)端到端查询公告：是,(2)是否接受解释：是,(3)结束语：解释引导,(4)是否接受解释：否,(5)登录其他网站测试：解释引导,"+
				 "(6)宽带状态是否正常：是,(7)端到端查询公告：否,(8)使用上网助手或360卫士修复：解释引导,(9)自动获取DNS和IP设置：,(10)是否恢复正常：否,(11)核对NGBOSS/radius速率是否一致：否;"+
				 "上网账号:g13899859355；联系电话:13899859355\"," +
			 " \"acptUserName\":\"孙靖\", \"contactPhone\":\"13899859344\", " +
			 "\"concAddr\":\"昆明盘龙区龙泉路龙苑盛景9号楼1至4单元GF049号\", \"svcCity\":\"0871\", " +
			 "\"starLevel\":\"13\", \"srTypeId\":\"007002002002002002013\", \"acptModeCd\":\"01\", \"custTypeCd\":\"01\", " +
			 "\"brandNum\":\"g13899859344\", \"deptd\":\"家宽测试账号\", \"staffId\":\"YN0001\"}}";*/

        //测试立单
//		 String serverUri = url + "ngwfcontrol/ws/outter/processInfo";
//		 String input = "{\"params\":{\"rtlId\":\"201711231552594501495873\",\"acptChnlId\":\"1\", " +
//			 "\"provCode\":\"00030016\", \"tenantId\":\"100000\", \"acptNum\":\"13899859355\"," +
//				 " \"bizCntt\":\"新家宽测试派单功能，请直接归档;预处理内容：率是否一致\"," +
//			 " \"acptUserName\":\"孙靖\", \"contactPhone\":\"13899859355\", " +
//			 "\"concAddr\":\"昆明盘龙区龙泉路龙苑盛景9号楼1至4单元GF049号\", \"svcCity\":\"0871\", " +
//			 "\"starLevel\":\"13\", \"srTypeId\":\"007002002002002002011\",\"groupNm\":\"集团名称\",\"groupAddr\":\"集团地址\",\"acptModeCd\":\"01\", \"custTypeCd\":\"01\", " +
//			 "\"brandNum\":\"g13899859355\", \"deptd\":\"家宽测试账号\", \"staffId\":\"YN0001\"}}";

//		 		 String serverUri = url + "ngwfcontrol/ws/nsos/oldSysToNewSysSnd";
//		 String input = "{\"params\":{\"rtlId\":\"201711231552594501495873\",\"acptChnlId\":\"12\", " +
//				 "\"provCode\":\"00030016\",\"tenantId\":\"100000\", \"acptNum\":\"13899859355\", \"callingNum\":\"13899859355\",\"useWebFlag\":\"1\",\"custStargrdCd\":\"\"," +
//				 "\"bizCntt\":\"新家宽测试派单功能，请直接归档;预处理内容：(1)端到端查询公告\",\"acptUserName\":\"孙靖\", " +
//				 "\"contactPhone\":\"\",\"concPrsnName\":\"\",\"concAddr\":\"河南郑州米东区米东南路金坤新城小区36号楼1至4单元GF049号\"," +
//				 "\"srTypeId\":\"007002006006002003002\", \"acptModeCd\":\"01\", \"custTypeCd\":\"01\", " +
//				 "\"fullName\":\"\",\"custTypeCd\":\"家宽测试账号\",\"comment\":\"请处理\",\"acceptStaffId\":\"YN0001\",\"targetWorkGroup\":\"2017101900002\",\"handleStaffId\":\"YN0001\"}}";

		 /*String serverUri = url + "ngwfcontrol/ws/nsos/oldSysToNewSysArch";
         String input = "{\"params\":{\"rtlId\":\"20180211190648C105551761X\",\"OpType\":\"1\",\"comment\":\"归档\",\"dutyCasueGrade\":\"02\"," +
                 "\"dutyCasue\":\"01\",\"arcSrTypeId\":\"\",\"arcStaffId\":\"YN0001\",\"arcSatisfy\":\"0\",\"provCode\":\"00030016\",\"tenantId\":\"100000\"}}";*/

        //测试综调归档客服系统
//		 String serverUri = url + "ngwfcontrol/ws/outter/midsToSrArchiveSR";
//		 String input = "{\"params\":{\"serialNumber\":\"20171130200212X332396366\", \"provCode\":\"00030016\", \"tenantId\":\"100000\", \"faultFinishDate\":\"2017-11-17 09:13:52\"," +
//				 " \"dealDesc\":\"综调回单描述\", \"dealPerson\":\"ZD0001\", \"dealDept\":\"000010003\", \"dealContact\":\"18755606455\", \"dspsOpinCutt\":\"处理意见\", \"respRsn\":\"0107\"," +
//				 " \"respDeptId\":\"04\", \"respRsnLvlCd\":\"01\", \"srSatisfy\":\"01\", \"userSatisfy\":\"01\", \"unsatisfyReason\":\"8\"," +
//				 " \"isValidComp\":\"0\", \"feedBackWay\":\"01\", \"feedBackReason\":\"1\", \"rslvExtentId\":\"2\"}, "
//				 + "\"object\":{\"serialNo\":\"20171130200212X332396366\", \"sheetType\":\"056\"}}";

    	 /*//测试综调归档客服系统
		 String serverUri = url + "ngwfcontrol/ws/outter/midsToSrArchive";
		 String input = "{\"params\":{\"serialNumber\":\"20171130200212X332396366\", \"provCode\":\"00030016\", \"tenantId\":\"100000\", \"faultFinishDate\":\"2017-11-17 09:13:52.0\"," +
				 " \"dealDesc\":\"回单备注：已解决故障，重新熔接后恢复正常\", \"dealPerson\":\"\", \"dealDept\":\"\", \"dealContact\":\"\", \"dspsOpinCutt\":\"重新熔接后恢复正常\", \"respRsn\":\"406\"," +
				 " \"respDeptId\":\"01\", \"respRsnLvlCd\":\"01\", \"srSatisfy\":\"01\", \"userSatisfy\":\"01\", \"unsatisfyReason\":\"6\"," +
				 " \"isValidComp\":\"1\", \"feedBackWay\":\"01\", \"feedBackReason\":\"11\", \"rslvExtentId\":\"1\"}, "
				 + "\"object\":{\"serialNo\":\"20171130200212X332396366\", \"sheetType\":\"056\"}}";*/

//		 String serverUri = url + "ngwfcontrol/ws/outter/midsToPlaceReturn";
//		 String input = "{\"params\":{\"serialNumber\":\"20171211104123X835659160\", \"workOrderId\":\"1001002352\", \"operationType\":\"2\",\"faultFinishDate\":\"2017-11-28 09:13:52\"," +
//				 "\"dealDesc\":\"综调反单\",\"dealPerson\":\"韩**\",\"dealDept\":\"专线组\",\"dealContact\":\"13226142857\",\"provCode\":\"00030016\",\"tenantId\":\"100000\"}}";

    	 /*//测试外系统驳回
		 String serverUri = url + "ngwfcontrol/ws/outter/outSysToSrRjt";
		 String input = "{\"params\":{\"rltWrkfmId\":\"20171221194658X818266266\", \"sysCode\":\"OAUP\", \"opDesc\":\"操作意见：我要退回\", "
			 		+ "\"provCode\":\"00030016\", \"tenantId\":\"100000\"}, \"beans\":["
			 		+ "{\"fctNo\":\"replyCorp\", \"fctNm\":\"回复单位\", \"fctVal\":\"1001002352\"},"
			 		+ "{\"fctNo\":\"replyPerson\", \"fctNm\":\"回复人\", \"fctVal\":\"韩**\"},"
			 		+ "{\"fctNo\":\"replyDepart\", \"fctNm\":\"回复人所属部门\", \"fctVal\":\"专线组\"},"
			 		+ "{\"fctNo\":\"replyContact\", \"fctNm\":\"回复人联系方式\", \"fctVal\":\"13226142857\"},"
			 		+ "{\"fctNo\":\"replyTime\", \"fctNm\":\"回复时间\", \"fctVal\":\"2017-11-28 09:13:52\"},"
					+ "{\"fctNo\":\"endResult\", \"fctNm\":\"最终处理结果\", \"fctVal\":\"完美\"}]}";*/

		 /*//测试外系统阶段通知
		 String serverUri = url + "ngwfcontrol/ws/outter/outSysToSrStageRpy";
		 String input = "{\"params\":{\"rltWrkfmId\":\"20171221194658X818266266\", \"sysCode\":\"OAUP\", \"opDesc\":\"操作意见：我要阶段回复\", "
			 		+ "\"provCode\":\"00030016\", \"tenantId\":\"100000\"}, \"beans\":["
			 		+ "{\"fctNo\":\"replyCorp\", \"fctNm\":\"回复单位\", \"fctVal\":\"1001002352\"},"
			 		+ "{\"fctNo\":\"replyPerson\", \"fctNm\":\"回复人\", \"fctVal\":\"韩**\"},"
			 		+ "{\"fctNo\":\"replyDepart\", \"fctNm\":\"回复人所属部门\", \"fctVal\":\"专线组\"},"
			 		+ "{\"fctNo\":\"replyContact\", \"fctNm\":\"回复人联系方式\", \"fctVal\":\"13226142857\"},"
			 		+ "{\"fctNo\":\"replyTime\", \"fctNm\":\"回复时间\", \"fctVal\":\"2017-11-28 09:13:52\"},"
					+ "{\"fctNo\":\"endResult\", \"fctNm\":\"最终处理结果\", \"fctVal\":\"完美\"}]}";*/

		 /*//测试外系统回复
		 String serverUri = url + "ngwfcontrol/ws/outter/outSysToSrRpy";
		 String input = "{\"params\":{\"rltWrkfmId\":\"20171227164615X375542231\", \"sysCode\":\"OAUP\", \"opDesc\":\"操作意见：我要回复\", "
			 		+ "\"provCode\":\"00030016\", \"tenantId\":\"100000\"}, \"beans\":["
			 		+ "{\"fctNo\":\"replyCorp\", \"fctNm\":\"回复单位\", \"fctVal\":\"1001002352\"},"
			 		+ "{\"fctNo\":\"replyPerson\", \"fctNm\":\"回复人\", \"fctVal\":\"韩**\"},"
			 		+ "{\"fctNo\":\"replyDepart\", \"fctNm\":\"回复人所属部门\", \"fctVal\":\"专线组\"},"
			 		+ "{\"fctNo\":\"replyContact\", \"fctNm\":\"回复人联系方式\", \"fctVal\":\"13226142857\"},"
			 		+ "{\"fctNo\":\"replyTime\", \"fctNm\":\"回复时间\", \"fctVal\":\"2017-11-28 09:13:52\"},"
					+ "{\"fctNo\":\"endResult\", \"fctNm\":\"最终处理结果\", \"fctVal\":\"完美\"}]}";*/

        //综调反单
//         String serverUri = url + "ngwfcontrol/ws/outter/midsToPdlcRtnOrRly";
//         String input = "{\"params\":{\"serialNumber\":\"20171214170649X409217635\",\"workOrderId\":\"1112qaz\",\"operationType\":\"2\",\"faultFinishDate\":\"2017-12-18 09:13:52\"," +
//                 "\"dealDesc\":\"综调反单\",\"dealPerson\":\"韩**\",\"dealDept\":\"专线组\",\"dealContact\":\"13226142857\",\"provCode\":\"00030016\",\"tenantId\":\"100000\"}}";
        //综调反单
//         String serverUri = url + "ngwfcontrol/ws/outter/midsToPdlcRtnOrRly";
//         String input = "{\"params\":{\"serialNumber\":\"20171214170649X409217635\",\"workOrderId\":\"1112qaz\",\"operationType\":\"2\",\"faultFinishDate\":\"2017-12-18 09:13:52\"," +
//                 "\"dealDesc\":\"综调反单\",\"dealPerson\":\"韩**\",\"dealDept\":\"专线组\",\"dealContact\":\"13226142857\",\"provCode\":\"00030016\",\"tenantId\":\"100000\"}}";

		 /*//测试质检
		 String serverUri = url + "ngwfcontrol/ws/outter/updateQualityResult";
		 String input = "{\"params\":{\"tenantId\":\"100000\",\"provCode\":\"00030016\",\"wrkfmId\":\"1000044020\","
			+ "\"acceptMonth\":\"2018-02-01\",\"qulteamTag\":\"1\",\"qulteamStaffNum\":\"HU0001\",\"qulteamSwftNo\":\"123\"}}";*/

        //测试质检-
//		 String serverUri = url + "ngwfcontrol/ws/outter/qrySrWorkitemInfo";
//		 String input = "{\"params\":{\"tenantId\":\"100000\",\"provCode\":\"00030016\",\"wrkfmId\":\"1000043560\"" +
//				 ",\"acceptMonth\":\"2018-02-01 10:49:31\"}}";

        //		 测试质检-
//		 String serverUri = url + "ngwfcontrol/ws/outter/qrySrWorkitemInfo";
//		 String input = "{\"params\":{\"tenantId\":\"100000\",\"provCode\":\"00030016\",\"wrkfmId\":\"1000044246\"" +
//				 ",\"acceptMonth\":\"2018-03-01\"}}";
        //自动归档综调
//		 String serverUri = url + "ngwfcontrol/ws/basesr/task/common/autoCSVCArchiveTaskCommon";
        // String input = "{\"params\":{\"tenantId\":\"100000\",\"provCode\":\"00030016\"}}";

        //测试自动派单
//		 String serverUri = url + "ngwfcontrol/ws/basesr/task/common/autoToCSSLSendTaskCommon";

        //测试通用外系统回复
//		 String serverUri = url + "ngwfcontrol/ws/basesr/task/common/autoCSVCArchiveTaskCommon";
//		 String input = "{\"params\":{\"rltWrkfmId\":\"20180420162603X763608230\",\"opTypeCd\":\"919\", \"sysCode\":\"COMMIDS\", \"opDesc\":\"操作意见：我要回复\", "
//				 + "\"provCode\":\"00030016\", \"tenantId\":\"100000\"}}";

        //回访工单生成的task
//		 String serverUri = url + "ngwfcontrol/ws/basesr/task/common/remedyWrkfmTask";
//		 String input = "{\"params\":{\"tenantId\":\"100000\",\"provCode\":\"00030016\"}}";
        //测试人工回访记录接口
//		 String serverUri = url + "ngwfcontrol/ws/outter/updateRevstDataToSr";
//		 String input = "{\"params\":{\"wrkfmSwftno\":\"1000044818\",\"opStaffId\":\"YN0001\", \"opOrgBrnchId\":\"00030009\", \"wrkfmFdbkModeCd\":\"1\", "
//				 + "\"provCode\":\"00030016\", \"tenantId\":\"100000\", \"nCnectRsnDesc\":\"2\", \"nSuccCmnctRsnDesc\":\"2\", \"needlRevstRsnDesc\":\"16\"" +
//				 ", \"isudSatisSmsFlag\":\"1\", \"falseRplFlag\":\"1\", \"rslvFlag\":\"1\", \"dspsProcSatisDgrId\":\"1\", " +
//				 "\"nSatisRsnDesc\":\"1\", \"rsnDesc\":\"测试1212\", \"custAdviceDesc\":\"测试客户建议\", \"cuseCustAdviceDesc\":\"测试客户建议2\"" +
//				 ", \"responsibleRsnDesc\":\"2\", \"genrtWrkfmFlag\":\"0\", \"prevNodeEvaluation\":\"500\"}}";

        //测试通用外系统回复(综调)
        String serverUri = url + "ngwfcontrol/ws/outter/comOutSysToSrRly";
        String input = "{\"params\":{\"rltWrkfmId\":\"20180515091046X646047489\",\"opTypeCd\":\"919\", \"sysCode\":\"WARNSYS\", \"opDesc\":\"操作意见：测试重派PBOSS我要回复111\", "
                + "\"provCode\":\"00030016\", \"tenantId\":\"100000\"}}";

		 /*//测试外系统归档task
         String serverUri = url + "ngwfcontrol/ws/baser/task/common/autoOutSysArchive";
         String input = "{\"params\":{\"provCode\":\"00030016\", \"tenantId\":\"100000\"}}";*/

        String type = "POST";
        doTest(serverUri, input, type);

    }

    public static void doTest(String serverUri,String input,String type) throws Exception{
        MessageInfo messageInfo = new MessageInfo(serverUri, "com.cmos.esb.user.ngwf", input, RestMethodType.GET);
        if ("GET".equals(type)) {
            messageInfo = new MessageInfo(serverUri, "com.cmos.esb.user.ngwf", input, RestMethodType.GET);
        } else if ("PUT".equals(type)) {
            messageInfo = new MessageInfo(serverUri, "com.cmos.esb.user.ngwf", input, RestMethodType.PUT);
        } else if ("POST".equals(type)) {
            messageInfo = new MessageInfo(serverUri, "com.cmos.esb.user.ngwf", input, RestMethodType.POST);
        } else if ("DELETE".equals(type)) {
            messageInfo = new MessageInfo(serverUri, "com.cmos.esb.user.ngwf", input, RestMethodType.DELETE);
        } else {

        }
        String result;
        try {
            result = RestClientUtil.invoke(messageInfo);
            System.out.println("result = "+ result);
        } catch (Exception e) {
            logger.error(e.getMessage(),e);
        }
    }




}

