package com.test.dom.entity;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.Iterator;
import java.util.List;


public class Test {
    public static void main(String[] args) {
        xmlstream();
    }

    public static void xmlstream(){
        Data a = Util.transXmlToObject("<data>\n" +
                "    <head>\n" +
                "        <id>be0fa064-60eb-474c-9f22-8616a5b36790hui</id>\n" +
                "        <wsid>SLIS_NB_20190906_05</wsid>\n" +
                "        <sendtime>201909060955</sendtime>\n" +
                "        <code>0</code>\n" +
                "        <msg>成功</msg>\n" +
                "    </head>\n" +
                "    <body>\n" +
                "        <nbdetail>\n" +
                "            <prtno>10028740023001987</prtno>\n" +
                "            <appntname>林美</appntname>\n" +
                "            <insuredname>孝顺宝</insuredname>\n" +
                "            <polapplydate>2019-09-06</polapplydate>\n" +
                "            <signdate>2018-03-08</signdate>\n" +
                "            <totask>契约作业通知书</totask>\n" +
                "            <contno>138947324983204i2</contno>\n" +
                "        </nbdetail>\n" +
                "        <nbdetail>\n" +
                "            <prtno>10003034237532494234</prtno>\n" +
                "            <appntname>王微微</appntname>\n" +
                "            <insuredname>一路阳光</insuredname>\n" +
                "            <polapplydate>2018-05-02</polapplydate>\n" +
                "            <signdate>2018-09-01</signdate>\n" +
                "            <totask>核保决定通知书</totask>\n" +
                "            <contno>2347978495u0482349</contno>\n" +
                "        </nbdetail>\n" +
                "    </body>\n" +
                "</data>");
        System.out.println("&&&&&&&---->"+JSON.toJSON(a));
        System.out.println("<---------&&&&&&&&&&&&&&");
        System.out.println(JSON.toJSONString(a));
        System.out.println(a.toString());
        System.out.println("头对象提取"+a.getHead().toString());
        System.out.println("头对象具体的某个值:"+a.getHead().getMsg());
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        List<NBnbdetail> nb = (a.getBody().getNbdetail());
        System.out.println("?????????"+nb+"???????");
        for(NBnbdetail result : nb){
            System.out.println("<<<<<<<<<"+result.getAppntname()+">>>>>>>>>>>>>");
        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

    }

}

