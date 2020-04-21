package ru.example.service.model;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "id",
        "Box",
        "Item"
})
public class Box {
    @XmlAttribute
    private String id;
    private List<Box> Box;
    private List<Item> Item;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Box> getBox() {
        return Box;
    }

    public void setBox(List<Box> box) {
        Box = box;
    }

    public List<Item> getItem() {
        return Item;
    }

    public void setItem(List<Item> item) {
        Item = item;
    }

    @Override
    public String toString() {
        return "Box{" +
                "id='" + id + '\'' +
                ", Box=" + Box +
                ", Item=" + Item +
                '}';
    }
}
