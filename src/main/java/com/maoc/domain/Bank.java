package com.maoc.domain;

import java.io.Serializable;

public class Bank implements Serializable {
    private String cardId;
    private String balance;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "cardId='" + cardId + '\'' +
                ", balance='" + balance + '\'' +
                '}';
    }
}
