package ru.example.service.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "Box",
        "Item"
})
@XmlRootElement(name = "Storage")
public class Storage {
    private List<Box> Box;
    private List<Item> Item;

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
        return "Storage{" +
                "Box=" + Box +
                ", Item=" + Item +
                '}';
    }
}
