package com.test.dom.entity;

import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

public class Body {
    @XStreamImplicit(itemFieldName="nbdetail")
    private List<NBnbdetail> nbdetail;

    public List<NBnbdetail> getNbdetail() {
        return nbdetail;
    }

    public void setNbdetail(List<NBnbdetail> nbdetail) {
        this.nbdetail = nbdetail;
    }

    @Override
    public String toString() {
        return "Body{" +
                "nbdetail=" + nbdetail +
                '}';
    }
}
