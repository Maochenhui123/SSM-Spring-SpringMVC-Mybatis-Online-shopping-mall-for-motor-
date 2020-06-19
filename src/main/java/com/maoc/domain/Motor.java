package com.maoc.domain;

import java.io.Serializable;

public class Motor implements Serializable {
    private String type;
    private String name;
    private String model;
    private String wet;
    private String capacity;
    private String seat;
    private String photo;
    private String price;
    private String subtitle;
    private String content;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getWet() {
        return wet;
    }

    public void setWet(String wet) {
        this.wet = wet;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = "/img/"+photo+"_info.jpg";;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", wet='" + wet + '\'' +
                ", capacity='" + capacity + '\'' +
                ", seat='" + seat + '\'' +
                ", photo='" + photo + '\'' +
                ", price='" + price + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
