
package com.gmail.a2vplugin.api.files.tsts.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.Parent;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tstsRequest", propOrder = { "name", "parent" })
public class TstsRequest {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected Parent parent;

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent value) {
        this.parent = value;
    }

}
