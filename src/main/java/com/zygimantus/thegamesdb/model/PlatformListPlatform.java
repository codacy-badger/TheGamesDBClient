package com.zygimantus.thegamesdb.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Platform")
public class PlatformListPlatform {

    private int id;
    private String name;
    private String alias;

    public int getId() {
        return id;
    }

    @XmlElement(name = "id")
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @XmlElement(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    @XmlElement(name = "alias")
    public void setAlias(String alias) {
        this.alias = alias;
    }
}
