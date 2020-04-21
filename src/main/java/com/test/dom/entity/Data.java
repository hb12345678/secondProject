package com.test.dom.entity;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Data {
    private static final String headInfo="<?xml version=\"1.0\" encoding=\"utf-8\"?>";
    @XStreamAlias("head")
    private Head head;
    @XStreamAlias("body")
    private Body body;

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Data{" +
                "head=" + head +
                ", body=" + body +
                '}';
    }
}
