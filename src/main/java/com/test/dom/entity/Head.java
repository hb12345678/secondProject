package com.test.dom.entity;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Head {
    @XStreamAlias("id")
    private String id;
    @XStreamAlias("wsid")
    private String wsid;
    @XStreamAlias("sendtime")
    private String sendtime;
    @XStreamAlias("code")
    private String code;
    @XStreamAlias("msg")
    private String msg;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWsid() {
        return wsid;
    }

    public void setWsid(String wsid) {
        this.wsid = wsid;
    }

    public String getSendtime() {
        return sendtime;
    }

    public void setSendtime(String sendtime) {
        this.sendtime = sendtime;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Head{" +
                "log_id='" + id + '\'' +
                ", wsid='" + wsid + '\'' +
                ", sendtime='" + sendtime + '\'' +
                ", code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
