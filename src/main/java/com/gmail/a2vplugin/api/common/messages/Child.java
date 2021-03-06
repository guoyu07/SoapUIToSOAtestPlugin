
package com.gmail.a2vplugin.api.common.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "child", propOrder = { "id", "name", "hasChildren", "url", "type", "referenced", "typeData" })
public class Child {

    protected String id;
    protected String name;
    protected boolean hasChildren;
    protected String url;
    protected String type;
    protected boolean referenced;
    protected TypeData typeData;

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public Boolean isHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(Boolean value) {
        this.hasChildren = value;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String value) {
        this.url = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

    public Boolean isReferenced() {
        return referenced;
    }

    public void setReferenced(Boolean value) {
        this.referenced = value;
    }

    public TypeData getTypeData() {
        return typeData;
    }

    public void setTypeData(TypeData value) {
        this.typeData = value;
    }

}
