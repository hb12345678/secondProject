package com.test.dom.entity;

import com.thoughtworks.xstream.XStream;

public class Util {

    public static Data transXmlToObject(String xmlBody){
        XStream xStream = new XStream();
        xStream.alias("data", Data.class);
        xStream.alias("head", Head.class);
        xStream.alias("body", Body.class);
        xStream.alias("nbdetail", NBnbdetail.class);
        xStream.processAnnotations(new Class[]{Data.class, Head.class, Body.class, NBnbdetail.class});

        Object object = xStream.fromXML(xmlBody);
        Data data = (Data) object;
        return data;
    }
}
