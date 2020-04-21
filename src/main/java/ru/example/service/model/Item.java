package ru.example.service.model;

import javax.persistence.Entity;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "id",
        "color"
})
public class Item {

    @XmlAttribute
    private String id;
    @XmlAttribute
    private String color;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
