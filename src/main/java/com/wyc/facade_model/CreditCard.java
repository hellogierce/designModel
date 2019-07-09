package com.wyc.facade_model;

public class CreditCard {
    String cardType;
    String cardNumber;
    String cardExpDate;

    public CreditCard(String cardType, String cardNumber, String cardExpDate) {
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.cardExpDate = cardExpDate;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardExpDate() {
        return cardExpDate;
    }

    public void setCardExpDate(String cardExpDate) {
        this.cardExpDate = cardExpDate;
    }
    public boolean isValid(){
        System.out.println("creditcard 验证通过!");
        return true;
    }
    public boolean save(){
        System.out.println("creditcard 成功保存!");
        return true;
    }
}
