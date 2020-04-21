package com.test.dom.entity;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("nbdetail")
public class NBnbdetail {
    @XStreamAlias("prtno")
    private String prtno;
    @XStreamAlias("appntname")
    private String appntname;
    @XStreamAlias("insuredname")
    private String insuredname;
    @XStreamAlias("polapplydate")
    private String polapplydate;
    @XStreamAlias("signdate")
    private String signdate;
    @XStreamAlias("totask")
    private String totask;
    @XStreamAlias("contno")
    private String contno;

    public String getPrtno() {
        return prtno;
    }

    public void setPrtno(String prtno) {
        this.prtno = prtno;
    }

    public String getAppntname() {
        return appntname;
    }

    public void setAppntname(String appntname) {
        this.appntname = appntname;
    }

    public String getInsuredname() {
        return insuredname;
    }

    public void setInsuredname(String insuredname) {
        this.insuredname = insuredname;
    }

    public String getPolapplydate() {
        return polapplydate;
    }

    public void setPolapplydate(String polapplydate) {
        this.polapplydate = polapplydate;
    }

    public String getSigndate() {
        return signdate;
    }

    public void setSigndate(String signdate) {
        this.signdate = signdate;
    }

    public String getTotask() {
        return totask;
    }

    public void setTotask(String totask) {
        this.totask = totask;
    }

    public String getContno() {
        return contno;
    }

    public void setContno(String contno) {
        this.contno = contno;
    }

    @Override
    public String toString() {
        return "NBnbdetail{" +
                "prtno='" + prtno + '\'' +
                ", appntname='" + appntname + '\'' +
                ", insuredname='" + insuredname + '\'' +
                ", polapplydate='" + polapplydate + '\'' +
                ", signdate='" + signdate + '\'' +
                ", totask='" + totask + '\'' +
                ", contno='" + contno + '\'' +
                '}';
    }
}
