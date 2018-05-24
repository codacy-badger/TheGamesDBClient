package com.zygimantus.thegamesdb.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class GameImage {

    protected String side;
    protected int width;
    protected int height;
    protected String thumb;
    protected String url;

    public String getSide() {
        return side;
    }

    @XmlAttribute(name = "side")
    public void setSide(String side) {
        this.side = side;
    }

    public int getWidth() {
        return width;
    }

    @XmlAttribute(name = "width")
    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    @XmlAttribute(name = "height")
    public void setHeight(int height) {
        this.height = height;
    }

    public String getThumb() {
        return thumb;
    }

    @XmlAttribute(name = "thumb")
    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getUrl() {
        return url;
    }

    @XmlValue
    public void setUrl(String url) {
        this.url = url;
    }
}
