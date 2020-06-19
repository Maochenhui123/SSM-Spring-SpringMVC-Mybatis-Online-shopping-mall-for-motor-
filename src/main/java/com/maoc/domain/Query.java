package com.maoc.domain;

import java.io.Serializable;

public class Query implements Serializable {
    private String name;
    private String balanceNum;
    private String dealer;
    private String photo;


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setBalanceNum(String balanceNum){
        this.balanceNum = balanceNum;
    }

    public String getBalanceNum(){
        return balanceNum;
    }

    public void setDealer(String dealer){
        this.dealer = dealer;
    }

    public String getDealer(){
        return dealer;
    }

    public void setPhoto(String photo){
        this.photo = "./img/"+photo+"_info.jpg";
    }

    public String getPhoto(){
        return photo;
    }

    @Override
    public String toString() {
        return "Query{" +
                "name='" + name + '\'' +
                ", balanceNum='" + balanceNum + '\'' +
                ", dealer='" + dealer + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}
